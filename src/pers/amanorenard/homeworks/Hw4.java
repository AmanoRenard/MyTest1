package pers.amanorenard.homeworks;

class Hw4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("反转前的数组：{");
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]+"}");
        arrReverse(arr);
        System.out.print("反转后的数组：{");
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]+"}");
    }

    public static void arrReverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++) {
            int j = arr.length-i-1;
            if (i!=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
