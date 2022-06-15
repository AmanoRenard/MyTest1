package pers.amanorenard.homeworks.dailytraining.y22m6.day15;

import java.util.Calendar;
import java.util.Scanner;
import java.util.function.Function;

class FunctionDemo {
    public static void main(String[] args) {
//        获取出生日期：
        String s = new Scanner(System.in).nextLine();
        System.out.println(
                "出生年份为："+
                getBirthday(s,
                text -> Calendar.getInstance().get(Calendar.YEAR)
                        - Integer.parseInt(text.split(",")[1]
                )));
    }

    static int getBirthday(String s, Function<String, Integer> fun) {
        return fun.apply(s);
    }
}
