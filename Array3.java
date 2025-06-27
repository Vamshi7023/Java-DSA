import java.util.Scanner;

public class Array3 {

    // Find the total number of pair in the Array whose sum is equal to the given
    // value

    // static int Add(int arr[], int sum) {
    // int ans = 0;
    // for (int i = 0; i < arr.length; i++) {// First numer
    // for (int j = i + 1; j < arr.length; j++) {// Second number
    // if (arr[i] + arr[j] == sum) {
    // ans++;
    // }
    // }
    // }
    // return ans;
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

    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // System.out.println("Enter target sum value");
    // int sum = s.nextInt();
    // System.out.println(Add(arr, sum));
    // }

    // Count the number of tripletes whose sum is equal to the given value X.

    static int Add(int arr[], int sum) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {// First numer
            for (int j = i + 1; j < n; j++) {// Second number
                for (int k = j + 1; k < n; k++) {// Third number
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        ans++;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the ele");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter target sum value");
        int sum = s.nextInt();
        System.out.println(Add(arr, sum));
    }

    // Find the unique number in a given array where all the elements are being
    // repeated twice with one value being unique

    // static int unique(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // arr[i] = -1;
    // arr[j] = -1;
    // }
    // }
    // }

    // // traversing the array again for finding the greatest number

    // int ans = -1;
    // for (int k = 0; k < arr.length; k++) {
    // if (arr[k] > 0) {
    // ans = arr[k];
    // }
    // }

    // return ans;
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

    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();

    // // System.out.println("Enter target sum value");
    // // int sum = s.nextInt();
    // System.out.println("Unique element");
    // System.out.println(unique(arr));
    // }

    // Find the Second Largest ele in the given array

    // static int findMax(int arr[]){
    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]>max){
    // max=arr[i];
    // }
    // }
    // return max;

    // }//Finding the max value

    // static int SecondLargest(int arr[]){
    // int max = findMax(arr);//Example: Max value 5

    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==max){
    // arr[i]= Integer.MIN_VALUE;//canging the max value to -infinity
    // }
    // }
    // System.out.println("Second max");
    // int secondMax = findMax(arr);
    // return secondMax;//finding the second max
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

    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // System.out.println("Enter target sum value");
    // int sum = s.nextInt();
    // System.out.println(SecondLargest(arr));
    // }

    // Given an array a consisting of integer.Return the first value that is
    // repeating in this array.If no value is being repeated return -1

    // static int repeated(int arr[]){
    // int ans =0;
    // for(int i =0;i<arr.length;i++){
    // for(int j=i+1;j<arr.length;j++){
    // if(arr[i]==arr[j]){
    // ans = arr[i];
    // }
    // else{
    // return -1;
    // }
    // }
    // }
    // System.out.println("Repeated number is");
    // return ans;
    // }

    // public static void main (String [] args){
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter the size");
    // int n = s.nextInt();

    // int arr[] = new int[n];
    // System.out.println("Enter the ele");

    // for (int i = 0; i < n; i++) {
    // arr[i] = s.nextInt();
    // }

    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println(repeated(arr));
    // }

}
