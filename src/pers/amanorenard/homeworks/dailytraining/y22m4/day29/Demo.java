package pers.amanorenard.homeworks.dailytraining.y22m4.day29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Demo extends Simpl. Chinese{
    public static void main(String[] args) {

        Student s1 = new Student("L", 12);
        Student s2 = new Student("X", 13);

        ArrayList<Student> stus = 新ArrayList(s1, s2);
        输出(stus,"\n");
        分割线("=");
        ArrayList<String> myArr = 新ArrayList("卢本伟","PDD","周淑怡");

        添加元素(myArr, "大司马","药水哥");

        输出(myArr,"|");
        分割线();

/*
        //第1种迭代方法
        for (int i = 0; i< myArr.size(); i++) 输出((myArr.get(i)));
        分割线();

        //第2种迭代方法
        for (ListIterator<String> i = myArr.listIterator(); i.hasNext(); 输出(i.next()));
        分割线();

        //第3种迭代方法
        for(String s : myArr) 输出(s);
        分割线();
*/

        输出("删除成功：%d\n",删除元素(myArr,"PDD", "卢本伟", "带蓝子"));

        输出(myArr);


//        TreeSet<Integer> arr = 新有序集合(new Comparator<>() {
//            @Override
//            public int compare(Integer o, Integer t1) {
//                if (o < t1) return 1;
//                else if (o > t1) return -1;
//                return 0;
//            }
//        },1,10,55,1,8854,254,1);
//
//        输出(arr, ">");




    }
}
