package pers.amanorenard.homeworks.testSelf;

class Y220411 {
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,5,9,1};
        selectSort(arr);
        for (int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i=0;i<arr.length-1;i++) {
            boolean flag = false;
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j+1]<arr[j]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }

    public static void selectSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            int minInd = i;
            int temp;
            for (int j=i;j<arr.length;j++) {
                if (arr[j] < arr[minInd]) minInd = j;
            }
            if (i != minInd) {
                temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }

        }
    }
}
