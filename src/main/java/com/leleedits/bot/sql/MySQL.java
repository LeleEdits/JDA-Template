package com.leleedits.bot.sql;

import com.leleedits.bot.Bot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class MySQL {

    public Logger logger = LoggerFactory.getLogger(MySQL.class);

    public String HOST, DATABASE, USER, PASSWORD;
    public int PORT = 3306;

    public Connection connection;

    public MySQL(String host, String database, String user, String password) {
        this.HOST = host;
        this.DATABASE = database;
        this.USER = user;
        this.PASSWORD = password;
        connect();
    }

    public MySQL(String host, String database, String user, String password, int port) {
        this.HOST = host;
        this.DATABASE = database;
        this.USER = user;
        this.PASSWORD = password;
        this.PORT = port;
        connect();
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?autoReconnect=true", USER, PASSWORD);
            this.logger.info("Connected to MySQL database!");
        } catch (SQLException e) {
            this.logger.error("Failed while trying to connect to MySQL database:\n" + e.getMessage());
        }
    }

    public void close() {
        try {
            if (this.connection != null) {
                this.connection.close();
                this.logger.warn("Closed connection to MySQL database!");
            }
        } catch (SQLException e) {
            this.logger.error("Cant close connection to MySQL database:\n" + e.getMessage());
        }
    }

    public ResultSet query(String qry) throws SQLException {
        ResultSet rs = null;
        Statement st = this.connection.createStatement();
        rs = st.executeQuery(qry);
        return rs;
    }

    public int updateQuery(String qry) throws SQLException {
        int statusCode = 0;
        Statement st = this.connection.createStatement();
        statusCode = st.executeUpdate(qry);
        return statusCode;
    }
}
