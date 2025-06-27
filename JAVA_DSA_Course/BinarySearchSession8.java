package JAVA_DSA_Course;

//Session 7 and 8 has same method if dought refer koko monkey problem in leetcode
public class BinarySearchSession8 {
    public static int minReadingSpeed(int[] pages, int h) {
        int l = 1;
        int high = Maxnumber(pages);
        while(l<=high){
            int mid = (l+high)/2;
            int totalhours = Chapters(pages,mid);
            if(totalhours<=h){
                high = mid-1;
            }
            else l = mid+1;
        }
        return l;
    }

    public static int Maxnumber(int piles[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }
        return max;
    }

    public static int Chapters(int pages[],int mid){
        int hours = 0;
        for(int page : pages){
            hours += Math.ceil((double)page/mid);
        }
        return hours;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4};
        int h = 4 ;
        System.out.println(minReadingSpeed(arr,h));
    }


}