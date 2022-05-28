package pers.amanorenard.YunDongYuanAnLi;

class PingpongSportsman extends Sportsman implements StudyEnglish{
    public PingpongSportsman() {}
    public PingpongSportsman(String name,int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println("乒乓球运动员将进行跟乒乓球有关的训练。");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员需要学习英语，为期"+studyDays+"天");
    }
}
