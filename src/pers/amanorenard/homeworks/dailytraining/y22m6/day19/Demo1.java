package pers.amanorenard.homeworks.dailytraining.y22m6.day19;

import java.lang.reflect.*;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Class<?> stuClass = Class.forName("pers.amanorenard.homeworks.dailytraining.y22m6.Day19.Player");
//        Field[] stuFields = stuClass.getDeclaredFields();
//        Arrays.stream(stuFields).forEach(field -> System.out.printf("【%s】\n\t类型：%s\n\t修饰符：%s\n",field.getName(),field.getType(), Modifier.toString(field.getModifiers())));

//        Class<?> playerClass = Class.forName("pers.amanorenard.homeworks.dailytraining.y22m6.Day19.Player");
//        Player player = (Player) playerClass.getConstructor().newInstance();
//        playerClass.getField("name").set(player, "林青霞");
//        playerClass.getDeclaredField("kills").set(player, 30);
//        Field address = playerClass.getDeclaredField("address");
//        address.setAccessible(true);
//        address.set(player, "西安");
//        System.out.println(player);

//        Player p = new Player("233333","蔡徐坤",100,"唱跳RAP");
//        Class<?> playerClass = Class.forName("pers.amanorenard.homeworks.dailytraining.y22m6.Day19.Player");
//        Method getPassword = playerClass.getDeclaredMethod("getPassword");
//        getPassword.setAccessible(true);
//        String password = (String)getPassword.invoke(p);
//        System.out.println(password);
//        Method play = playerClass.getMethod("play",String.class);
//        play.invoke(p,"233333");

        ArrayList<Integer> intArr = new ArrayList<>();
        Class<?> intArrClass = intArr.getClass();
        Method add = intArrClass.getMethod("add", Object.class);
        add.invoke(intArr, "卢本伟牛逼！！！");
        System.out.println(intArr);


    }
}
