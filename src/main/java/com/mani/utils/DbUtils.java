package com.mani.utils;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Resource(name = "dbUtils")
public class DbUtils {
    // db parameters
    public static final String url = "jdbc:sqlite:/Users/manibh/Workspaces/sqlite/my-sqlite.db";
    public DbUtils(){
        init();
    }
    public Connection connect() {
        Connection conn = null;
        try {



            //load sqlight class
//            Class.forName("org.sqlite.JDBC");
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println("SQLException" + e.getMessage());
        }
      /*  catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException " + e.getMessage());
        }*/
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    protected void init(){
//        CREATE TABLE sqlite_sequence(name,seq)
//        CREATE TABLE `files` ( `id` INTEGER PRIMARY KEY AUTOINCREMENT, `filename` TEXT, `filepath` TEXT )
    }
}
