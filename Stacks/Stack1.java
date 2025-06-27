package Stacks;

import java.util.Scanner;

import java.util.Stack;

public class Stack1 {

    // Operations on Stack

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // //Pushing the elemants into the stack
    // s.push(100);
    // s.push(0);
    // s.push(30);
    // s.push(45);

    // System.out.println("The pushed elements in the stack are "+s);

    // //Poping the elements

    // s.pop(); //Removes the top most element of the stack

    // System.out.println("After poping the element of the stack "+s);

    // System.out.println(s.isEmpty());//Returns true or false and checks te stack
    // is empty or not

    // System.out.println(s.size());//Return the size of the stack

    // System.out.println(s.peek());//Return the top element of the stack

    // }

    // Taking input in the stack
    // public static void main(String[] args) {
    // Stack <Integer> st = new Stack<>();

    // Scanner s = new Scanner(System.in);

    // int n = s.nextInt();
    // System.out.println("Enter "+n +"elemtns ");

    // for(int i = 0;i<n;i++){
    // int x = s.nextInt();
    // st.push(x);
    // }

    // System.out.println(st);
    // }

    // Reversing the stack

    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // System.out.println(s);
    // // Stack<Integer> r = new Stack<>();
    // // while (s.size() > 0) {
    // // int w = s.peek();

    // // r.push(w);
    // // s.pop();
    // // }
    // // System.out.println(r);

    // // -------U can use above or belove method cannot use both--------

    // // You can reverse in these order also
    // // Stack<Integer> t = new Stack<>();
    // // while (s.size() > 0) {
    // // t.push(s.pop());
    // // }

    // // System.out.println(t);
    // }

    // Coping the stack in the same order into the other stack

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // System.out.println(s);
    // Stack <Integer> r = new Stack<>();
    // while (s.size()>0) {
    // int t = s.peek();
    // r.push(t);
    // s.pop();
    // }
    // System.out.println(r);

    // Stack <Integer> c = new Stack<>();
    // while(r.size()>0){
    // int q = r.peek();
    // c.push(q);
    // r.pop();
    // }
    // System.out.println(c);
    // }

    // Entering the integers in the first stack in reverse order using 2 other
    // stacks

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();
    // s.push(0);
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // System.out.println(s);
    // Stack <Integer> r = new Stack<>();
    // while (s.size()>0) {
    // int t = s.peek();
    // r.push(t);
    // s.pop();
    // }
    // //System.out.println(r);

    // Stack <Integer> c = new Stack<>();
    // while(r.size()>0){
    // int q = r.peek();
    // c.push(q);
    // r.pop();
    // }
    // //System.out.println(c);
    // while (c.size()>0) {
    // int d= c.peek();
    // s.push(d);
    // c.pop();
    // }
    // System.out.println(s);

    // }

    // Insert at bottom of the stack

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // Stack <Integer> r = new Stack<>();

    // while(s.size()>0){
    // int x =s.peek();
    // r.push(x);
    // s.pop();
    // }

    // s.push(5);

    // while (r.size()>0) {
    // int q = r.peek();
    // s.push(q);
    // r.pop() ;
    // }

    // System.out.println(s);
    // }

    // Inseert at any index of the stack

    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // int idx = 3;

    // int x = 43;

    // Stack<Integer> r = new Stack<>();
    // while (s.size() > idx) {
    // r.push(s.pop());
    // }

    // s.push(x);

    // while (r.size() > 0) {
    // s.push(r.pop());
    // }

    // System.out.println(s);
    // }

    // Printing the stack using the array

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // int x = s.size();

    // int[] arr = new int[x];
    // for(int j=x-1;j>=0;j--){
    // arr[j] = s.pop();
    // }

    // for(int i=0;i<x;i++){
    // System.out.println(arr[i]);
    // }
    // }

    // Printing the stack using reursion

    // public static void display(Stack<Integer> s) {
    // if (s.size() == 0)
    // return;
    // int top = s.pop();
    // System.out.println(top);

    // display(s);
    // s.push(top);

    // }

    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // display(s);

    // }

    // Pushing the element at the bottom of the stack using recursion

