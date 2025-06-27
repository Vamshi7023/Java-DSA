package Recursion;

import java.util.Scanner;

public class Recursion2 {

    //Print the factorial of the numbers using recursion

    static int factorial(int n){

        //Base Case
        if(n==0) return 1;

        //Recurcive Work
        int f = n*factorial(n-1);

        //Self Work
        return f;

    }
    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();

    //     System.out.println(factorial(n));
    // }



    //Write the program to find out the fibinacci series using recursion

    static int Fibonacci(int n){

        //Base Case
        if(n==0||n==1) return n;

        //Self Work And Recusive Work

        int f = Fibonacci(n-1)+Fibonacci(n-2);

        return f;
    }

    public static void main(String[] args) {
         Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        System.out.println(Fibonacci(n));
    }
    
}
