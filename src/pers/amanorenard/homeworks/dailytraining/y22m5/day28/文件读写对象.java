package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.*;
import java.util.ArrayList;

class 文件读写对象 extends Simpl.Chinese {
    public static void main(String[] args) {



        addStu("666\\Students.txt");
        ArrayList<Student> students = listStu("666\\Students.txt");
        if (students != null) {
            输出(students, "\n");
        }
    }

    //对象写入到文件
    public static void addStu(String path) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("张三", 18, "男"));
        arr.add(new Student("李四", 20, "男"));
        arr.add(new Student("小青", 16, "女"));

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(path))
        ) {
            for (Student s : arr) {
                bw.write(s.getName() + "," + s.getAge() + "," + s.getSex());
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //从文件读取对象
    public static ArrayList<Student> listStu(String path) {
        ArrayList<Student> arr = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            String text;
            while ((text = br.readLine()) != null) {
                String[] ss = text.split(",");
                arr.add(new Student(ss[0], Integer.parseInt(ss[1]), ss[2]));
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
