package pers.amanorenard.mytest;

class StudentTest01学生类 {
    private int age;
    private String name;

    public StudentTest01学生类(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>120 || age<0) {
            System.out.println("你输入的年龄不正确。");
        } else {
            this.age = age;
        }
    }

    public String view() {
        return (this.name + ", " + this.age);
    }

}
