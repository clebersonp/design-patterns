package br.com.alura.factory.test;

import java.sql.Connection;
import java.util.Properties;

import br.com.alura.factory.depois.ConnectionFactory;

public class TesteFactory {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("tipoBanco", "mysql");
        System.setProperties(props );
        
        Connection connection = new ConnectionFactory().getConnection();
    }
}