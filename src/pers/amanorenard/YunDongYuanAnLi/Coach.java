package pers.amanorenard.YunDongYuanAnLi;

abstract class Coach extends Persion{
    public Coach() {}
    public Coach(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("与运动员相比，教练的饮食要求没有那么严格。");
    }

    public abstract void teach();
}
