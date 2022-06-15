package pers.amanorenard.homeworks.dailytraining.y22m6.day16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CollectDemo {
    public static void main(String[] args) throws IOException {

        String[] arr = {"角色名：蔡徐坤","职业：偶像练习生","等级：100"};
        Properties prop = new Properties();
        prop.putAll(Arrays.stream(arr).collect(Collectors.toMap(s -> s.split("：")[0], s -> s.split("：")[1])));
        prop.store(new OutputStreamWriter(new FileOutputStream("666\\CaiXuKun.txt"), StandardCharsets.UTF_8),"PlayerData");
    }
}
