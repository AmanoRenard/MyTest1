package pers.amanorenard.homeworks.dailytraining.y22m5.day30;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        //启动
        new Thread(new receiveFile(),"接收").start();
        new Thread(new transFile(),"发送").start();
        new Scanner(System.in).next(); // 按任意键退出
    }
}

//发送文件
class transFile implements Runnable {
    @Override
    public void run() {
        ServerSocket ss = null;
        Socket s = null;
        OutputStream os = null;
        BufferedInputStream bis = null;
        try {
            // 创建ServerSocket对象
            ss = new ServerSocket(6666);
            // 等待客户端发送请求
            System.out.println("正在建立连接...");
            s = ss.accept();

            os = s.getOutputStream();
            // 从本地读取文件
            bis = new BufferedInputStream(new FileInputStream("666\\test.jpeg"));
            byte[] bys = new byte[1024];
            int len;
            System.out.println("文件发送中...");
            while ((len = bis.read(bys))!=-1) {
                os.write(bys,0,len);
            }
            System.out.println("文件发送完毕。");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class receiveFile implements Runnable {
    @Override
    public void run() {
        // 初始化
        Socket s = null;
        InputStream is = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            s = new Socket(InetAddress.getLocalHost(),6666);
            // 将接收到的数据存储到 “D:\lbwnb.jpeg” 中
            bos = new BufferedOutputStream(fos = new FileOutputStream("666\\testOut.jpeg"));
            System.out.println("正在建立连接...");
            is = s.getInputStream();
            System.out.println("连接成功，正在传输文件...");
            byte[] bys = new byte[1024];
            int len;
            while((len = is.read(bys))!= -1) {
                bos.write(bys,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}