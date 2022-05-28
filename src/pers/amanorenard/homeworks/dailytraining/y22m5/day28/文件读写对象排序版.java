package pers.amanorenard.homeworks.dailytraining.y22m5.day28;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.TreeSet;

class 文件读写对象排序版 extends Simpl.Chinese {
    public static void main(String[] args) {
        Comparator<StudentScore> com = (StudentScore s1, StudentScore s2) -> {
            int num;
            return (num = s2.getSum() - s1.getSum()) != 0 ? num :
                    (num = s2.getChinese() - s1.getChinese()) != 0 ? num :
                            (num = s2.getMath() - s1.getMath()) != 0 ? num :
                                    (s1.getName().compareTo(s2.getName()));
        };
        setStu(com);
        TreeSet<StudentScore> stusc = getStu(com);
        if (stusc != null) {
            输出(stusc, "\n");
        }
    }

    public static void setStu(Comparator<StudentScore> com) {
        TreeSet<StudentScore> arr = new TreeSet<>(com);
        arr.add(new StudentScore("小明", 50, 60, 70));
        arr.add(new StudentScore("小李", 60, 50, 70));
        arr.add(new StudentScore("小王", 80, 50, 50));
        arr.add(new StudentScore("小月", 20, 50, 10));
        arr.add(new StudentScore("小三", 20, 10, 10));
        arr.add(new StudentScore("大王", 100, 100, 100));

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("666\\StudentScores.txt"))
        ) {
            for (StudentScore stusc : arr) {
                bw.write(stusc.getName()+","+stusc.getChinese()+","+ stusc.getMath()+","+ stusc.getEnglish());
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static TreeSet<StudentScore> getStu(Comparator<StudentScore> com) {
        TreeSet<StudentScore> arr = new TreeSet<>(com);
        try (
                BufferedReader br = new BufferedReader(new FileReader("666\\StudentScores.txt"))
                ) {
            String line;
            while((line = br.readLine())!= null) {
                String[] ss = line.split(",");
                arr.add(new StudentScore(ss[0],Integer.parseInt(ss[1]),Integer.parseInt(ss[2]),Integer.parseInt(ss[3])));
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
