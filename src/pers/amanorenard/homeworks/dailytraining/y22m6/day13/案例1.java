package pers.amanorenard.homeworks.dailytraining.y22m6.day13;

/**
 *  作业(匿名内部类和Lambda表达式都写了（写简便写法），源
 * 代码和输出截图传一下cc网)
 * • 需求：编写一个接口(ShowHandler)
 * • 接口中存在一个抽象方法(show)，该方法无参数无返回值
 * • 测试类：ShowHandlerTest，存在一个方法useShowHandler，方
 * 法的形参是ShowHandler类型，在方法内部调用ShowHandler的
 * show方法
 */

class 案例1 {
    public static void main(String[] args) {

//        匿名内部类
        new ShowHandlerTest().useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("show一波！！！");
            }
        });

//        Lambda表达式
        new ShowHandlerTest().useShowHandler(
                () -> System.out.println("Lambda表达式也要show一波！！！")
        );
    }
}

interface ShowHandler {
    void show();
}

class ShowHandlerTest {
    void useShowHandler(ShowHandler sh) {
        sh.show();
    }
}