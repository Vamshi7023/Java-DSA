package Stacks;

//Infix Prifix Postfix Evaluation
import java.util.*;

public class Stack3 {
    // Infix --> 9-(5+3)*4/6
    //prefix --> -9/*+5346
    //Postfix --> 953+4*6/-

    // Infix "9-(5+3)*4/6"->4

    // Given a string for the calculation
    // public static void Infix(String s) {
    // Stack<Integer> val = new Stack();
    // Stack<Character> op = new Stack();

    // for (int i = 0; i < s.length(); i++) {
    // char ch = s.charAt(i);
    // int ascii = (int) ch;

    // if (ascii >= 48 && ascii <= 57) {
    // val.push(ascii - 48);
    // } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
    // op.push(ch);
    // } else if (ch == ')') {
    // while (op.peek() != '(') {
    // int v2 = val.pop();
    // int v1 = val.pop();
    // if (op.peek() == '-')
    // val.push(v1 - v2);
    // if (op.peek() == '+')
    // val.push(v1 + v2);
    // if (op.peek() == '/')
    // val.push(v1 / v2);
    // if (op.peek() == '*')
    // val.push(v1 * v2);

    // op.pop();
    // }
    // op.pop();
    // }

    // else {
    // if (ch == '+' || ch == '-') {
    // int v2 = val.pop();
    // int v1 = val.pop();

    // if (op.peek() == '-')
    // val.push(v1 - v2);
    // if (op.peek() == '+')
    // val.push(v1 + v2);
    // if (op.peek() == '/')
    // val.push(v1 / v2);
    // if (op.peek() == '*')
    // val.push(v1 * v2);
    // op.pop();
    // op.push(ch);
    // }

    // if (ch == '*' || ch == '/') {
    // if (op.peek() == '*' || op.peek() == '/') {
    // int v2 = val.pop();
    // int v1 = val.pop();

    // if (op.peek() == '-')
    // val.push(v1 - v2);
    // if (op.peek() == '+')
    // val.push(v1 + v2);
    // if (op.peek() == '/')
    // val.push(v1 / v2);
    // if (op.peek() == '*')
    // val.push(v1 * v2);
    // op.pop();
    // op.push(ch);
    // } else
    // op.push(ch);
    // }

    // }
    // }
    // while (val.size() > 1) {
    // int v2 = val.pop();
    // int v1 = val.pop();

    // if (op.peek() == '-')
    // val.push(v1 - v2);
    // if (op.peek() == '+')
    // val.push(v1 + v2);
    // if (op.peek() == '/')
    // val.push(v1 / v2);
    // if (op.peek() == '*')
    // val.push(v1 * v2);
    // op.pop();
    // }
    // System.out.println(val.peek());

    // }

    // public static void main(String[] args) {
    // String t = "9-(5+3)*4/6";
    // Infix(t);
    // }

    // Infix to prefix "9-(5+3)*4/6"---> -9/*+5346

    // public static void prefix(String s) {
    //     Stack<String> val = new Stack();
    //     Stack<Character> op = new Stack();

    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         int ascii = (int) ch;

    //         if (ascii >= 48 && ascii <= 57) {
    //             String a = "" + ch;
    //             val.push(a);
    //         } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
    //             op.push(ch);
    //         } else if (ch == ')') {
    //             while (op.peek() != '(') {
    //                 String v2 = val.pop();
    //                 String v1 = val.pop();
    //                 Character w = op.pop();
    //                 String e = w + v1 + v2;

    //                 val.push(e);
    //             }
    //             op.pop(); // remove open bracket (

    //         }

    //         else {
    //             if (ch == '+' || ch == '-') {
    //                 String v2 = val.pop();
    //                 String v1 = val.pop();
    //                 Character w = op.pop();
    //                 String e = w + v1 + v2;
    //                 val.push(e);
    //                 op.push(ch);

    //             }

    //             if (ch == '*' || ch == '/') {
    //                 if (op.peek() == '*' || op.peek() == '/') {
    //                     String v2 = val.pop();
    //                     String v1 = val.pop();
    //                     Character w = op.pop();
    //                     String e = w + v1 + v2;
    //                     val.push(e);
    //                     op.push(ch);
    //                 } else
    //                     op.push(ch);
    //             }

    //         }
    //     }
    //     while (val.size() > 1) {
    //         String v2 = val.pop();
    //         String v1 = val.pop();
    //         Character w = op.pop();
    //         String e = w + v1 + v2;
    //         val.push(e);

    //     }
    //     System.out.println(val.peek());

    // }

    // public static void main(String[] args) {
    //     String t = "9-(5+3)*4/6";
    //     prefix(t);
    // }


    //infix to postfix   9-(5+3)*4/6 --> 953+4*6/-

    // public static void postfix(String s) {
    //     Stack<String> val = new Stack();
    //     Stack<Character> op = new Stack();

    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         int ascii = (int) ch;

    //         if (ascii >= 48 && ascii <= 57) {
    //             String a = "" + ch;
    //             val.push(a);
    //         } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
    //             op.push(ch);
    //         } else if (ch == ')') {
    //             while (op.peek() != '(') {
    //                 String v2 = val.pop();
    //                 String v1 = val.pop();
    //                 Character w = op.pop();
    //                 String e = v1 + v2+w;

