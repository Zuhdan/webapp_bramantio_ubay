package com.bramantio.ubay.webapp.services;

import java.sql.ResultSet;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public interface ConnectionService {

      ResultSet select(String column, String table,String columnCondition, String conditionValue);

}
