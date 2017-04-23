package com.bramantio.ubay.webapp.services.implementation;

import com.bramantio.ubay.webapp.services.ConnectionService;
import com.bramantio.ubay.webapp.util.ConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class ConnectionSeviceImpl implements ConnectionService{
    private ConnectionUtil connectionUtil = new ConnectionUtil();
    public ResultSet select(String column, String table, String columnCondition, String conditionValue) {
        String selectStatement;
        ResultSet resultSet = null;
        Statement statement;

        if (columnCondition.equals("")) {
            selectStatement = "SELECT " + column + " FROM " + table + ";";
        } else {
            selectStatement = "SELECT " + column + " FROM " + table + " WHERE " + columnCondition + " = '" + conditionValue + "';";
        }
        try {
            statement = connectionUtil.connect().createStatement();
            resultSet = statement.executeQuery(selectStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
