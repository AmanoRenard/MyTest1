package pers.amanorenard.homeworks.dailytraining.y22m4.day24;

import java.util.Scanner;

class Ds {
    public static void main(String[] args) {
        int[] count = new int[58];
        System.out.println("输入一个字符串: ");
        String s = new Scanner(System.in).nextLine();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>='A' && ch<='Z') count[ch-'A']++;
            else if (ch>='a' && ch<='z') count[ch-'a'+24]++;
            else if (ch>='0' && ch<='9') count[ch-'0'+48]++;
        }

        for (int i=0; i<count.length; i++) {
            if (count[i]>0) {
                if (i < 24) System.out.println((char)('A' + i) + " " + count[i]);
                else if (i < 48) System.out.println((char)('a' + i-24) + " " + count[i]);
                else System.out.println((char)('0' + i-48) + " " + count[i]);
            }
        }
    }

}
