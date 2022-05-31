package com.leleedits.bot.sql;

public class MySQLManager {

    private static MySQL mySQL;

    public static MySQL getMySQL() {
        return mySQL;
    }

    public static void create(String host, String database, String user, String password, int port) {
        mySQL = new MySQL(host, database, user, password, port);
    }

    public static void create(String host, String database, String user, String password) {
        mySQL = new MySQL(host, database, user, password);
    }
}
