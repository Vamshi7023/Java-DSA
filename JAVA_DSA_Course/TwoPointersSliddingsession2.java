package JAVA_DSA_Course;
public class TwoPointersSliddingsession2 {
    public static void main(String[] args) {
        int arr[] = {10,4,8,13,20};
        int m = 2;
        int max = Integer.MIN_VALUE;
        int i=0,j=0;
        int sum = 0;
        while (j<arr.length) {
            if(j-i+1<=m){
                sum += arr[j];
                max = Math.max(max, sum);
                j++;
            }
            else{
                sum-=arr[i];
                i++;
            }
            
        }
        int k=0;
        int a = 0;
        while (k<arr.length) {
            a+=arr[k];
            k++;
        }
        System.out.println(a-max);

    }
}
