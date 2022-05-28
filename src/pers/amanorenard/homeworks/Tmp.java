package pers.amanorenard.homeworks;
import java.util.Scanner;

class Tmp {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int[] score = new int[6];


    //先传入第一个数的值
    int min = score[0], max = score[0], sum = score[0];
    //最大值最小值判断
    //for循环一个一个存进去，从1开始是因为第一个数已经存入了

        for (int i = 0; i < 6; i++) {
        System.out.print("第"+(i+1)+"位评委的评分为：");
        score[i] = sc.nextInt();
        sum += score[i];
        if (max < score[i]) {
            max = score[i];
        } else if (min > score[i]) {
            min = score[i];
        }
    }
        System.out.println(max+"max"+min+"min");
        System.out.println("平均分是：" + (sum - max - min) / (score.length -2));
}}
