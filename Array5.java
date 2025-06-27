import java.util.Scanner;

public class Array5 {

    // sorting the array using only 0 and 1

    // static void printArray(int[] arr){
    // for(int i=0;i<arr.length;i++){
    // System.out.println(arr[i]+ " ");
    // }
    // }

    // static void sortarray(int arr[]){
    // int n= arr.length;
    // int zeros = 0;
    // for(int i=0;i<n;i++){
    // if(arr[i]==0){
    // zeros++;
    // }
    // }

    // for(int i=0;i<n;i++){
    // if(i<zeros){
    // arr[i]=0;
    // }
    // else{
    // arr[i]=1;
    // }
    // }
    // }

    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter the size");
    // int n = s.nextInt();

    // int arr[] = new int[n];
    // System.out.println("Enter the ele");

    // for(int i=0;i<n;i++){
    // arr[i]=s.nextInt();
    // }

    // sortarray(arr);

    // System.out.println("Sorted array");

    // printArray(arr);
    // }

    // sorting array using time and space complexity

    // static void printArray(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i] + " ");
    // }
    // }

    // static void swaparray(int[] arr, int left, int right) {
    // left = 0;
    // right = arr.length - 1;

    // while (left < right) {
    // if (arr[left] == 1 && arr[right] == 0) {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;

    // left++;
    // right--;
    // }

    // else if(arr[left]==0 && arr[right]==1){
    // left++;
    // right--;
    // }
    // }
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

    // swaparray(arr, n, n);

    // System.out.println("Sorted array");

    // printArray(arr);
    // }





//Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.


    // static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // static void sortArrayByParrity(int[] arr) {
    //     int left=0;
    //     int right=arr.length-1;
    //     while (left < right) {
            
    //         if (arr[left]%2 == 1 && arr[right] % 2 == 0) {
    //             int temp = arr[left];
    //             arr[left] = arr[right];
    //             arr[right] = temp;
    //             left++;
    //             right--;
    //         }

    //         else if(arr[left]%2==0 && arr[right]%2==1){
    //             left++;
    //             right--;
    //         }
    //     }
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

    //     System.out.println("Original ele");
    //     printArray(arr);

    //     sortArrayByParrity(arr);

    //     System.out.println("Sorted array");

    //     printArray(arr);
    // }




    //
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int [] reverseArray(int arr[] ){
        int n =arr.length;
        int ans []=new int[n];
        int j =0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }

    static void sortSquares(int arr[]){
        int i = 0;
        int j= arr.length-1;

        while(i<=j){
            if(i>j){
                arr[i]=arr[i] * arr[i];
                i++;
            }

            else{
                arr[j]=arr[j]*arr[j];
                j--;
            }
        }

        
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

        System.out.println("Original ele");
        printArray(arr);

       sortSquares(arr);

        System.out.println("Sorted array");

        int [] sortSquares = reverseArray(arr);
        printArray(sortSquares);
    }

}
