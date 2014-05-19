package org.dynastymasra.javalearning.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class Controller {
    private Connection connection;
    private Mahasiswa mahasiswa;

    public Controller() {
        connection = DatabaseConnection.getConnection();
        mahasiswa = new Mahasiswa();
    }

    public void showData() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `sc_mahasiswa` WHERE `mahasiswa_id` = ?");
        preparedStatement.setInt(1, 1);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            mahasiswa.setId(resultSet.getInt("mahasiswa_id"));
            mahasiswa.setNim(resultSet.getString("mahasiswa_nim"));
            mahasiswa.setName(resultSet.getString("mahasiswa_name"));
            mahasiswa.setEmail(resultSet.getString("mahasiswa_email"));
            mahasiswa.setBirth(resultSet.getString("mahasiswa_birth"));
            mahasiswa.setNumber(resultSet.getString("mahasiswa_number"));
            if (resultSet.getInt("mahasiswa_sex") == 0) {
                mahasiswa.setGender("Laki-Laki");
            } else {
                mahasiswa.setGender("Perempuan");
            }

            System.out.println("Id:" + mahasiswa.getId());
            System.out.println("NIM:" + mahasiswa.getNim());
            System.out.println("Name:" + mahasiswa.getName());
            System.out.println("Email:" + mahasiswa.getEmail());
            System.out.println("Birth:" + mahasiswa.getBirth());
            System.out.println("Gender:" + mahasiswa.getGender());
            System.out.println("Number:" + mahasiswa.getNumber());
        } else {
            System.out.println("No Data");
        }
    }
}
