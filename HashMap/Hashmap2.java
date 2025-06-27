package HashMap;

import java.util.*;

public class Hashmap2 {

    static class MyHashMap<K,V>{//This is called Generic class where it takes the values of hashmap from main class hashmap 
        public static final int Default_capacity = 4;
        public static final float Default_load_faactor = 0.75f;

        private class Node{
            K Key;
            V Value;

            Node (K key , V value){

                this.Key=Key;
                this.Value=Value;

            }

            private int n; // number of entries in map
            private LinkedList<Node>[] buckets; 



            //In the below line we had created an array of N size and intialized an emplty linkedlist in every location of N size 

            private void initBuckets(int N){//N- Capacity/size of the Bucket array or hash table
                buckets = new LinkedList[N];

                for(int i=0;i<buckets.length;i++){
                    buckets[i] = new LinkedList<>();
                }
            }

            public void MyHashMap(){
                initBuckets(Default_capacity);
            }

            public int size(){//Return number of value present in the Hash table
                return n;
            }

            public void put(K Key,V Value){//Insert or Update
                int bi = HashFunction(K Key);
            }

            // public V get(K Key){

            // }

            // public V Remove(K Key){

            // }
        }
    }
    public static void main(String[] args) {
        MyHashMap<Integer,String> li = new MyHashMap<>();

        HashMap <Integer,String> mp = new HashMap<>();
    }
}
