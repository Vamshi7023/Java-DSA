package RandomProblems;

//Question Given three arrays sorted in increasing order. Find the elements that are common in all three arrays. Note: can you take care of the duplicates without using any additional Data Structure?

public class CommonElement {
    static void common(int arr[],int arr1[],int arr2[],int a,int b,int c){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                for(int k=0;k<c;k++){
                    if(arr[i]==arr1[j]&&arr1[j]==arr2[k]){
                        System.out.println(arr2[k]);
                        arr[i] = Integer.MIN_VALUE;  //Mark the element as visited
                        arr1[j] = Integer.MIN_VALUE; //Marking the element as visited
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,50,30,20,15};
        int arr1 [] = {12,50,20,345,50};
        int arr2 [] ={50,4,2,20,0,3};
        int a = arr.length;
        int b = arr1.length;
        int c = arr2.length;
        common(arr, arr1, arr2, a, b, c);
    }
}
