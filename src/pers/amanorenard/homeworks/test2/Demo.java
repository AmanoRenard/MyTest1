package pers.amanorenard.homeworks.test2;

import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        int[]
                arr1 = {2, 1, 3},
                arr2 = {3, 4, 5},
                arr3 = {4, 5, 6};

        Arrays.
                sort(arr1);

        System.out.println(
                Arrays.toString(arr1)
                        + Arrays.toString(arr2)
                        + Arrays.toString(arr3)
        );

        System.out.printf(
                "这是第一个%d，这是第二个%d",
                arr1[0],
                arr2[0]
        );

    }
}
