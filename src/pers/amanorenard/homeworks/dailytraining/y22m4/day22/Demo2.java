package pers.amanorenard.homeworks.dailytraining.y22m4.day22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Demo2 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"3");
        list.add(0,"2");
        list.add(0,"3");
        list.add(0,"5");
        list.add(0,"7");
        list.add(0,"3");
        list.add(0,"3");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                System.out.println(s1.compareTo(s2));
                return s1.compareTo(s2);
            }
        });
        System.out.println(list);
        System.out.println((System.currentTimeMillis()-time)*1.0/1000 + "秒");

    }

}
