package pers.amanorenard.homeworks;

import java.util.Scanner;

class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int judNum = 0;
        while (true) {
            System.out.print("请输入评委数量：");
            try {
                judNum = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("ERROR: 输入有误，请重新输入！");
                continue;
            }
            sc.nextLine();
            if (judNum < 3) {
                System.out.println("ERROR: 评委数量过少，请重新输入！");
                continue;
            }
            break;
        }
        int[] score = new int[judNum];
        while (true) {
            for (int i = 0; i < judNum; i++) score[i] = 0;
            System.out.println("请输入" + judNum + "个分数（用分数用一个空格隔开）");
            System.out.print(">");
            char[] input = sc.nextLine().toCharArray();
            int tmp = 0;
            boolean err = false;
            for (int i = 0; i < input.length; i++) {
                char pointer = input[i];
                if (pointer <= '9' && pointer >= '0') {
                    score[tmp] = score[tmp] * 10 + (pointer - '0');
                } else if (pointer == ' ') {
                    tmp += 1;
                    if (tmp > judNum - 1) {
                        System.out.println("ERROR: 给定的成绩数量多了，请重新输入！\n");
                        err = true;
                        break;
                    }
                } else {
                    System.out.println("ERROR: 格式输入不正确，请重新输入！\n");
                    err = true;
                    break;
                }
            }
            if (judNum - 1 > tmp && !err) {
                System.out.println("ERROR: 给定的成绩数量少了，请重新输入！\n");
                err = true;
                continue;
            }
            if (!err) break;
        }
        int min = score[0], max = score[0], sum = score[0];
        for (int i = 1; i < judNum; i++) {
            sum += score[i];
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("\n去掉最高分(%d)和最低分(%d)平均分是：%.1f", max, min, (sum - max - min) / (float) (judNum - 2));
    }

}
