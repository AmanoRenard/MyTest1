package pers.amanorenard.homeworks.dailytraining.y22m6.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

class PredicateDemo {
    public static void main(String[] args) {

//        1. 检查字符串是否不为空
        System.out.println("1. 检查字符串是否不为空");
        System.out.println("输入一个字符串：");
        System.out.println(checkString(
                new Scanner(System.in).nextLine(),
                s -> !s.equals("")
        ));

//        2. 筛选数组
        System.out.println("2. 筛选数组");
        String[] ss = {"林青霞,30", "张曼玉,35", "柳岩,34", "貂蝉,31", "王祖贤,33"};
        System.out.println("筛选前：" + Arrays.toString(ss));
        ArrayList<String> result = filterArr(ss,
                text -> text.split(",")[0].length() > 2,
                text -> Integer.parseInt(text.split(",")[1]) > 33
        );
        System.out.println("筛选后：" + result);
    }

    static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    static ArrayList<String> filterArr(String[] arr,
                                       Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : arr) if (pre1.and(pre2).test(s)) arrayList.add(s);
        return arrayList;
    }
}
