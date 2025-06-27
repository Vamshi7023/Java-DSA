package HashMap;

import java.util.*;

public class Hashmap1 {
    public static void main(String[] args) {
        //Syntax
        HashMap<String ,Integer> mp = new HashMap<>();

        //Adding Entries or elements
        mp.put("Akash", 21);
        mp.put("Sai", 18);
        mp.put("Vignesh", 34);
        mp.put("Vamshi", 23);
        mp.put("Krishna",13);

        //Getting the value of a key from the hashmap
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("rahul"));

        //Changing or updating value of a key in the hashmap
        mp.put("Akash", 65);
        System.out.println(mp.get("Akash"));

        //removing a pair from the hashmap
        mp.remove("Akash");
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("riya"));

        //Checking if a key is in the hashmap
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Vamshi"));

        //Adding a new entry only if the new key dosent exist already
        //Method1
        if(mp.containsKey("Vamshi")) mp.put("Vamshi", 34);//will not be entered vamshi is already present

        //Method 2
        mp.putIfAbsent("Kailsh", 45);//will be entered kailash if not present


        //Get all the keys in the hashmap
        System.out.println(mp.keySet());

        //Get all the values in the hashmap
        System.out.println(mp.values());

        //Get all the entries in the hashmap
        System.out.println(mp.entrySet());

        //Traversing all the entries in the hashmap

        //Method 1
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        System.out.println();

        //Method 2
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n ",e.getKey(),e.getValue());
        }

        System.out.println();
        //Method 3

        for(var f:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",f.getKey(),f.getValue());
        }





        //Given an array find the most frequent element in it if there are multiple elements that appear a maximum number of times print any one of them
        int arr[] = {1,4,2,5,6,6,4,4,2,7,4,1,2,4};

        Map<Integer,Integer> li = new HashMap<>();

        for(int el:arr){
            if(!li.containsKey(el)){
                li.put(el, 1);
            }
            else{
                li.put(el,li.get(el)+1);
            }
        }

        System.out.println("Freq");

        System.out.println(li.entrySet());

        int mxFreq =0, anskey=-1;

        for(var e: li.entrySet()){
            if(e.getValue()>mxFreq){
                mxFreq=e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.printf("%d is the key value and %d is the frequence", anskey,mxFreq);

    }
}
