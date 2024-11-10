package com.vicky;

import java.util.Arrays;

public class reversearray {


    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reversing(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }


    }
    public static void main(String[] args) {
        System.out.println("Reversing the array");

        int [] arr =  {1,2,3,4,5,6};
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,4,5,6};

        reversing(arr);
        reversing(arr1);
        reversing(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }



}
