package br.com.alura.factory.antes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MinhaAplicacao {

    public static void main(String[] args) throws SQLException {
        
        Connection connection = 
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
        
        PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM .....");
        
        // codigo continua.....
        
    }
}