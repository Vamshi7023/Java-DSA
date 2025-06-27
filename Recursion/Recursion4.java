package Recursion;

import java.util.Scanner;

public class Recursion4 {

    static void multiple(int n,int k){
        //Base case 
        if(k==1){ 
            System.out.println(n);
            return ;
            }

        //recursive work 
        multiple(n, k-1);

        //Self work
        System.out.println(n*k);

        

    }
    public static void main(String[] args) {
     Scanner S = new Scanner (System.in);

     multiple(12, 5);   
    }


    //write a program to find the sum of the series 


    //     static int sum(int n){

    //         if(n==1) return 1;

    //         int f = sum(n-1)+n;

    //         return f;
    //     }

    // public static void main(String[] args) {
    //    System.out.println( sum(5));
    // }


    //Given a numbber n.Find the sum of natural numbers till n but with alternate signs.

    static int AlternateSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            int g = AlternateSum(n-1)-n;
            return g;
        }
        else{
            int h = AlternateSum(n-1)+n;
            return h;
        }
    }
    // public static void main(String[] args) {
    //     System.out.println(AlternateSum(10));
    // }

}
