package com.vicky;
import java.util.Arrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {


        String[] greeting = {"hi","hello","welcome"};
        change(greeting);
        System.out.println(Arrays.toString(greeting));




        //below is for the void function and also used for sout
//        numbers();

        // below is for the return type function
        int vs = numericals();
        System.out.println(vs);

        // below is the return type for string

        String ammu_appu = names();
        System.out.println(ammu_appu);


    }

    static  void change(String[] num){
        num[0] = "vanakam da  mapla";
    }





//
//    static void numbers(){



//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("enter the num1");
//        int num1 = scan.nextInt();
//        System.out.println("enter the num2");
//        int num2 = scan.nextInt();
//
//        int sum = num1+num2;
//
//        System.out.println("the addition of the numbers :"+sum);
//
//        if (sum == 69){
//            System.out.println("today iam going to fuck sharon hardly");
//        }
//        else{
//            System.out.println("sharon has periods");
//        }
//    }


    static String names(){



        Scanner scan = new Scanner(System.in);
        System.out.println("enter name 1");
        String name1 = scan.nextLine();
        System.out.println("enter name 2");
        String name2 = scan.nextLine();


        String names = name1+" "+name2;

        return names;

    }

    static int numericals(){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter vicky roll no");
        int vickyroll = scan.nextInt();
        System.out.println("enter sharon roll no");
        int sharonroll = scan.nextInt();

        int sv = vickyroll-sharonroll;
        return sv;




    }
}

//public class demo {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the number1");
//        int number1 = scan.nextInt();
//        System.out.println("enter the number2");
//        int number2 = scan.nextInt();
//        int sum = number1 + number2;
//        System.out.println("by adding the number is "+ sum);
//
//
//
//
//
//    }
//
//
//
//
//}
