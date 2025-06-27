package Stacks;

import java.util.Scanner;

import java.util.Stack;

public class Stack2 {

    // Balance check (())())-> not balanced ((()))->balnced

    // public static boolean BalanceCheck(String st) {
    // Stack<Character> s = new Stack<>();
    // int n = st.length();
    // for (int i = 0; i < n; i++) {
    // char ch = st.charAt(i);
    // if (ch == '(') {
    // s.push(ch);
    // } else {
    // if (s.size() == 0)
    // return false;
    // if (s.peek() == '(') {
    // s.pop();
    // }
    // }
    // }

    // if (s.size() > 0)
    // return false;
    // return true;
    // }

    // public static void main(String[] args) {
    // Scanner S = new Scanner(System.in);

    // String st = S.nextLine();
    // Stack<Character> s = new Stack<>();
    // int n = st.length();
    // for (int i = 0; i < n; i++) {
    // char ch = st.charAt(i);
    // if (ch == '(') {
    // s.push(ch);
    // } else {
    // if (s.size() == 0)
    // System.out.println(false);
    // ;
    // if (s.peek() == '(') {
    // s.pop();
    // }
    // }
    // }

    // if (s.size() > 0) {
    // System.out.println(false);
    // }

    // else {
    // System.out.println(true);
    // }

    // }

    // Remove consecutive subsequence eg:1,2,2,3,10,10,4,4,4,5,7,7,2 output -->
    // 1,3,5,2

    // public static int[] Remove(int arr[]) {
    // int n = arr.length;
    // Stack<Integer> s = new Stack<>();
    // for (int i = 0; i < n; i++) {
    // if (s.size() == 0 || s.peek() != arr[i])
    // s.push(arr[i]);

    // else if (arr[i] == s.peek()) {
    // if (i == n - 1 || arr[i] != arr[i + 1])
    // s.pop();
    // }
    // }

    // int[] res = new int[s.size()];
    // int m = res.length;
    // for (int i = m - 1; i >= 0; i--) {
    // res[i] = s.pop();
    // }

