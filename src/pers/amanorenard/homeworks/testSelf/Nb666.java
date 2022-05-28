package pers.amanorenard.homeworks.testSelf;

class Nb666 {
    public static void main(String[] args) {
        Phone nk8808 = new Phone("Nokia8808",6666);
        System.out.println(nk8808);;
        System.out.println("诺基亚倒闭了，"+nk8808.getBrand()+"手机降价");
        nk8808.setPrice(100);
        System.out.println(nk8808);
        System.out.println(nk8808.info());

    }
}