    //                 val.push(e);
    //             }
    //             op.pop(); // remove open bracket (

    //         }

    //         else {
    //             if (ch == '+' || ch == '-') {
    //                 String v2 = val.pop();
    //                 String v1 = val.pop();
    //                 Character w = op.pop();
    //                 String e = v1 + v2+w;
    //                 val.push(e);
    //                 op.push(ch);

    //             }

    //             if (ch == '*' || ch == '/') {
    //                 if (op.peek() == '*' || op.peek() == '/') {
    //                     String v2 = val.pop();
    //                     String v1 = val.pop();
    //                     Character w = op.pop();
    //                     String e = v1 + v2+w;
    //                     val.push(e);
    //                     op.push(ch);
    //                 } else
    //                     op.push(ch);
    //             }

    //         }
    //     }
    //     while (val.size() > 1) {
    //         String v2 = val.pop();
    //         String v1 = val.pop();
    //         Character w = op.pop();
    //         String e = v1 + v2+w;
    //         val.push(e);

    //     }
    //     System.out.println(val.peek());

    // }

    // public static void main(String[] args) {
    //     String t = "9-(5+3)*4/6";
    //     postfix(t);
    // }



    //Evaluation of postfix expression or postfix to infix value
    // public static void postfix(String t){
    //     Stack <Integer> s = new Stack<>();
    //     for(int i=0;i<t.length();i++){
    //         char c = t.charAt(i);
    //         int q = (int)c;
    //         if(q>=48&& q<=57){
    //             s.push(c-48);
    //         }
    //         else{
    //             int v2 =s.pop();
    //             int v1 = s.pop();
    //             if(c=='+') s.push(v1+v2);
    //             if(c=='-') s.push(v1-v2);
    //             if(c=='/') s.push(v1/v2);
    //             if(c=='*') s.push(v1*v2);
    //         }
    //     }
    //     System.out.println(s.peek());
    // }
    // public static void main(String[] args) {
    //     String t = "953+4*6/-";
    //      postfix(t);
    // }


    //Evaluation of prefix expression -9/*+5346-->4
    // public static void prefix(String t){
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=t.length()-1;i>=0;i--){
    //         char c = t.charAt(i);
    //         int ascii = (int)c;
    //         if(ascii>=48&&ascii<=57){
    //             s.push(ascii-48);
    //         } 
    //         else{
    //             int v1 = s.pop();
    //             int v2 = s.pop();

    //             if(c=='+') s.push(v1+v2);
    //             if(c=='-') s.push(v1-v2);
    //             if(c=='/') s.push(v1/v2);
    //             if(c=='*') s.push(v1*v2);
    //         }
    //     }
    //     System.out.println(s.peek());
    // }
    // public static void main(String[] args) {
    //  String t = "-9/*+5346";
    //     prefix(t);
    // }

    //Conversion of a prefix expression to a postfix expression
    // public static void pretopost(String t){
    //     Stack<String> s = new Stack<>();
    //     for(int i=t.length()-1;i>=0;i--){
    //         char c = t.charAt(i);
    //         int ascii = (int)c;
    //         if(ascii>=48&&ascii<=57){
    //             s.push(c+"");
    //         } 
    //         else{
    //             String v1 = s.pop();
    //             String v2 = s.pop();
    //             String q = v1+v2+c;
    //             s.push(q);
    //         }
    //     }
    //     System.out.println(s.peek());
    // }
    // public static void main(String[] args) {
    //  String t = "-9/*+5346";
    //     pretopost(t);
    // }

    //Conversion of postfix to prefix expression NOT CORRECT NEED TO SOLVE THESE
    // public static void posttopre(String t){
    //     Stack<String> s = new Stack<>();
    //     for(int i=t.length()-1;i>=0;i--){
    //         char c = t.charAt(i);
    //         int ascii = (int)c;
    //         if(ascii>=48&&ascii<=57){
    //             s.push(c+"");
    //         } 
    //         else{
    //             String v1 = s.pop();
    //             String v2 = s.pop();
    //             String q = c+v1+v2;
    //             s.push(q);
    //         }
    //     }
    //     System.out.println(s.peek());
    // }
    // public static void main(String[] args) {
    //  String t = "953+4*6/-";
    //     posttopre(t);
    // }


    //Infix --> 9-(5+3)*4/6
    //prefix --> -9/*+5346
    //Postfix --> 953+4*6/-
    //Postfix to infix 

    //prefix to infix expression
    public static void PrefixtoInfix(String t){
        Stack<String> s = new Stack<>();
        for(int i=t.length()-1;i>=0;i--){
            char c = t.charAt(i);
            int ascii = (int)c;
            if(ascii>=48&&ascii<=57){
                s.push(c+"");
            } 
            else{
                String v1 = s.pop();
                String v2 = s.pop();
                String q = "("+ v1+c+v2+")";
                s.push(q);
            }
        }
        System.out.println(s.peek());
    }
    public static void main(String[] args) {
     String t = "-9/*+5346";
        PrefixtoInfix(t);
    }    
}