    // public static void display(Stack<Integer> s) {
    //     if (s.size() == 0) {
    //         s.push(3455);
    //         return;
    //     }
    //     int top = s.pop();
    //     System.out.println(top);

    //     display(s);
    //     s.push(top);

    // }

    // public static void main(String[] args) {
    //     Stack<Integer> s = new Stack<>();

    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);
    //     s.push(5);
    //     s.push(6);

    //     display(s);

    //     System.out.println(s);

    // }

    // pop the bottom most element of from the stack using recursion

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // Stack <Integer> r = new Stack<>();
    // while(s.size()>1){
    // r.push(s.pop());
    // }

    // s.pop();

    // while (r.size()>0) {
    // s.push(r.pop());
    // }

    // System.out.println(s);

    // }

    // Reverse a stack using iterative approach //Reversing the stack in the same
    // stack

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);
    // System.out.println(s);

    // Stack<Integer> r = new Stack<>();
    // while (s.size()>0) {
    // r.push(s.pop());
    // }
    // Stack<Integer> c = new Stack<>();

    // while (r.size()>0) {
    // c.push(r.pop());
    // }

    // while (c.size()>0) {
    // s.push(c.pop());
    // }

    // System.out.println(s);
    // }

    // Reverse a sack using recursive method

    // public static void pushatbottom(int top){
    // Stack <Integer> c = new Stack<>();

    // c.push(top);

    // System.out.println(c);
    // }

    // public static void reverse(Stack<Integer> s){
    // if(s.size()==0) return;
    // int top = s.peek();

    // s.pop();

    // pushatbottom(top);

    // reverse(s);

    // }

    // public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // reverse(s);
    // }

    // Implementation of Stack using arrays

    // public static class Stack{
    // private int [] arr = new int[6];
    // private int idx = 0;

    // void push(int x){
    // arr[idx] = x;
    // idx++;
    // }

    // int peek(){
    // if(idx==0) return -1;
    // return arr[idx-1];
    // }

    // int pop(){
    // if(idx==0) return -1;
    // int pop = arr[idx-1];
    // arr[idx-1] = 0;
    // idx--;

    // return pop;
    // }

    // int size(){
    // return idx;
    // }

    // void display(){
    // for(int i=0;i<idx;i++){
    // System.out.println(arr[i]+" ");
    // }
    // }

    // boolean isEmpty(){
    // if(arr.length==0) return true;

    // else return false;
    // }

    // boolean isfull(){
    // if(idx==arr.length){
    // return true;
    // }

    // else return false;
    // }

    // int capacity(){
    // return arr.length;
    // }
    // }

    // public static void main(String[] args) {
    // Stack s = new Stack ();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // s.display();

    // s.pop();

    // s.display();

    // System.out.println(s.peek());

    // s.display();

    // System.out.println(s.isEmpty());

    // System.out.println(s.isfull());

    // System.out.println(s.size());

    // System.out.println(s.capacity());
    // }

    // Implementation of stack using recursion

    // public static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // }
    // }

    // public static class Stack {
    // Node head = null;
    // int size = 0;

    // void push(int x) {
    // Node temp = new Node(x);
    // temp.next = head;

    // head = temp;

    // size++;
    // }

    // void pop() {
    // head = head.next;
    // }

    // int peek() {
    // if (head == null)
    // return -1;
    // return head.data;
    // }

    // void displaycorrect(Node head) {
    // if (head == null)
    // return;
    // displaycorrect(head.next);
    // System.out.print(head.data + " ");
    // }

    // void Display() {
    // displaycorrect(head);
    // }

    // void Displayrev() {
    // Node temp = head;

    // while (temp != null) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    // }

    // int Size() {

    // return size;
    // }

    // boolean isEmpty() {
    // int count = 0;
    // while (head != null) {
    // count++;
    // }
    // if (count == 0) {
    // return true;
    // }

    // else
    // return false;
    // }

    // }

    // public static void main(String[] args) {
    // Stack s = new Stack();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);
    // s.push(6);

    // s.Display();

    // // s.Display();

    // // s.pop();

    // // s.Display();

    // System.out.println(s.Size());

    // }
}