package JAVA_DSA_Course;

public class TwoPointersSession11 {
    public static void main(String[] args) {
        int arr[] = {5,8,5,3,4,10,8};
        int k = 4;
        int n = arr.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0,j=0;j<n;j++){ //even we can use the for loop insted of while loop here both are exactly same         
            sum += arr[j];
            while (sum>=k&&i<j) {
                min = Math.min(min, j-i+1);
                sum-=arr[i];
                i++;
            }
        }
        System.out.println(min);
    }
}
