import java.util.Scanner;

public class Array3Ass {

    // Given an array sorted in increasing order of size n and an integer x, find if
    // there exists a
    // pair in the array whose absolute difference is exactly x.(n>1)

    static int diffrence(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == arr[i]) {
                    ans = arr[i];
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
        System.out.println(diffrence(arr));
    }

    // Given an array of size n, find the total number of occurrences of given
    // number x.

    // static int occurrences(int arr[]){
    // Scanner S = new Scanner(System.in);
    // System.out.println("Enter the number u want to check");
    // int x=S.nextInt();
    // int count=0;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==x){
    // count++;
    // }
    // }
    // return count;
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
    // System.out.println(occurrences(arr));

    // }

    // Given an array arr[] of size N-1 with integers in the range of [1, N], the
    // task is to find the
    // missing number from the first N integers. There are no duplicates in the
    // list.

    // static void range(int arr[], int n) {
    // for (int i = 0; i < n; i++) {
    // if (Math.abs(arr[i]) - 1 == n) {
    // continue;
    // }
    // int ind = Math.abs(arr[i]) - 1;
    // arr[ind] *= -1;
    // }
    // int ans = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] > 0) {
    // ans = i + 1;
    // System.out.println(ans);
    // return;
    // }
    // }
    // System.out.println(n + 1);

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
    // range(arr,n);

    // }

}
