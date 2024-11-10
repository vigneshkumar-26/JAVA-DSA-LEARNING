package com.vicky;
import java.util.Scanner;

public class primenumber
{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();

        boolean isprime = true;

        int c = 2;

        while(c<number)
        {
            if (number % c == 0)
            {
                isprime = false;
                break;
            }
            c = c + 1;
        }


            if(isprime==true)
            {
                System.out.println("it is prime number");
            }
            else
            {
                System.out.println("it is not prime");
            }


    }
}


































































//        public static void main(String[] args) {
//            // Take input
//            System.out.println("Enter the number:");
//            Scanner scan = new Scanner(System.in);
//            int num = scan.nextInt();
//
//            // taking boolean
//            boolean isPrime = true;
//
//            // Start checking from c = 2
//            int c = 2;
//
//            // Loop to check divisibility until c is less than num
//            while (c < num) {
//                if (num % c == 0) { // If num is divisible by c, it's not prime
//                    isPrime = false;
//                    break;
//                }
//                c = c + 1; // Increment c
//            }
//
//            // Output result based on isPrime flag
//            if (isPrime) {
//                System.out.println(num + " is a prime number.");
//            } else {
//                System.out.println(num + " is not a prime number.");
//            }
//
//
//        }
//    }
