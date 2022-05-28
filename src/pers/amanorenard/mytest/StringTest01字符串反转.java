package pers.amanorenard.mytest;
import java.util.Scanner;

class StringTest01字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要反转的字符串: ");
        String s = sc.nextLine();
        System.out.println(strReverse(s));

    }
    public static String strReverse(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
        return new StringBuilder(s).reverse().toString();
    }
}
