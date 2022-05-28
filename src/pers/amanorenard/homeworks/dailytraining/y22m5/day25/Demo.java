package pers.amanorenard.homeworks.dailytraining.y22m5.day25;

import java.io.File;
import java.io.IOException;

class Demo {
    public static void main(String[] args) {
        File f = new File("src\\");

        searchFiles(f);

    }

    public static void searchFiles(File inFile) {
        searchFiles(inFile, 0);
    }

    public static void searchFiles(File inFile, int n) {
        File[] files = inFile.listFiles();
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(n));
        if (files != null) {
//            for (File f : files) {
//                if (f.isFile()) {
//                    System.out.println(sb + "└"+ f.getName());
//                } else {
//                    System.out.println(sb + f.getName() + "\\");
//                    searchFiles(f , n+3);
//                }
//            }

            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(sb + "└"+ f.getName());
                }
            }
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(sb + "+" + f.getName() + "\\");
                    searchFiles(f , n+3);
                }
            }
        }
    }
}
