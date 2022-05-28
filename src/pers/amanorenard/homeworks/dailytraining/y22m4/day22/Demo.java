package pers.amanorenard.homeworks.dailytraining.y22m4.day22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        List<Student> stuArr = new ArrayList<>();

        Student stu1 = new Student("林青霞",30);
        Student stu2 = new Student("张曼玉",20);
        Student stu3 = new Student("风清扬",25);

        stuArr.add(stu1);
        stuArr.add(stu2);
        stuArr.add(stu3);

        stuArr.add(0, new Student("小李",30));

        Iterator<Student> stuIte = stuArr.iterator();
        while(stuIte.hasNext()) {
            Student s = stuIte.next();
            System.out.println(s);
        }


    }
}
