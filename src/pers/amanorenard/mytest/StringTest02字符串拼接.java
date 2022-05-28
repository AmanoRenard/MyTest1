package pers.amanorenard.mytest;

class StringTest02字符串拼接 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        System.out.println(strAdd(a));

    }

    public static String strAdd(int[] s) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0; i<s.length; i++) {
            if (i==s.length-1) {
                sb.append(s[i]);
            } else {
                sb.append(s[i]);
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
