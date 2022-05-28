package pers.amanorenard.YunDongYuanAnLi;

class Demo {
    public static void main(String[] args) {
        PingpongCoach pc1 = new PingpongCoach("乒乓球李教练",30);
        PingpongSportsman ps1 = new PingpongSportsman("乒乓球运动员小王",20);
        BasketballCoach bc1 = new BasketballCoach("篮球孙教练",36);
        BasketballSportsman bs1 = new BasketballSportsman();
        bs1.setName("篮球运动员小周");
        bs1.setAge(22);

        System.out.println("加入了新成员：\n"+bs1.getName()+", "+bs1.getAge()+"\n");
        ps1.view();ps1.train();ps1.eat();ps1.studyEnglish();
        System.out.println("");
        pc1.view();pc1.teach();pc1.eat();pc1.studyEnglish();
        System.out.println("");
        bs1.view();bs1.train();bs1.eat();
        System.out.println("");
        bc1.view();bc1.teach();bc1.eat();
    }
}
