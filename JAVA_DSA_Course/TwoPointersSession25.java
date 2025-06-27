package JAVA_DSA_Course;

public class TwoPointersSession25 {
    public static int itoj(int i,int j,int arr[]){
        int sum = 0;
        while (i <= j) {
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 1, 1 };
        int k = 4;
        int n = arr.length;
        int sum = 0;
        int count = 0;
        int totalsum = 0;
        for(int i=0,j=0;j<n;j++){// even we can use the for loop insted of while loop here both are exactly same
            sum += arr[j];
            int l  = j-i+1;
            totalsum += l*arr[j]; 
            while (sum > k) {
                sum -= arr[i];
                totalsum = totalsum - itoj(i,j,arr);
                i++;
            }
            if (i<=j) {
                count += j - i + 1;
            }
            else{
                sum = 0;
                totalsum = 0;
            }
        }
        System.out.println(count);
    }
}
