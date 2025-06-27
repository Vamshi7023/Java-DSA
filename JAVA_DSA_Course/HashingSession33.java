package JAVA_DSA_Course;

import java.util.*;

public class HashingSession33 {
    // Pre requesite to check weateher two strings are equal or not
    // public static void main(String[] args) {
    // String a = "abcde";
    // String b = "edcba";

    // HashMap<Character,Integer> h = new HashMap<>();
    // HashMap<Character,Integer> h1 = new HashMap<>();

    // for (int i = 0; i < a.length(); i++) {
    // h.put(a.charAt(i), h.getOrDefault(a.charAt(i), 0)+1);
    // h1.put(b.charAt(i), h1.getOrDefault(b.charAt(i), 0)+1);
    // }
    // if (h.equals(h1)) {
    // System.out.println("equal");
    // }
    // else System.out.println("NOT EQUAL ");
    // }

    // Aqtual question
    public static void main(String[] args) {
        String a = "abcde";
        String b = "edcba";
        HashMap<Character, Integer> h1 = new HashMap<>();//even pos ele of string a
        HashMap<Character, Integer> h2 = new HashMap<>();//even pos ele of string b
        HashMap<Character, Integer> h3 = new HashMap<>();//odd pos ele of string a
        HashMap<Character, Integer> h4 = new HashMap<>();//odd pos ele of string b

        for (int i = 0; i < a.length(); i+=2) {
            h1.put(a.charAt(i), h1.getOrDefault(a.charAt(i), 0) + 1);
            h2.put(b.charAt(i), h2.getOrDefault(b.charAt(i), 0) + 1);
        }
        for (int i = 1; i < a.length();i+=2) {
            h3.put(a.charAt(i), h3.getOrDefault(a.charAt(i), 0) + 1);
            h4.put(b.charAt(i), h4.getOrDefault(b.charAt(i), 0) + 1);
        }

        if (h1.equals(h2)&&h3.equals(h4)) {
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
