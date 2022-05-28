package pers.amanorenard.mytest;

class StudentDemo {
    public static void main(String[] args) {
        StudentTest01学生类 Li = new StudentTest01学生类(30,"林青霞");
        System.out.println(Li.view());
        Li.setAge(130);
        Li.setName("小李");
        System.out.println(Li.view());

    }
}
