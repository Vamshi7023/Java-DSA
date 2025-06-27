package RandomProblems;
public class LeetcodeProblem2419{
    public static int logestsubarray(int nums[]){
        int longest=0;
        int maxval =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if (maxval<nums[i]) {
                maxval = nums[i];
            }
        }
        int currentlength = 0;
        for(int num : nums){
            if(maxval == num){
                currentlength++;
                longest = Math.max(longest, currentlength);
                
            }
            else{
                currentlength = 0;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,7,4,2,0,4};
        System.out.println(logestsubarray(arr));
    }
}