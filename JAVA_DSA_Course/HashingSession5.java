package JAVA_DSA_Course;

public class HashingSession5 {
    public static void main(String[] args) {

        //Tofind the prifix sum array
        //prifix[i] = prifix[i-1]+arr[i-1]; to make the prifix array

        //Brute force approach
        // int arr [] = {1,2,3,4,5,6,7,8,9,10};
        // int l=0;
        // int t=9;
        // int a=0;
        // for(int j=l;j<=t;j++){
        //     a += arr[j];
        // }
        // System.out.println(a);

        // int arr [] = {1,2,3,4,5,6,7,8,9,10};
        // int l=4;
        // int t=10;
        // int n = arr.length;
        // int prifix[] = new int[n+1];
        // for(int i =1 ; i<=n;i++){
        //     prifix[i] = prifix[i-1]+arr[i-1];
        // }
        // int a = prifix[t]-prifix[l-1];
        // System.out.println(a);

        //OPTIMIZED WAY

        //We use Prifix[i] = prifix[i-1]+array[i] //here we have calculated already prifix of i -1 so we are not over lapping the addition from satrt to end by just adding current element

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int prifix [] = new int[n+1];//For 1 baced indexing we use n+1 
        int l = 1;
        int r = 10;
        for(int i=1;i<=n;i++){
            prifix[i] = prifix[i-1]+arr[i-1];
        }
        int a = prifix[r]-prifix[l];
        System.out.println(a);
    }
}
