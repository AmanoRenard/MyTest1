package pers.amanorenard.homeworks.dailytraining.y22m6.day13;

/**
 *  作业(匿名内部类和Lambda表达式都写了（写简便写法），源
 * 代码和输出截图传一下cc网)
 * • 需求：编写一个接口(RandomHandler)
 * • RandomHandler存在一个抽象方法(getNumber)，该方法无参数有
 * 返回值 return num; (随机返回一个1到10之间的数)
 * • 测试类：RandomHandlerTest，存在一个方法useRandomHandler，
 * 方法的形参是RandomHandler类型，在方法内部调用
 * RandomHandler的getNumber方法并打印num
 */

class 案例3 {
    public static void main(String[] args) {

//        匿名内部类：
        new RandomHandlerTest().useRandomHandler(new RandomHandler() {
            @Override
            public int getNumber() {
                return new java.util.Random().nextInt(10) + 1;
            }
        });

//        Lambda表达式：
        new RandomHandlerTest().useRandomHandler(
                () -> new java.util.Random().nextInt(10) + 1
        );
    }
}

interface RandomHandler {
    int getNumber();
}

class RandomHandlerTest {
    void useRandomHandler(RandomHandler rh) {
        System.out.println(rh.getNumber());
    }
}