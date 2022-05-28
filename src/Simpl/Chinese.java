//简体中文拓展 版本:0.025

package Simpl;

import java.util.*;

public class Chinese {

    public static void 输出(String text, Object... args) {
        System.out.printf(text, args);
    }


    public static void 输出(String text) {
        System.out.println(text);
    }

    public static void 输出(boolean flag, String text) {
        if (flag) {
            System.out.println(text);
        }
        else {
            System.out.print(text);
        }
    }

    public static <T extends Number> void 输出(T text, Object... args) {
        System.out.printf(String.valueOf(text), args);
    }


    public static <T extends Number> void 输出(T text) {
        System.out.println(text);
    }

    public static <T extends Number> void 输出(boolean flag, T  text) {
        if (flag) {
            System.out.println(text);
        }
        else {
            System.out.print(text);
        }
    }

    public static <T> void 输出(Collection<T> container) {
        java.util.Iterator<T> iter = container.iterator();
        while (true) {
            if(iter.hasNext()) {
                System.out.print(iter.next());
            } else {
                System.out.println();
                return;
            }
            if(iter.hasNext()) System.out.print(" ");
        }
    }

    public static <T> void 输出(Collection<T> container, String sep) {
        java.util.Iterator<T> iter = container.iterator();
        while (true) {
            if(iter.hasNext()) {
                System.out.print(iter.next());
            } else {
                System.out.println();
                return;
            }
            if(iter.hasNext()) System.out.print(sep);
        }
    }

    public static <T> ArrayList<T> 新ArrayList(T... args) {
        ArrayList<T> container = new ArrayList<>();
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
        return container;
    }

    public static <T> ArrayList<T> 新ArrayList() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> 新LinkedList(T... args) {
        LinkedList<T> container = new LinkedList<>();
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
        return container;
    }

    public static <T> LinkedList<T> 新LinkedList() {
        return new LinkedList<>();
    }

    public static <T> HashSet<T> 新HashSet(T... args) {
        HashSet<T> container = new HashSet<>();
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
        return container;
    }

    public static <T> HashSet<T> 新HashSet() {
        return new HashSet<>();
    }


    public static <T> TreeSet<T> 新TreeSet(Comparator<? super T> comparator, T... args) {
        TreeSet<T> container = new TreeSet<>(comparator);
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
        return container;
    }

    public static <T> TreeSet<T> 新TreeSet(Comparator<? super T> comparator) {
        return new TreeSet<>(comparator);
    }

    public static <T> TreeSet<T> 新TreeSet(T... args) {
        TreeSet<T> container = new TreeSet<>();
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
        return container;
    }

    public static <T> TreeSet<T> 新TreeSet() {
        return new TreeSet<>();
    }

    public static <T> void 添加元素(Collection<T> container, T... args) {
        for (int i = 0; i< args.length; i++) {
            container.add(args[i]);
        }
    }

    public static void 输出() {
        System.out.println();
    }

    public static <T> int 删除元素(Collection<T> container, T... args) {
        int count = 0;
        for (int i = 0; i< args.length; i++) {
            int arrSize = container.size();
            for (int j=0; j<arrSize; j++) {
                if (container.remove(args[i])) {
                    count++;
                    arrSize--;
                    j--;
                }
            }
        }
        return count;
    }

    public static void 分割线() {
        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
    }

    public static void 分割线(String sign) {
        for (int i = 0; i<50; i++) {
            System.out.print(sign);
        }
        System.out.println();
    }

    public static void 分割线(String sign,int num) {
        for (int i = 0; i<num; i++) {
            System.out.print(sign);
        }
        System.out.println();
    }

}

