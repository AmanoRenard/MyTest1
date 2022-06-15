package pers.amanorenard.homeworks.dailytraining.y22m6.day13;

/**
 *   作业(匿名内部类和Lambda表达式都写了（写简便写法），源
 * 代码和输出截图传一下cc网)
 * • 需求：编写一个接口(StringHandler)
 * • StringHandler存在一个抽象方法(printMessage)，该方法有参数
 * msg无返回值
 * • 测试类：StringHandlerTest，存在一个方法useStringHandler，方
 * 法的形参是StringHandler类型，在方法内部调用StringHandler的
 * printMessage方法并打印msg
 */

class 案例2 {
    public static void main(String[] args) {

//        匿名内部类
        new StringHandlerTest().useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("我要打印msg！");
                System.out.println(msg);
            }
        });

//        Lambda表达式
        new StringHandlerTest().useStringHandler(
                (msg) -> {
                    System.out.println("Lambda表达式也要打印：");
                    System.out.println(msg);
                }
        );
    }
}

interface StringHandler {
    void printMessage(String msg);
}

class StringHandlerTest {
    String msg = "(此处省略一大堆消息)\n";
    void useStringHandler(StringHandler sh) {
        sh.printMessage(msg);
    }
}