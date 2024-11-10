package com.vicky;

import java.util.Arrays;

public class array_swap_question {
    public static void main(String[] args) {
        System.out.println("array swap question");
        int[] arr = {1,0,2,3,4,5};
        swap(arr,0,1);

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[]arr,int index0,int index1){
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
    }
}
