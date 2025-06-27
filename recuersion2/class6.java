package recuersion2;

import java.util.*;
public class class6 {
    public static void subsequence(int idx,int arr[],List<Integer> l){
        if (idx>arr.length-1) {
            System.out.println(l);
            return;
        }
        subsequence(idx+1, arr, l);
        l.add(arr[idx]);
        subsequence(idx+1, arr, l);
        l.remove(l.size()-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        List<Integer> l = new ArrayList<>();
        subsequence(0, arr, l);
    }
}
