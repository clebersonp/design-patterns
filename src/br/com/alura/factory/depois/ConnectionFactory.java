package br.com.alura.factory.depois;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * O pattern builder e factory, ambos sao para resolver problemas de criacao de objetos.
 * O builder permiter vc customizar o objeto durante a sua criacao, ou seja, permite
 * passar muitas informacoes para se criar um objeto complexo
 * 
 * O pattern factory tbm prove um objeto, atraves de um fabrica, e que nao precisa passar
 * muitas informacoes que ele sabera como criar os objetos.
 * 
 * Ambos definimos as responsabilidades para criar um objeto a suas classes que os criam.
 */

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String tipoBanco = System.getProperty("tipoBanco");
            Connection connection = 
                            DriverManager.getConnection("jdbc:" + tipoBanco + "://localhost:3306/banco", "usuario", "senha");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}