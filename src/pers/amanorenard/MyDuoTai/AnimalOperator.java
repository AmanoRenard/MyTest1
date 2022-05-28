package pers.amanorenard.MyDuoTai;

class AnimalOperator {
    private String name;
    private int age;

    public AnimalOperator() {}
    public AnimalOperator(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void useAnimal(Animal ani) {
        ani.eat();
    }
}
