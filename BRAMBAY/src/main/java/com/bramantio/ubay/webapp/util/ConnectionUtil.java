package com.bramantio.ubay.webapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class ConnectionUtil {

    private Boolean connected = Boolean.FALSE;
    private Connection connection = null;

    public ConnectionUtil() {
    }

    public Connection connect() {
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:testDB";
        String userName = "system";
        String password = "2024Milyader";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
            connected = Boolean.TRUE;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Connection disconnect() {
        if (connected) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
