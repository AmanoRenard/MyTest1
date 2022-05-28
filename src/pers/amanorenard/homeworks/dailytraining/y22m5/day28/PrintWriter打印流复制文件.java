package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.*;

class PrintWriter打印流复制文件 {
    public static void main(String[] args) {
        try (
                BufferedReader bw = new BufferedReader(new FileReader("666\\Students.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("666\\StudentsCopy.txt"),true)
                ) {
            String line;
            while ((line = bw.readLine())!= null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
