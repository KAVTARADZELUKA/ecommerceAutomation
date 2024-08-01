package org.example.utils;

import java.sql.*;

public class DatabaseUtils {
    private static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/ecommerce_db";
            String username = "root";
            String password = "password";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, username, password);
        }
        return connection;
    }

    public static ResultSet executeQuery(String query) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = null;
        PreparedStatement statement = getConnection().prepareStatement(query);
        resultSet = statement.executeQuery();

        return resultSet;
    }

    public static int executeUpdate(String query) throws SQLException, ClassNotFoundException {
        int result = 0;
        PreparedStatement statement = getConnection().prepareStatement(query);
        result = statement.executeUpdate();

        return result;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
