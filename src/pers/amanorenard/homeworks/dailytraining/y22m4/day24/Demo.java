package pers.amanorenard.homeworks.dailytraining.y22m4.day24;


import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            pchr(sc.next().charAt(0), sc.nextInt());
            System.out.println();
        }
    }


    public static void pchr(char c, int num) {
        for (int i = 0; i<num; i++) {
            System.out.print(c);
        }
    }
}
