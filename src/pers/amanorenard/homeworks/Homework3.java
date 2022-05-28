package pers.amanorenard.homeworks;

import java.util.ArrayList;
import java.util.Collections;

class Homework3 {
    public static void main(String[] args) {
        int[] arr = {1,25,3,777,5,666};
        int[] result = getNum1(arr);
        System.out.println("调用方法1返回的\n最大值："+result[0]+"\n最小值："+result[1]);
        result = getNum2(arr);
        System.out.println("\n调用方法2返回的\n最大值："+result[0]+"\n最小值："+result[1]);
    }

    public static int[] getNum1(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            al.add(arr[i]);
        }
        return new int[]{Collections.max(al),Collections.min(al)};
    }

    public static int[] getNum2(int[] arr){
        int max = arr[0],min=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (max < arr[i]) {
                    max=arr[i];
            } else if(min> arr[i]) {
                min = arr[i];
            }
        }
        return new int[]{max,min};
    }

}
