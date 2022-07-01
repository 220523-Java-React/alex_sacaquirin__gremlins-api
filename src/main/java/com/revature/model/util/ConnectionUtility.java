package com.revature.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
        private static final String URL="jdbc:postgres://localhost:5432/postgres?current=postgres";
        private static final String USER = "postgres";
        private static final String PASSWORD = "1234";
        private static Connection instance;

        public static Connection getInstance() throws SQLException {
            if(instance == null) {
                instance= DriverManager.getConnection(URL,USER,PASSWORD);
            }

            return instance;

        }

        private ConnectionUtility(){}

    }

