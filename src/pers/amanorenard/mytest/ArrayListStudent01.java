package pers.amanorenard.mytest;

class ArrayListStudent01 {
    private String name;
    private int age;

    public ArrayListStudent01() {}

    public ArrayListStudent01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean setAge(int age) {
        if (age>120 || age<0) {
            System.out.println("你输入的年龄不正确");
            return false;
        } else {
            this.age = age;
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String view() {
        return (this.name+", "+this.age);
    }
}
