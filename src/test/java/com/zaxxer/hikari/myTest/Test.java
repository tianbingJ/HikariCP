package com.zaxxer.hikari.myTest;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Before;

import java.sql.SQLException;

public class Test {

   private HikariConfig config;

   @Before
   public void init() {
      config = new HikariConfig();
      config.setUsername("root");
      config.setJdbcUrl("jdbc:mysql://localhost:3306/test?");
   }

   @org.junit.Test
   public void test() throws SQLException {
      HikariDataSource dataSource = new HikariDataSource(config);
      dataSource.getConnection();
   }
}
