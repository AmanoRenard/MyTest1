package pers.amanorenard.MyDuoTai;

class Demo {
    public static void main(String[] args) {
        AnimalOperator opt = new AnimalOperator();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        opt.useAnimal(myCat);
        opt.useAnimal(myDog);
        Cat a = new Cat();
        opt.useAnimal(a);
    }
}
