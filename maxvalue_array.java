package com.vicky;

import org.w3c.dom.ls.LSOutput;

public class maxvalue_array {
    public static void main(String[] args) {
        System.out.println("maximum value of an array");

        System.out.println();

        int[] arr = {1,2,3,4,5};

        System.out.println("the maximum value of the array");
        System.out.println(max(arr));

        System.out.println("the maximum value of the array in range");
        System.out.println(maxrange(arr, 1, 3));


    }


    static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {

                maximum = arr[i];
            }

        }
        return maximum;


    }

    static int maxrange(int[] arr, int start, int end) {
        int maximum = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }

        }

        return maximum;


    }

}




