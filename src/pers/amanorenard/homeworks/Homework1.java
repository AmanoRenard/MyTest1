package pers.amanorenard.homeworks;
import java.util.Scanner;

class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("请输入成绩：");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("你输入的数据有误");
            System.exit(1);
        }
        if (n>=95 && n<=100) {
            System.out.println("奖励自行车一辆");
        } else if (n>=90 && n<95) {
            System.out.println("奖励游乐场一次");
        } else if (n>=80 && n<90) {
            System.out.println("奖励变形金刚一个");
        } else if (n>=0 && n<80) {
            System.out.println("挨顿揍");
        } else {
            System.out.println("你输入的成绩不合理");
        }
    }
}
