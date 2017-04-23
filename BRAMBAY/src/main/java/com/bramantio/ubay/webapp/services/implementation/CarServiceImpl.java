package com.bramantio.ubay.webapp.services.implementation;

import com.bramantio.ubay.webapp.dto.CarModelDTO;
import com.bramantio.ubay.webapp.services.CarService;
import com.bramantio.ubay.webapp.util.ConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class CarServiceImpl implements CarService{

    private ConnectionUtil connectionUtil = new ConnectionUtil();
    private String sql;
    Statement statement;
    ResultSet resultSet;

    public List<String> showCarName() {
        List<String> result = new ArrayList<String>();
        sql = "SELECT CAR_NAME FROM CAR_MODEL";
        try {
            statement = connectionUtil.connect().createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                result.add(resultSet.getString("CAR_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectionUtil.disconnect();
        return result;
    }

    public CarModelDTO findDetail(String name) {
        CarModelDTO carModelDTO = new CarModelDTO();
        sql = "SELECT * FROM CAR_MODEL WHERE CAR_NAME='" + name + "'";
        try {
            statement = connectionUtil.connect().createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                carModelDTO.setCarId(resultSet.getInt("CAR_ID"));
                carModelDTO.setCarName(resultSet.getString("CAR_NAME"));
                carModelDTO.setCarDescription(resultSet.getString("CAR_DETAIL"));
                carModelDTO.setCarUrl(resultSet.getString("CAR_IMAGE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectionUtil.disconnect();
        return carModelDTO;
    }
}
