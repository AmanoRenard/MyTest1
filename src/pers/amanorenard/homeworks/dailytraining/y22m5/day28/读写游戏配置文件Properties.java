package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.*;
import java.util.Properties;

class 读写游戏配置文件Properties {
    public static void main(String[] args) {
        Properties conf = new Properties();
        conf.setProperty("Version","0.0.1");
        conf.setProperty("Sound","0.5");
        conf.setProperty("Voice","1");
        conf.setProperty("Difficulty","hard");
        conf.setProperty("Max_Player","16");

        try (
                FileWriter fw = new FileWriter("666\\GameConfig.txt")
                ) {
            conf.store(fw,"This is a profile about the game.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Properties confLoad = new Properties();
        try (
                FileReader fr = new FileReader("666\\GameConfig.txt")
                ) {
            confLoad.load(fr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String key : confLoad.stringPropertyNames()) {
            String value = confLoad.getProperty(key);
            System.out.println(key + ", " + value);
        }
    }
}
