package pers.amanorenard.homeworks.dailytraining.y22m4.day23;

class Generic {

    public static <T extends Number> T compare(T t1, T t2) {
        double n1 = t1.doubleValue(), n2 = t2.doubleValue();
        if (n1%1 ==0 && n2 %1 ==0) {
            if (t1.longValue()>t2.longValue()) {
                return t1;
            } else {
                return t2;
            }
        }
        if(n1>n2) {
            return t1;
        } else {
            return t2;
        }
    }
}

