package pers.amanorenard.mytest;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<ArrayListStudent01> stuArr = new ArrayList<>();
        System.out.println("请输入要录入的学生数量：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("编号#"+(i+1));
            addStudent(stuArr);
        }
        for (int i=0;i< stuArr.size();i++) System.out.println(stuArr.get(i).view());
    }
    public static void addStudent(ArrayList<ArrayListStudent01> stuArr) {
        Scanner sc = new Scanner(System.in);
        ArrayListStudent01 stu = new ArrayListStudent01();
        System.out.println("请输入学生姓名：");
        stu.setName(sc.nextLine());
        System.out.println("请输入学生年龄：");
        while (true) {
            int sage = sc.nextInt();
            if (stu.setAge(sage)) {
                break;
            } else {
                System.out.println("请重新输入！");
            }
        }
        stuArr.add(stu);
    }
}
