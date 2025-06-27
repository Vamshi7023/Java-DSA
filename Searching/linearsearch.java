package Searching;

public class linearsearch {
    static int LinerSearch(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,10,3,34,5};

        int target = 111;

        System.out.println(LinerSearch(arr, target));

    }
}
