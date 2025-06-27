package HashMap;

import java.util.*;

public class HashMap3 {



    //Check weather two strings are anagram of each other. Return true if they are else return false.An anagram of a string is another string that contains the same characters. only the order of characters can be different. For example : "abcd" and "dabc" are an anagram of each other


    // Steps:
    // Step1: Length of the two string should be equal
    // Step2: Frequence of each caharater must be same
    // Step3: No Strings should be extra or diffrent

    static HashMap<Character,Integer> makeFreqHashMap(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character t = s.charAt(i);
            if(!mp.containsKey(t)){
                mp.put(t, 1);
            }
            else{
                mp.put(t, mp.get(mp)+1);             
            }
        }
        return mp;
    }

    // //First approach
    // public static boolean isAnagram(String s,String t){
    //     if(s.length()!=t.length()) return false;
    //     HashMap<Character,Integer> m1 = makeFreqHashMap(s);
    //     HashMap<Character,Integer> m2 = makeFreqHashMap(t);
    //     return m1.equals(m2); //Check weather m1 and m2 are equal or not and returns the boolean value
    // }

    // //Second Approach
    // public static boolean isAnagram2(String s,String t){
    //     if(s.length()!=t.length()) return false;
    //     HashMap<Character,Integer> m = makeFreqHashMap(s);
    //     for(int i=0;i<s.length();i++){
    //         Character tt = s.charAt(i) ;
    //         if(!m.containsKey(tt)) return false;
    //         else{
    //             m.put(tt,m.get(tt)-1);
    //         }
    //     }
    //     //All values in the map should be zero
    //     for(int freq : m.values()){
    //         if(freq!=0) return false;
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     String s = "rat";
    //     String t = "tarr";
    //     System.out.println("Method1");
    //     System.out.println(isAnagram(s,t));
    //     System.out.println();
    //     System.out.println("Method2");
    //     System.out.println(isAnagram2(s, t));


    // }

    //Given to string s and t determine if they are isomorphic 
    //Two string s and t are isomorphic if the characters in s can be replaced to get t

    public static boolean isomorphic(String s, String t){
        HashMap <Character, Character> is = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

            if(is.containsKey(c1)){
                if(is.get(c1)!= c2) return false;
            }

            else if(is.containsKey(c2)) return false;

            else{
                is.put(c1, c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "add" ;

        String t = "enn";

        System.out.println(isomorphic(s,t));

    }
    

    //Given an array of length n and a target, return a pair(indices) whose sum is equal to the target if there is no pair present return -1

    //should not use same element twice 




    //Method 1: time complexity of n^2

    // public static int[] TwoSum(int arr[], int target){

    //     int n= arr.length;

    //     int ans [] = {-1};

    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]+arr[j]==target){
    //                 ans = new int[]{i,j};//Inserts two values i and j in the array
    //                 return ans;
    //             }
    //         }
    //     }
        
    //     return ans;
    // }


    //Method 2 : time complexity of nlogn array should be sortrd and we need to apply binary search to get the indises of the given target

    //Method 3: time complexity of n
    // public static int[] TwoSum(int arr[], int target){

    //     int n= arr.length;

    //     HashMap<Integer,Integer> mp = new HashMap<>();

    //     int ans [] = {-1};

    //     for(int i=0;i<n;i++){
            
    //         int partner = target-arr[i];

    //         if (mp.containsKey(partner)) {
    //             ans = new int[] {i,mp.get(partner)};
    //         }

    //         mp.put(arr[i],i);
    //     }
        
    //     return ans;
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1,5,2,7,8,4,3,6};
    //     int target = 7;

    //     int result[] = TwoSum(arr, target);

    //     if (result.length == 2) {
    //         System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
    //     } else {
    //         System.out.println("No valid indices found.");
    //     }
    // }

    //lAST QUESETION SEE FROM VIDEO
    // public static void sumarr(int[] arr){
    //      HashMap<Integer,Integer> mp = new HashMap<>();
    // }

    // public static void main(String[] args) {
        
    // }
}
