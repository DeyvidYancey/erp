/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Deyvid
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/erp?user=root&password=12345678&serverTimezone=UTC & characterEncoding = UTF-8 & useUnicode = yes");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
