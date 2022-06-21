package pers.amanorenard.homeworks.dailytraining.y22m6.day21;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) {

        // 1. 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. 获取连接

        String url = "jdbc:mysql://127.0.0.1:3306/db2";
        String user = "root";
        String password = "233333";

        try (Connection conn = DriverManager.getConnection(url,user,password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select id,aname,money from account")) {
            while (rs.next()) {
                System.out.println(rs.getString("id") + ", " + rs.getString("aname") + "," + rs.getString("money"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

