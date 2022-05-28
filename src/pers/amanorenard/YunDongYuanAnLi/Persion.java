package pers.amanorenard.YunDongYuanAnLi;

abstract class Persion {
    private String name;
    private int age;

    public Persion() {}
    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>120 || age <0) {
            System.out.println("你输入的年龄不正确！");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void view() {
        System.out.printf("姓名：%s，年龄：%d。\n",name,age);
    }

    public abstract void eat(); //吃东西
}
