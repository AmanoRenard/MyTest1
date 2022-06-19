package pers.amanorenard.homeworks.dailytraining.y22m6.day18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Constructor<?> con = Student.class.getConstructor(String.class, int.class);
        Object lbw = con.newInstance("卢本伟", 666);
        Student lbwstu = lbw instanceof Student ? ((Student) lbw) : null;
        if (lbwstu!=null) System.out.println(lbwstu.getName()+":"+lbwstu.getAge());


    }
}
