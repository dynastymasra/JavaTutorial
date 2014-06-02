package org.dynastymasra.javalearning.database.tot;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Main {
    private final static String URL = "jdbc:mysql://localhost:3306/tot";
    private final static String USER = "root";
    private final static String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connection Success!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
