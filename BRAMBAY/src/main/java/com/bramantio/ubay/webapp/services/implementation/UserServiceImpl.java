package com.bramantio.ubay.webapp.services.implementation;

import com.bramantio.ubay.webapp.dto.UserDTO;
import com.bramantio.ubay.webapp.services.UserSevice;
import com.bramantio.ubay.webapp.util.ConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hi!
 * Created by captain_n3mo on 24/04/2017.
 */
public class UserServiceImpl implements UserSevice {
    ConnectionUtil connectionUtil = new ConnectionUtil();
    private String sql;
    PreparedStatement preparedStatement;

    public Boolean saveUser(UserDTO userDTO) {
        Boolean result = Boolean.FALSE;
        sql = "INSERT INTO USER_MODEL VALUES(?,?,?)";
        try{
            preparedStatement = connectionUtil.connect().prepareStatement(sql);
            preparedStatement.setString(1, userDTO.getUserName());
            preparedStatement.setString(2, userDTO.getUserPhone());
            preparedStatement.setString(3,userDTO.getUserEmail());
            int successfully = preparedStatement.executeUpdate();
            if (successfully > 0) {
                result = Boolean.TRUE;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public UserDTO getUser(String name) {

        return null;
    }
}
