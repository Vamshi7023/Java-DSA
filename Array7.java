import java.util.Scanner;

public class Array7 {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // //Two dimentional Array
    public static void main(String[] args) {

        // //First way of representing the two dimentional array

        // int [][] arr = {
        // {1,2,4},
        // {1,1,3},
        // {1,1,3}
        // };

        // System.out.println("Array1");
        // printArray(arr);

        // //Second way of representing the array

        // int[][] arr2 = new int [3][3];

        // arr2[0][0] = 1;
        // arr2[0][1] = 2;
        // arr2[0][2] = 3;
        // arr2[1][0] = 4;
        // arr2[1][1] = 5;
        // arr2[1][2] = 6;
        // arr2[2][0] = 7;
        // arr2[2][1] = 8;
        // arr2[2][2] = 9;

        // System.out.println("Array2");
        // printArray(arr2);

        // //By user input

        Scanner S = new Scanner(System.in);

        System.out.println("Number of rows");
        int r = S.nextInt();
        System.out.println("Number of columns");
        int c = S.nextInt();

        int arr3[][] = new int[r][c];

        System.out.println("Enter " + r * c + "Elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                arr3[i][j] = S.nextInt();
            }
        }

        System.out.println("Array3");
        printArray(arr3);

    }

    // Addition of two matrixes

    // static void printArray(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    // static void AddMatrix(int arr[][], int r1, int c1, int arr2[][], int r2, int
    // c2) {

    // if (r1 != r2 || c1 != c2) {
    // System.out.println("ADDITION IS NOT POSSIBLE ");
    // return;
    // }

    // int sum[][] = new int[r1][c1];

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {
    // sum[i][j] = arr[i][j] + arr2[i][j];
    // }
    // }

    // printArray(sum);

    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // System.out.println("Number of rows");
    // int r1 = S.nextInt();
    // System.out.println("Number of columns");
    // int c1 = S.nextInt();

    // int arr3[][] = new int[r1][c1];

    // System.out.println("Enter " + r1 * c1 + "Elements");

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {

    // arr3[i][j] = S.nextInt();
    // }
    // }

    // System.out.println("Array3");

    // // Second matrix

    // System.out.println("THIS IS FOR SECOND MATRIX");
    // System.out.println("Number of rows SECOND MATRIX");
    // int r2 = S.nextInt();
    // System.out.println("Number of columns SECOND MATRIX");
    // int c2 = S.nextInt();

    // int arr4[][] = new int[r2][c2];

    // System.out.println("Enter " + r2 * c2 + "Elements");

    // for (int i = 0; i < r2; i++) {
    // for (int j = 0; j < c2; j++) {

    // arr4[i][j] = S.nextInt();
    // }
    // }

    // System.out.println("Array3");

    // AddMatrix(arr3, r1, c1, arr4, r2, c2);

    // }

    // Multiplecation of matrixes

    // static void printArray(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    // static void Multiplecation(int arr[][], int r1, int c1, int arr2[][], int r2,
    // int c2) {

    // if (c1 != r2) {
    // System.out.println("Multiplication IS NOT POSSIBLE ");
    // return;
    // }

    // //C10=(a10.b00)+(a11.b10)+(a12.b20)+(a13.b30)

    // int mull[][] = new int[r1][c2];

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c2; j++) {
    // for(int k=0;k<c1;k++){
    // mull[i][j]+=arr[i][k]*arr2[k][j];
    // }
    // }
    // }

    // printArray(mull);

    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // System.out.println("Number of rows");
    // int r1 = S.nextInt();
    // System.out.println("Number of columns");
    // int c1 = S.nextInt();

    // int arr3[][] = new int[r1][c1];

    // System.out.println("Enter " + r1 * c1 + "Elements");

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {

    // arr3[i][j] = S.nextInt();
    // }
    // }

    // System.out.println("Array3");

    // // Second matrix

    // System.out.println("THIS IS FOR SECOND MATRIX");
    // System.out.println("Number of rows SECOND MATRIX");
    // int r2 = S.nextInt();
    // System.out.println("Number of columns SECOND MATRIX");
    // int c2 = S.nextInt();

    // int arr4[][] = new int[r2][c2];

    // System.out.println("Enter " + r2 * c2 + "Elements");

    // for (int i = 0; i < r2; i++) {
    // for (int j = 0; j < c2; j++) {

    // arr4[i][j] = S.nextInt();
    // }
    // }

    // System.out.println("Array3");

    // Multiplecation(arr3, r1, c1, arr4, r2, c2);

    // }

    // // Addition off Two Matrix
    // static void Addition(int arr1[][], int r1, int c1, int arr2[][], int r2, int
    // c2) {
    // if (r1 != c1 && r2!= c2) {
    // System.out.println("Addition is not possible");
    // return;
    // }
    // int sum[][] = new int[r1][c1];

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {

    // sum[i][j]=arr1[i][j]+arr2[i][j];
    // }
    // }

    // for(int i=0;i<r1;i++){
    // for(int j=0;j<c1;j++){
    // System.out.print(sum[i][j]+" ");
    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);

    // int r1 = s.nextInt();
    // int c1 = s.nextInt();
    // int arr1[][] = new int[r1][c1];
    // System.out.println("Enter" + r1 * c1 + "Elements");

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {
    // arr1[i][j] = s.nextInt();
    // }
    // }

    // int r2 = s.nextInt();
    // int c2 = s.nextInt();
    // int arr2[][] = new int[r2][c2];
    // System.out.println("Enter" + r2 * c2 + "Elements");

    // for (int i = 0; i < r2; i++) {
    // for (int j = 0; j < c2; j++) {
    // arr2[i][j] = s.nextInt();
    // }
    // }
    // Addition(arr1, r1, c1, arr2, r2, c2);
    // }

    // Multiplecation of two matrix

    // static void multiplecation(int arr1[][], int r1, int c1, int arr2[][], int
    // r2, int c2){
    // if(c1!=r2){
    // System.out.println("Multplecation is not possibble");
    // return;
    // }
    // int mul [ ][] = new int [r1][c2];
    // for(int i=0;i<r1;i++){
    // for(int j=0;j<c2;j++){
    // for(int k=0;k<r1;k++){
    // mul[i][j] = + (arr1[i][k]*arr2[k][j]);
    // }
    // }
    // }
    // }
    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);

    // int r1 = s.nextInt();
    // int c1 = s.nextInt();
    // int arr1[][] = new int[r1][c1];
    // System.out.println("Enter" + r1 * c1 + "Elements");

    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c1; j++) {
    // arr1[i][j] = s.nextInt();
    // }
    // }

    // int r2 = s.nextInt();
    // int c2 = s.nextInt();
    // int arr2[][] = new int[r2][c2];
    // System.out.println("Enter" + r2 * c2 + "Elements");

    // for (int i = 0; i < r2; i++) {
    // for (int j = 0; j < c2; j++) {
    // arr2[i][j] = s.nextInt();
    // }
    // }
    // }
}
