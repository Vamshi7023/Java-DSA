package Recursion;

import java.util.*;

public class Recursion8 {

    // //Basics of Strings
    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);
    // String a = S.nextLine();//To print the whole line of the string
    // System.out.println(a);

    // char C = a.charAt(0);//Prints the letter at the index 0

    // System.out.println(C);
    // System.out.println(a.length());
    // for(int i = 0 ; i< a.length();i++){//Printing the characters individually
    // System.out.println(a.charAt(i));
    // }
    // System.out.println(a.substring(2, 6));//Prints the string from 2 index to 6
    // index only
    // System.out.println(a.substring(2));//Prints the letters from the idex 2 to
    // end of the string

    // }

    // Removing the letter a from the word

    // Using iteration process

    // static String remove(String A){
    // String a="";
    // for(int i=0;i<A.length();i++){
    // if(A.charAt(i)!='a'){
    // a+=A.charAt(i);
    // }
    // }
    // return a;
    // }

    // public static void main(String[] args) {
    // String F = "afraya";
    // System.out.println(remove(F));
    // }

    // USING RECURSION

    // static String f(String s,int idx){
    // //base case
    // if(idx==s.length()) return" ";

    // String b = f(s, idx+1);
    // char c=s.charAt(idx);
    // if(c!='a'){
    // return c+b;
    // }
    // else{
    // return b;
    // }

    // }
    // public static void main(String[] args) {
    // String s = "daba";
    // System.out.println(f(s, 0));

    // }






    // Write a program to print reverse of a string using recursion.

    // static String Reverse(String s, int idx) {
    //     // Base case
    //     if (idx == s.length()) {
    //         return "";
    //     }

    //     // recusive work
    //     String b = Reverse(s, idx + 1);

    //     // Self work
    //     char c = s.charAt(idx);
    //     return b + c;
    // }

    // public static void main(String[] args) {
    //     String s = "abcde";
    //     System.out.println(Reverse(s, 0));
    // }



    static String Reverse(String s, int idx) {
        // Base case
        if (idx == s.length()) {
            return "";
        }

        // recusive work
        String b = Reverse(s, idx + 1);

        // Self work
        char c = s.charAt(idx);

        return b + c;
    }

    public static void main(String[] args) {
        String s = "aba";
        String t =Reverse(s, 0);

        if(s.equals(t)){
            System.out.println("pal");
        }
        else{
            System.out.println("npal");
        }
    }



}
