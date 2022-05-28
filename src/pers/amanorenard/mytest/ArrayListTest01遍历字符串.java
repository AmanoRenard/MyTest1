package pers.amanorenard.mytest;
import java.util.ArrayList;

class ArrayListTest01遍历字符串 {
    public static void main(String[] args) {
        ArrayList<String> myarr = new ArrayList<String>();
        myarr.add("Hello");
        myarr.add("World");
        myarr.add("JavaEE");
        for (int i=0;i<myarr.size();i++) {
            String s = myarr.get(i);
            System.out.println(s);
        }
    }
}
