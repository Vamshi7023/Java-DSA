import java.util.*;

public class Array8 {

    // Transpose of the given matrix

    // static void printmatrix(int arr[][]){
    // for (int i=0;i<arr.length;i++){
    // for(int j=0;j<arr[i].length;j++){
    // System.out.print(arr[i][j]+" ");
    // }
    // System.out.println();
    // }
    // }

    // static int [][] Transpose(int arr[][],int r,int c){
    // int transpose[][] = new int[c][r];//Column first and row second because in
    // transpose row becomes column and column becomes row

    // for(int i=0;i<c;i++){
    // for(int j=0;j<r;j++){
    // transpose[i][j] = arr[j][i];
    // }
    // }
    // return transpose;
    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // System.out.println("Enter Number of rows");
    // int r = S.nextInt();
    // System.out.println("Number of columbs");
    // int c = S.nextInt();

    // int arr [][] = new int[r][c];

    // System.out.println("Enter " + r*c+" elements");

    // for(int i=0;i<r;i++){
    // for(int j=0;j<c;j++){
    // arr [i][j] = S.nextInt();
    // }
    // }
    // System.out.println("Input Matrix");
    // printmatrix(arr);

    // System.out.println("Transposed array");
    // int transpose [][] = Transpose(arr, r, c);

    // printmatrix(transpose);

    // }


    

    // Transpose of the given matrix in place (without using the extra array)

    // static void printmatrix(int arr[][]){
    // for (int i=0;i<arr.length;i++){
    // for(int j=0;j<arr[i].length;j++){
    // System.out.print(arr[i][j]+" ");
    // }
    // System.out.println();
    // }
    // }

    // static void Transpose(int arr[][],int r,int c){

    // for(int i=0;i<c;i++){
    // for(int j=i;j<r;j++){
    // int temp = arr[i][j];
    // arr[i][j] = arr[j][i];
    // arr[j][i] = temp;
    // }
    // }

    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // System.out.println("Enter Number of rows");
    // int r = S.nextInt();
    // System.out.println("Number of columbs");
    // int c = S.nextInt();

    // int arr [][] = new int[r][c];

    // System.out.println("Enter " + r*c+" elements");

    // for(int i=0;i<r;i++){
    // for(int j=0;j<c;j++){
    // arr [i][j] = S.nextInt();
    // }
    // }
    // System.out.println("Input Matrix");
    // printmatrix(arr);

    // System.out.println("Transposed array");
    // Transpose(arr, r, c);

    // printmatrix(arr);

    // }

    // Given a square matrix turn it by 90 degrees in a clockwise direction without
    // using any extra space

    static void printmatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Transpose(int arr[][], int r, int c) {

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverse(int arr[]) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    static void rotate(int arr[][], int r, int c) {

        // Step 1 Transpose the given matrix
        Transpose(arr, r, c);

        // Step 2 Rotate the given Matrix
        for (int i = 0; i < r; i++) {
            reverse(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Number of rows");
        int r = S.nextInt();
        System.out.println("Number of columbs");
        int c = S.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter " + r * c + " elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = S.nextInt();
            }
        }

        System.out.println("Original Matrix");
        printmatrix(arr);

        System.out.println("90 degree Rotation");
        rotate(arr, r, c);
        printmatrix(arr);
    }

    // Pascals Triangle

    // static void printmatrix(int arr[][],int r,int c){
    // for(int i=0;i<arr.length;i++){
    // for(int j=0;j<arr[i].length;j++){
    // System.out.print(arr[i][j]+ " ");
    // }
    // System.out.println();
    // }
    // }

    // static int [][] Pascals(int n){
    // int ans[][] = new int[n][];
    // for(int i=0;i<n;i++){
    // //Step 1 ith row has i+1 columns
    // ans[i] = new int [i+1];

    // //1st and last element of every row is 1
    // ans[i][0] = ans[i][i] = 1;

    // //Addition of upper two elements

    // for(int j=1;j<i;j++){ //i=1 because 0 colum is already filled and less then i
    // because last columb is also already filled
    // ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
    // }
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // int n= S.nextInt();

    // int ans[][] = Pascals(n);

    // printmatrix(ans, n, n);
    // }



    //updated one
}
