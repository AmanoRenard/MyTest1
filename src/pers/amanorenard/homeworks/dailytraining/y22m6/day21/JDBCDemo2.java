package pers.amanorenard.homeworks.dailytraining.y22m6.day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

class JDBCDemo2{
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResourceBundle rb = ResourceBundle.getBundle("resource/db");
        String
                driver = rb.getString("driver"),
                url = rb.getString("url"),
                user = rb.getString("user"),
                password = rb.getString("password");
        System.out.println(driver);
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select e.ename,e.salary,d.dname,j.jname,j.description,s.grade from emp e, job j, dept d, salarygrade s where e.dept_id = d.id and e.job_id = j.id and e.salary between s.losalary and s.hisalary order by e.salary");
            while (rs.next()) {
                System.out.println(rs.getString("e.ename")+", "+rs.getString("d.dname")+", "+rs.getString("j.jname")+", "+rs.getString("j.description")+", "+rs.getString("e.salary")+", "+ rs.getString("s.grade"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}