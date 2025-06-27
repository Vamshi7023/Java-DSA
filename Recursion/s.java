package Recursion;

import java.util.*;

public class s {

    public static void main(String[] args) {
        int n= 1;
        int num =1;
        int sum=0;
        // while (num<=n) {
        //     sum +=num;
        //     num++;
        // }
        // System.out.println(sum);
        // for(int i =1;i<=n;i++){
        //     System.out.println(i); 
        // }
        
        // do{
        //     System.out.println(n);
        //     n++;
        // }
        // while(n<=10);

        // char t = 'q';

        // int e = (int)t;

        // System.out.println(e);

        int ans[] = {1,2,3,4,5,6};
        int max=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        System.out.println(max);
    }
}
