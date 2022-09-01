package com.company;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class Test_Connection {
    @Test
    public void testConnection() throws SQLException {
        Driver driver = null;
        String  url = null;
        Properties info = null;
        Connection conn =  driver.connect(url,info);
        System.out.println(conn);
    }
}
