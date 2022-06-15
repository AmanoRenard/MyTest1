package pers.amanorenard.homeworks.dailytraining.y22m6.day13;

/**
 *  作业(匿名内部类和Lambda表达式都写了（写简便写法），源
 * 代码和输出截图传一下cc网)
 * • 需求：编写一个接口(Calculator)
 * • Calculator存在一个抽象方法(calc)，该方法有参数(int a和int b)有
 * 返回值 return num; (返回两个数之和)
 * • 测试类：CalculatorTest，存在一个方法useCalculator，方法的形参
 * 是Calculator类型，在方法内部调用Calculator的calc方法并打印
 * num
 */

class 案例4 {
    public static void main(String[] args) {

//        匿名内部类：
        new CalculatorTest().useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

//        Lambda表达式：
        new CalculatorTest().useCalculator(
                (a, b) -> a+b
        );

    }
}

interface Calculator {
    int calc(int a, int b);
}

class CalculatorTest {

    int
            a=10,
            b=20;

    void useCalculator(Calculator ct) {
        System.out.printf("操作数：%d、%d 结果：%d。\n",a,b,ct.calc(a, b));
    }
}