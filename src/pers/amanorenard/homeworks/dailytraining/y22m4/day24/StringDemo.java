package pers.amanorenard.homeworks.dailytraining.y22m4.day24;


import java.util.Scanner;

class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个字符串: ");
        String s = sc.nextLine();
        System.out.println("\t替换前的字符串: "+s);
        System.out.print("请输入要替换的内容: ");
        String sRe = sc.nextLine();
        System.out.print("请输入替换后的内容: ");
        String sReT = sc.nextLine();
        System.out.println("\t替换后的内容为: "+s.replaceAll(sRe, sReT));


    }
}
