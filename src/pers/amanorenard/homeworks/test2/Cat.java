package pers.amanorenard.homeworks.test2;

class Cat extends Animal {
    int age = 20;

    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}
