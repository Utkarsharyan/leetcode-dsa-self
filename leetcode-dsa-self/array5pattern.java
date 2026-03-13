// Problem Statement
// Given an array of positive integers, find the minimum length subarray whose sum is ≥ target.
// Example:
// arr = [2,3,1,2,4,3]
// target = 7
// Output = 2  // [4,3]

public class array5pattern {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        int tar=7;
        System.out.println(maxlengthfind(arr,tar));
    }
    //brute force
    // static int maxlengthfind(int[]arr,int tar){
    //     int minlen=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int windowsum=0;
    //         for(int j=i;j<arr.length;j++){
    //             windowsum+=arr[j];
    //             if(windowsum>=tar){
    //                 minlen=Math.min(minlen, j-i+1);
    //                 break;//break out of the loops
    //             }
    //         }
    //     }
    //     if (minlen==Integer.MAX_VALUE) {
    //         return 0;
    //     }
    //     else{
    //         return minlen;
    //     }
    // }

    //optimal solution  Sliding window
    static int maxlengthfind(int[]arr,int tar){
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int windowsum=0;
        for(int right=0;right<arr.length;right++){
            //expanding the window from right
            windowsum+=arr[right];
            while(windowsum>=tar){
                minlen=Math.min(minlen,right-left+1);
                //shrinking the window from left
                windowsum-=arr[left];
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minlen;
        }
    }
}
