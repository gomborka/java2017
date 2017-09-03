package com.borka;

public class Main {
    int result=0;
    public static void main(String[] args) {

        int [] arr = {4,8,-7,200,500};
    //    Calculate(arr);
     //   Calculate (arr);
        maxNum(arr);
    }

    public static void Calculate(int[] arr)
    { int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result = (int) (result +  (Math.pow(10, i) * arr[arr.length - i - 1]));
        }
        System.out.println(result/2);

    }

    public static void Calculate2(int[] arr)
    { int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result = result + arr[i]*10*(arr.length-i);
        }
        System.out.println(result/2);

    }

    public static void maxNum(int [] arr)
    {  int max= arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length;i++) {
            if (max < arr[i]) {
                 max = arr[i];
            }
            if (min > arr [i])
            {
                min =arr [i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

}
