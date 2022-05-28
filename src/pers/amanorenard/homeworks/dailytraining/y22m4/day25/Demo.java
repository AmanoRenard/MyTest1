package pers.amanorenard.homeworks.dailytraining.y22m4.day25;

class Demo {
    public static void main(String[] args) {
        for (int x = 10000; x<10001; x+=1) {
            double z = 400*x - 0.02* Math.pow(x, 2) - 180000;
            System.out.println(z);
            if (z==0) {
                System.out.println(z);
                break;
            }
        }
    }
}
