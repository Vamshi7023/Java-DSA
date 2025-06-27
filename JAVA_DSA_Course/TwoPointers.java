package JAVA_DSA_Course;
public class TwoPointers {
    public static void main(String[] args) {
        int arr[] = {2,1,1,5,8};
        int target=4;
        int count=0;
        int sum=0;
        for(int i=0,j=0;j<arr.length;j++){
            sum +=arr[j];
            while(sum>target){//This while loop runs when the value of sum is greater than target it will remove the arr[i] elemetn from the sum and increment the i value to count the next element is less than the target
                sum -= arr[i];
                i++;
            }
            count +=j-i+1;//counts the number of subarrays length present in the array
        }
        System.out.println(count);
    }
}