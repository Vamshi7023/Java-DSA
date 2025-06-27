import java.util.Scanner;

public class Array6 {

    // prifix of the array
    // static void printArray(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // static int [] prefix(int arr[]){
    // int n = arr.length;
    // int [] pref = new int[n];
    // pref[0]=arr[0];
    // for(int i=1;i<n;i++){
    // pref[i]=pref[i-1]+arr[i];
    // }

    // return pref;
    // }
    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter the size");
    // int n = s.nextInt();

    // int arr[] = new int[n];
    // System.out.println("Enter the ele");

    // for (int i = 0; i < n; i++) {
    // arr[i] = s.nextInt();
    // }

    // int[] pref = prefix(arr);

    // printArray(pref);
    // }

    // finding the prifix of the array with out creating the another array

    // static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // static int[] prefix(int arr[]) {
    //     int n = arr.length;
    //     for (int i = 1; i < n; i++) {
    //         arr[i] = arr[i - 1] + arr[i];
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n = s.nextInt();

    //     int arr[] = new int[n];
    //     System.out.println("Enter the ele");

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = s.nextInt();
    //     }

    //     int[] pref = prefix(arr);

    //     printArray(pref);
    // }



    //Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 tor (both included). Note: The values of I and r in queries follow 1-based indexing

    // static int[] makePrefixSumArray(int arr[]) {
    //     int n = arr.length;
    //     for (int i = 1; i < n; i++) {
    //         arr[i] = arr[i - 1] + arr[i];
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n = s.nextInt();

    //     int arr[] = new int[n+1];
    //     System.out.println("Enter the ele");

    //     for (int i = 1; i <= n; i++) {
    //         arr[i] = s.nextInt();
    //     }

    //     int[] pref = makePrefixSumArray(arr);

    //     System.out.println("Enter the number of queries");
    //     int q = s.nextInt();

    //     while (q>0){
    //         System.out.println("Enter the range");

    //         int l = s.nextInt();

    //         int r = s.nextInt();

    //         int sum = pref[r]-pref[l-1];

    //         System.out.println(sum);

    //     }

    // }



    //Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of part of the array is equal to the suffix sum of rest of the array.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the ele");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        //int[] pref = prefix(arr);

        //printArray(pref);
    }




    //Last one from the Video 21 of the array 
    
}
