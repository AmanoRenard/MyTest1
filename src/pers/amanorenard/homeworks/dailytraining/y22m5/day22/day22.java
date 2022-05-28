package pers.amanorenard.homeworks.dailytraining.y22m5.day22;

import java.util.*;

class day22 extends Simpl.Chinese{
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        TreeMap<Character,Integer> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character character, Character t1) {
                if (character > t1) {
                    return -1;
                } else if (character < t1) {
                    return 1;
                }
                return 0;
            }
        });
        String s = sc.nextLine();
        char ch;
        Integer v;
        for (int i = 0; i< s.length(); i++) {
            ch = s.charAt(i);
            if ((v = map.get(ch)) == null){
                map.put(ch, 1);
            } else {
                map.put(ch, v+1);
            }
        }
        for (Map.Entry<Character,Integer> me : map.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
         */

        ArrayList<Student> arr = new ArrayList<>();
        添加元素(arr,
                new Student("wang", 20),
                new Student("li", 18),
                new Student("ming",22),
                new Student("huang",18)
                );
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
            }
        });
        for(Student s : arr) {
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
