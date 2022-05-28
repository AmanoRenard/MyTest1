package pers.amanorenard.homeworks.dailytraining.y22m5.day27;

import java.io.*;
import java.util.*;

class 随机点人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("请输入名字（-1停止）：");
        while(!(s = sc.nextLine()).equals("-1")) {
            arr.add(s);
        }

        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter("666\\player.txt"))
                ) {
            for(String str : arr) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(getRandomLine("666\\player.txt"));
    }

    public static String getRandomLine(String path) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))
                ) {
            ArrayList<String> arr = new ArrayList<>();
            String text;
            while((text = br.readLine()) != null) {
                arr.add(text);
            }
            System.out.println(arr);
            Random rnd = new Random();
            return arr.get(rnd.nextInt((arr.size())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
