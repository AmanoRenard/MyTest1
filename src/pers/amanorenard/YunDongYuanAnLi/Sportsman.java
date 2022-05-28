package pers.amanorenard.YunDongYuanAnLi;

abstract class Sportsman extends Persion{
    public Sportsman() {}
    public Sportsman(String name,int age) {
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("运动员需要均衡饮食。");
    }
    public abstract void train();   //训练的内容不一样
}
