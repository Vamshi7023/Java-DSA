package RandomProblems;

public class LeadersinanArray {
    // static void leader(int arr[],int n){
    //     for(int i=0;i<n-1;i++){
    //         if(arr[i]<=arr[i+1])
    //         {
    //             System.out.println(arr[i+1]);
    //         }
    //     }
    //     for(int j=n-1;j<n;j++){
    //         System.out.println(arr[n-1]);
    //     }
        
    // }

    static void leader(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
        for(int k=n-1;k<n;k++){
            System.out.println(arr[n-1]);
        }
        
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,0};
        int n = arr.length;
        leader(arr, n);
    }
}
