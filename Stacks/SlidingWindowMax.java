package Stacks;

import java.util.Stack;
//Sliding window problem and celibrity problem should be done from video of STACK 3
public class SlidingWindowMax {
    //Time complexity of o(n)^2
    // public static void sliding(int arr[],int k){
    //     int n= arr.length;
    //     int max = Integer.MIN_VALUE;
    //     int ans[] =  new int[n-k+1];
    //     for(int i=0;i<n-k+1;i++){
    //         for(int j=i;j<i+k;j++){
    //             if(arr[j]>max){
    //                 max = arr[j];
    //             }
    //         }
    //         ans[i] = max;
    //     }
    //     for(int i=0;i<ans.length;i++){
    //         System.out.println(ans[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1, 2, 3, 4, 5, 6};
    //     int k =3;
    //     sliding(arr,k);
    // }


    //Time Complexity of o(n)
    public static void sliding(int arr[],int k){
        int n = arr.length;
        int nge[] = new int[n];
        Stack <Integer> s = new Stack<>();
        s.push(n-1);
        nge[n-1] = n;//insted of pushing -1 for last index we hasd done the n only

        int ans [] = new int[n+k-1];
        int z=0;

        for(int i=n-2;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.size()==0){
                nge[i]=n;
            }
            else nge[i] = s.peek();

            s.push(i);
        }
        //print of next greater element(nge)
        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i]+" ");
        }
        System.out.println();

        int j=0;
        for(int i=0;i<n-k+1;i++){
            if(j>=i+k) j=i;
            int max = arr[j];
            while(j<i+k){
                max = arr[j];
                j = nge[j];
            }
            ans[z++] = max;
        }

        for(int i=0;i<n-k+1;i++){
            System.out.print(ans[i]+" ");
        }


    }
    public static void main(String[] args) {
        int arr [] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        sliding(arr,3);
    }
}
