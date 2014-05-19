package org.dynastymasra.javalearning.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class DatabaseConnection {
    private final static String url = "jdbc:mysql://localhost:3306/sc_study_club";
    private final static String user = "root";
    private final static String pass = "";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            System.out.println("Database Connection Failed:" + ex.getMessage());
        }
        return connection;
    }
}
