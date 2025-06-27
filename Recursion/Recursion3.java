package Recursion;

import java.util.*;



public class Recursion3 {
    

    //Sum of first n natural number using recursion

    static int SumOfNaturalNUmbers(int n){
        //Base Case
        if(n==1){
            return 1;
        }

        // Recursive Work
    
        int r=SumOfNaturalNUmbers(n-1);

        //Self Work
        int f=n;    

        return f+r;
    }



    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();

    //     System.out.println(SumOfNaturalNUmbers(n));
    // }


    //Write the progrm to find the sum of digits using recursion


    // static int SumOfDigits(int n){
    //     //Base Case
    //     if(n>=0&&n<=9) return n;

    //     //Recursive work
    //     int c = n%10; //To get the last digit if number

    //     int d = SumOfDigits(n/10); //To calculate the first digits

    //     return d+c;
    // }
    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();

    //     System.out.println(SumOfDigits(n));
    // }
    

    //Return the count of digits in a given number

    static int  Count(int n){

        //Base Case
            if(n>=0&&n<=9) return 1;
        //Recursive Work & Self Work

        int g =  Count(n/10);

        return 1+g ;

    }




    // static int Count(int n){
    //     if (n<=0)
    //         return 1;
    //     count(n%10);
    // }

    // public static void main(String[] args) {
    //     Scanner S = new Scanner(System.in);

    //     int n = S.nextInt();
    //     System.out.println(Count(n));
    // }



    //When Two numbers p and q, find thw value p power q using a recursive function

    static int power(int p, int q){

        //Base case
        if(q==0){
            return 1;
        }

        int s = power(p,q-1);

        int g= s* p;

        return g;

    }

    // public static void main(String[] args) {

    //     System.out.println(power(5, 4));
    // }
}