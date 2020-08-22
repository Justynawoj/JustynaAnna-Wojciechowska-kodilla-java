package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", "
                    + rs.getString("FIRSTNAME")+ ", "
                    + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(5,counter);
    }
    @Test
    public void testSelectUser1and3() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS WHERE ID IN (1,3)";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", "
                    + rs.getString("FIRSTNAME")+ ", "
                    + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(2,counter);
    }


    // ----------- 16.6 --------------

    @Test
    public void testSelectUsersAndPost() throws SQLException {

        //Given
        DbManager dbM = DbManager.getInstance();

        //When
        Statement statement = dbM.getConnection().createStatement();
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME\n" +
                "FROM USERS U \n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >=2;";

        ResultSet rs = statement.executeQuery(sqlQuery);


        //Then
        int counter = 0;

        System.out.println("Users having at least 2 posts:");
        while (rs.next()) {
            System.out.println (rs.getString("FIRSTNAME")+ " "
                    + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(2,counter);
    }
}







