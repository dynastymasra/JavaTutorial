package org.dynastymasra.javalearning.database.tot;

import java.sql.*;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Main {
    private final static String URL = "jdbc:mysql://localhost:3306/travel?zeroDateTimeBehavior=convertToNull";
    private final static String USER = "root";
    private final static String PASSWORD = "";
    private static Connection connection;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connection Success!");

            String sql = "SELECT * FROM person";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println("--------------------------------------");
                System.out.println("Id : " + resultSet.getInt("personid"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("Job Title : " + resultSet.getString("jobtitle"));
                System.out.println("Frequent Flyer : " + resultSet.getInt("frequentflyer"));
                System.out.println("Last Update : " + resultSet.getDate("lastupdated"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
