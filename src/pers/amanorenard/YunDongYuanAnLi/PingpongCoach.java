package pers.amanorenard.YunDongYuanAnLi;

class PingpongCoach extends Coach implements StudyEnglish{
    public PingpongCoach() {}
    public PingpongCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练需要教乒乓球有关的课程");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓教练需要学习英语，培训时长"+studyDays+"天。");
    }
}