    // return res;
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };

    // int res[] = Remove(arr);

    // for (int i = 0; i < res.length; i++) {
    // System.out.print(res[i] + " ");
    // }
    // }

    // Next greatest elements

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    // Next greater element using stack

    // public static void NextGreater(int arr[]) {
    // Stack<Integer> s = new Stack<>();
    // int n = arr.length;
    // s.push(arr[n - 1]);// First push the last-1 element
    // int res[] = new int[n];
    // res[n - 1] = -1;

    // // Traverse the array from right to left
    // for (int i = n - 2; i >= 0; i--) {

    // // Pop elements from the stack while the current element is greater than the
    // top
    // // of the stack
    // while (s.size() > 0 && s.peek() < arr[i]) {
    // s.pop();
    // }

    // // If the stack is empty, there is no greater element to the right
    // if (s.size() == 0) {
    // res[i] = -1;
    // }

    // else {
    // res[i] = s.peek();
    // }
    // // Push the current element onto the stack
    // s.push(arr[i]);
    // }

    // for (int i = 0; i < n; i++) {
    // System.out.println(res[i]);
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
    // NextGreater(arr);
    // }

    // Next smallest element
    // public static void NextSmallestelement(int arr[]){
    // Stack <Integer> s = new Stack<>();
    // int n =arr.length;
    // s.push(arr[n-1]);//First push the last-1 element
    // int res []= new int[n];
    // res[n-1]=-1;

    // //Traverse the array from right to left
    // for(int i=n-2;i>=0;i--){

    // // Pop elements from the stack while the current element is Small than the
    // top of the stack
    // while(s.size()>0 && s.peek()>arr[i]){
    // s.pop();
    // }

    // // If the stack is empty, there is no greater element to the right
    // if(s.size()==0) res[i] =-1;

    // else res[i] = s.peek();

    // // Push the current element onto the stack
    // s.push(arr[i]);
    // }

    // for(int i=0;i<n;i++){
    // System.out.println(res[i]);
    // }
    // }

    // Next smallest element Index --> returns the Index of the next smallest
    // element
    // public static void nextSmallestElement(int arr[]) {
    // Stack<Integer> s = new Stack<>();
    // int n = arr.length;
    // int res[] = new int[n];

    // // Initialize the result for the last element
    // s.push(n - 1);
    // res[n - 1] = -1;

    // for (int i = n - 2; i >= 0; i--) {
    // // Pop elements from the stack while they are greater than or equal to arr[i]
    // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    // s.pop();
    // }
    // // If stack is empty, then no smaller element to the right
    // if (s.isEmpty()) {
    // res[i] = -1;
    // } else {
    // res[i] = s.peek();
    // }
    // // Push this element's index into the stack
    // s.push(i);
    // }

    // // Print the result array
    // for (int i = 0; i < n; i++) {
    // System.out.print(res[i] + " ");
    // }
    // }

    // public static void main(String[] args) {
    // int arr [] = {1,3,-1,-3,5,3,6,7};
    // nextSmallestElement(arr);
    // }

    // Previous Smallest element Index --> returns the element of the previous
    // smallest element

    // public static void previousSmallerElement(int arr[]) {
    // Stack<Integer> s = new Stack<>();
    // int n = arr.length;
    // int res[] = new int[n];

    // // Initialize the result for the first element
    // res[0] = -1;
    // s.push(0);

    // for (int i = 1; i < n; i++) {
    // // Pop elements from the stack while they are greater than or equal to arr[i]
    // while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
    // s.pop();
    // }
    // // If stack is empty, then no smaller element to the left
    // if (s.isEmpty()) {
    // res[i] = -1;
    // } else {
    // res[i] = s.peek();
    // }
    // // Push this element's index into the stack
    // s.push(i);
    // }

    // // Print the result array
    // for (int i = 0; i < n; i++) {
    // System.out.print(res[i] + " ");
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = {4, 1, 2, 4, 3, 5};
    // previousSmallerElement(arr);
    // }

    // Given an array of integer heights representing the histograph bar height
    // where the width of each bar is l return the area of the largest rectangle in
    // the histogram

    // public static void histogram(int arr[]){
    // int n = arr.length;
    // Stack <Integer> st = new Stack<>();
    // int[] nse = new int[n];
    // int[] pse = new int[n];

    // //Calculate Next Smaller element
    // st.push(n-1);
    // nse[n-1]=n;
    // for(int i=n-2;i>=0;i--){
    // while(st.size()>0&&arr[st.peek()]>arr[i]){
    // st.pop();
    // }
    // if(st.size()==0){
    // nse[i]=n;
    // }
    // else{
    // nse[i]=st.peek();
    // }
    // st.push(i);
    // }
    // //Empty the stack
    // while (!st.isEmpty()) {
    // st.pop();
    // }
    // //Caluculate Previous smallest element
    // st.push(0);
    // pse[0] = -1;
    // for(int i=1;i<n;i++){
    // while (st.size()>0&&arr[st.peek()]>arr[i]) {
    // st.pop();
    // }

    // if(st.size()==0) pse[i]=-1;

    // else{
    // pse[i]=st.peek();
    // }
    // st.push(i);
    // }

    // //Maximum area of rectangle
    // int max = 0;
    // for(int i=0;i<n;i++){
    // int area = arr[i]*(nse[i]-pse[i]-1);
    // max = Math.max(max, area);
    // }
    // System.out.println(max);
    // }

    // public static void main(String[] args) {
    // int arr[]={2,1,5,6,2,3};
    // histogram(arr);
    // }

    // Creating the get minimum function in stack;

    // Done in leetcode https://leetcode.com/problems/min-stack/ refer only method 1
    // mehod 2 confusing

    // public static void getmin(int arr[]){
    // Stack<Integer> st = new Stack<>();
    // Stack<Integer> gt = new Stack<>();
    // for(int i=0;i<arr.length;i++){
    // if(st.size()==0){
    // st.push(arr[i]);
    // gt.push(arr[i]);
    // }
    // else{
    // st.push(arr[i]);
    // if(st.peek()<gt.peek()) gt.push(st.peek());

    // else gt.push(gt.peek());
    // }
    // }

    // System.out.println(st);
    // System.out.println(gt);

    // }
    // public static void main(String[] args) {
    // int arr[] = {10,12,3,5,8,1};
    // getmin(arr);
    // }

}
