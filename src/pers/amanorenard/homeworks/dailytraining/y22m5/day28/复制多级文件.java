package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

import java.io.*;

class 复制多级文件 extends Simpl.Chinese{
    public static void main(String[] args) {
        System.out.println(copyFiles("666\\复制练习\\output1","666\\复制练习\\output2"));
    }

    public static boolean copyFiles(String src, String tgt) {
        File
                f1 = new File(src),
                f2 = new File(tgt);
        String
                srcName = f1.getName(),
                tgtPath = f2.getAbsolutePath(),
                outPath = tgtPath + "\\" + srcName + "\\";
        if (!f1.exists() && !f2.exists() && !f1.isDirectory() && !f2.isDirectory()) {
            return false;
        }
        File dict = new File(outPath);
        if (!dict.exists()) {
            if (!dict.mkdir()) {
                return false;
            }
        }
        File[] fs = f1.listFiles();
        if (fs != null) {
            for (File f : fs) {
                if (f.isDirectory()) {
                    File tmpDict = new File(outPath+f.getName());
                    if (!tmpDict.exists()) {
                        if(!tmpDict.mkdir()) {
                            return false;
                        }
                    }
                    if (!copyFiles(f.getAbsolutePath(), outPath)) {
                        return false;
                    }
                }
                File outF = new File(outPath + f.getName());
                if (!outF.exists()) {
                    try(
                            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPath+f.getName()))
                    ) {
                        byte[] bys = new byte[1024];
                        int len;
                        while((len = bis.read(bys))!= -1) {
                            bos.write(bys,0,len);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
