package JAVA_DSA_Course;

public class HashingSession25 {

    // Brute for approach
    // public static void addele(int arr[], int a) {
    // for (int i = a; i < arr.length; i++) {
    // arr[i] += 1;
    // }
    // for (int j = 0; j < arr.length; j++) {
    // System.out.print(arr[j]+" ");
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = new int[8];
    // int a = 1;
    // int b = 5;
    // addele(arr, a);
    // addele(arr, b);
    // }

    // Optimized approach
    public static void main(String[] args) {
        int arr[][] = { { 1, 7 }, { 5, 11 }, { 7, 9 } };

        int arr2[] = new int[12];
        for (int i = 0; i < arr.length; i++) {
            int l = arr[i][0];
            arr2[l] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            int r = arr[i][1];
            if (r+1 < arr2.length) {
                arr2[r + 1] += -1;
            }
        }
        for (int i = 1; i < arr2.length; i++) {
            arr2[i]+=arr2[i-1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
