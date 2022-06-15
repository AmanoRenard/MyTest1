package pers.amanorenard.homeworks.dailytraining.y22m6.day15;

import java.util.ArrayList;

class StreamDemo extends Simpl.Chinese {
    public static void main(String[] args) {
        ArrayList<String> arr = 新ArrayList("卢本伟", "PDD", "周淑怡", "大司马", "旭旭宝宝", "蔡徐坤");
        arr.stream().map(
                s -> "名字："+ s + "\n\t长度：" +s.length()
        ).forEach(System.out::println);
    }
}
