package com.dreamteam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

  static final String CONN_URL = "jdbc:sqlite:test.db";
  static final String USER = "user";
  static final String PASSWORD = "password";

  public static void main(String[] args) {

    Connection connection = null;

    try{
      connection = DriverManager.getConnection(CONN_URL);
      System.out.println("Connected");


    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
}