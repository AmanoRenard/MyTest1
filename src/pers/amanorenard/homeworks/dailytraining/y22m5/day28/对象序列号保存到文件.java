package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.*;

class 对象序列号保存到文件 {
    public static void main(String[] args) {
        Player p1 = new Player("卢本伟",99,29,"lbwnb666");
        writePlayer(p1, "666\\复制练习\\players\\lbw.txt");
        Player p2 = readPlayer("666\\复制练习\\players\\lbw.txt");
        System.out.println(p2);

    }

    public static void writePlayer(Player p, String path) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))
        ) {
            oos.writeObject(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Player readPlayer(String path) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))
                ) {
            return (Player) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
