package pers.amanorenard.YunDongYuanAnLi;

class BasketballCoach extends Coach{
    public BasketballCoach() {}
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练需要给篮球运动员进行与篮球有关的培训。");
    }
}
