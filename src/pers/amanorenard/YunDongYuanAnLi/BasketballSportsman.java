package pers.amanorenard.YunDongYuanAnLi;

class BasketballSportsman extends Sportsman{
    public BasketballSportsman() {}
    public BasketballSportsman(String name, int age) {
        super(name, age);
    }
    @Override
    public void train() {
        System.out.println("篮球运动员需要进行跟篮球有关的训练。");
    }
}
