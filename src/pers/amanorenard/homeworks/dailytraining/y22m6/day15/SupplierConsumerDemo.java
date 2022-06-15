package pers.amanorenard.homeworks.dailytraining.y22m6.day15;

import java.util.function.Consumer;
import java.util.function.Supplier;

class SupplierConsumerDemo {
    public static void main(String[] args) {
//        生产字符串
        String s = getString(() -> "林,青霞");
//        消费字符串
        useString(
                s,
                System.out::println,
                s1 -> System.out.println(s.split(",")[0]),
                s1 -> System.out.println(s.split(",")[1])
        );
    }

    static String getString(Supplier<String> sup) {
        return sup.get();
    }

    static void useString(
            String s, Consumer<String> con1, Consumer<String> con2,
            Consumer<String> con3
    ) {
        con1.andThen(con2).andThen(con3).accept(s);
    }
}
