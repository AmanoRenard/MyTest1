package pers.amanorenard.homeworks.dailytraining.y22m5.day28;

class Demo {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

    public static String spinWords(String sentence) {
        String[] ss = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].length() >= 5) {
                ss[i] = new StringBuilder(ss[i]).reverse().toString();
            }
            sb.append(ss[i]);
            if (i < ss.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}