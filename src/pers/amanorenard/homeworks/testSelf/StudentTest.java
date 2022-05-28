package pers.amanorenard.homeworks.testSelf;

class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        print("使用空构造方法创建一个学生对象：");
        stu1.show();
        print("尝试将名字设为空字符串：");
        tryTo(stu1.setName(""));
        stu1.show();
        print("尝试将年龄设置为规定范围以外的数值：");
        tryTo(stu1.setAge(10));
        stu1.show();
        print("正确使用成员方法：");
        tryTo((stu1.setName("卢本伟") && stu1.setAge(28)));
        stu1.show();
        print("使用带参构造方法创建一个学生对象：");
        Student stu2 = new Student("张曼玉",30);
        stu2.show();
        print("尝试从控制台录入学生姓名与年龄：");
        tryTo(stu2.setNameFromConsole());
        tryTo(stu2.setAgeFromConsole());
        stu2.show();
    }

    public static void tryTo(boolean yOrN) {
        if (!yOrN) System.out.println("***您的输入有误！***");
    }

    public static void print(String str) {
        System.out.println(str);
    }

}
