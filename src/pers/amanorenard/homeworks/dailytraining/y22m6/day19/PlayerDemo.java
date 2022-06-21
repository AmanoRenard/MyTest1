package pers.amanorenard.homeworks.dailytraining.y22m6.day19;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class PlayerDemo {
    public static void main(String[] args) {

        String
                classPath = null,
                methodName = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("666\\PlayerConfig.txt"), StandardCharsets.UTF_8))) {
            classPath=br.readLine();
            methodName=br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            assert classPath != null && methodName != null;
            Class<?> usingClass = Class.forName(classPath);
            Method usingMethod = usingClass.getMethod(methodName);
            Object p = usingClass.getConstructor().newInstance();
            usingClass.getMethod("setName", String.class).invoke(p, "蔡徐坤");
            System.out.println(usingMethod.invoke(p));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

    }
}
