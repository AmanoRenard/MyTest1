package pers.amanorenard.mytest;

import java.util.ArrayList;

class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<ArrayListStudent01> stuArr = new ArrayList<>();
        ArrayListStudent01 s1 = new ArrayListStudent01("林青霞",30);
        ArrayListStudent01 s2 = new ArrayListStudent01("小李",16);
        ArrayListStudent01 s3 = new ArrayListStudent01("张曼玉",18);
        stuArr.add(s1);
        stuArr.add(s2);
        stuArr.add(s3);
        for (int i=0;i<stuArr.size();i++) {
            System.out.println(stuArr.get(i).view());
        }
    }


}
