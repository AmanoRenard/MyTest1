package pers.amanorenard.homeworks.dailytraining.y22m5.day26;

import java.io.*;

class 文件复制练习  {
    public static void main(String[] args) {
        long usedTime = System.currentTimeMillis();

        // 用字节缓冲输入输出流读写数据：文件读写速度提升！复制10M的图片 0.05秒 -> 0.015秒！
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                        "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\photo.png"
                ));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                        "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\outPhoto.png", true
                ))
        ) {
            int len;
            byte[] bys = new byte[1024];
            while((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        // 普通读写数据方法
        try(
                FileInputStream fis = new FileInputStream(
                        "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\photo.png"
                );
                FileOutputStream fos = new FileOutputStream(
                        "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\outPhoto.png", true
                )
        ) {
            int len;
            byte[] bys = new byte[1024];
            while((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        usedTime = System.currentTimeMillis() - usedTime;
        System.out.println("所用时间：" + usedTime/1000.0 + "秒");

/*     复制文本：
        try(FileInputStream fis = new FileInputStream(
                "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\牛逼.txt");
            FileOutputStream fos = new FileOutputStream(
                "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\牛逼2.txt", true)
        ) {
            //一次读1KB — byte[n] ：n 必须是1024或1024的整数倍
            byte[] bys = new byte[1024];
            int len;
            System.out.println("写入了以下数据：");
            while ((len = fis.read(bys)) != -1) {
                System.err.print(new String(bys,0,len));
                fos.write(bys, 0, len);
            }

            *//*
            // 一次读一个字节
            int by;
            while ((by = fis.read()) != -1) {
                fos.write((char)by);
            }
            fos.write('\n');
            *//*
        } catch (IOException e) {
            e.printStackTrace();
        }

*/

        /*
        // jdk7以前的方法
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(
                    "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\牛逼.txt"
            );
            fos = new FileOutputStream(
                    "src\\pers\\amanorenard\\homeworks\\dailytraining\\y22m5\\day26\\牛逼2.txt", true
            );
            int by;
            while ((by = fis.read()) != -1) {
                fos.write((char)by);
            }
            fos.write('\n');

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */

    }
}
