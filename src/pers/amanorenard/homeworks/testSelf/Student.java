package pers.amanorenard.homeworks.testSelf;

import java.util.Objects;
import java.util.Scanner;

class Student {
    public Student(String name, int age) {
        if (!(Objects.equals(name, ""))) {
            this.name = name;
        }
        if (age >= 20 && age <= 120){
            this.age = age;
        }

    }

    public Student(){}

    private String name = "无名氏";
    private int age = 20;

    public String getName() {
        return name;
    }

    public boolean setNameFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入姓名：");
        String name = sc.nextLine();
        if (Objects.equals(name, "")) {
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    public boolean setName(String name) {
        if (Objects.equals(name, "")) {
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean setAgeFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年龄：");
        String age = sc.nextLine();
        int tmp;
        try {
            tmp = Integer.parseInt(age);
        } catch (Exception e) {
            return false;
        }
        if (tmp < 20 || tmp > 120) return false;
        else {
            this.age = tmp;
            return true;
        }
    }

    public boolean setAge(int age) {
        if (age < 20 || age > 120) return false;
        else {
            this.age = age;
            return true;
        }
    }

    public void show() {
        System.out.printf("\t姓名：%s\n\t年龄：%d\n\n",name,age);
    }
}
