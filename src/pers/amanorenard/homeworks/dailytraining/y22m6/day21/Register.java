package pers.amanorenard.homeworks.dailytraining.y22m6.day21;

import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;

public final class Register {

    private Connection conn = null;
    private Statement stmt = null;
    private static String
            url = null,
            user = null,
            password = null;

    static {
        try {
            ResourceBundle rb = ResourceBundle.getBundle("resource/db");
            url = rb.getString("url");
            user = rb.getString("user");
            password = rb.getString("password");
            Class.forName(rb.getString("driver"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("初始化错误！");
        }
    }

    public Register() {
        try {
            System.out.println("正在连接…");
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            System.out.println("连接成功，您可以开始操作了！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接失败！");
            exit();
        }
    }

    private boolean checkLength(String name, String password) {
        if (password.length() > 12 || password.length() <6) {
            System.out.println("长度不正确(需要：6~12)！密码长度：" + password.length());
            return false;
        } else if (name.length() > 12 || name.length() < 3) {
            System.out.println("用户名长度不正确(需要：3~12)！用户名长度：" + name.length());
            return false;
        }
        return true;
    }

    public boolean signUp(String name, String password) {
        if (!checkLength(name, password)) return false;
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select uname from login where uname='"+name+"'");
            if (rs.next()) {
                System.out.println("用户已存在！");
                return false;
            } else {
                if (stmt.executeUpdate("insert into login(uname,password) values ('"+name+"','"+password+"')") > 0) {
                    System.out.println("注册成功！");
                    return true;
                }
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
        }
        System.out.println("错误：未正常执行。");
        return false;
    }

    public boolean logIn(String name, String password) {
        if (!checkLength(name, password)) return false;
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select password from login where uname='"+name+"'");
            if (!rs.next()) {
                System.out.println("用户不存在！");
                return false;
            }
            if (Objects.equals(rs.getString("password"), password)) {
                System.out.println("登陆成功！");
                return true;
            } else {
                System.out.println("登录失败，密码错误！");
                return false;
            }

        } catch (Exception e) {
            System.out.println("错误！");
            e.printStackTrace();
            return false;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void exit() {
        System.out.println("正在退出……");
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
        System.out.println("已退出。");
    }
}
