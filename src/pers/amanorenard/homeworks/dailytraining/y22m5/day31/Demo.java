package pers.amanorenard.homeworks.dailytraining.y22m5.day31;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        try {
            BufferedReader br = new BufferedReader(new BufferedReader( new FileReader("666\\123")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
