package Recursion;

import java.util.Scanner;

public class Recursion1 {

    //Write a program to print all the natural numbers from 1 to n using recursion.

    // static void PrintIncreasing(int n){// 1 2 3 4 5

    //     //Base Case
    //     if(n == 1){
    //         System.out.println(n);
    //         return;
    //     }

    //     //Recursive Work
    //     PrintIncreasing(n-1);

    //     //Self Work
    //     System.out.println(n);
    // }
    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();

    //     PrintIncreasing(n);

    // }

    //Write a program to print all the natural numbers from n to 1 using recursion.

    static void PrintDecreasing(int n){ //5 4 3 2 1

        //Base case
        if(n==1){
            System.out.println(n);
            return;
        }

        //Self work
        System.out.println(n);

        //Recursive work
        PrintDecreasing(n-1);
    }
    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();

    //     PrintDecreasing(n);

    // }
}
