// PROBLEM STATEMENT:
// Given an integer array (can contain negative numbers),
// find the contiguous subarray with the maximum sum.

// Example:
// arr = [-2,1,-3,4,-1,2,1,-5,4]
// Output = 6
// Explanation: Subarray [4, -1, 2, 1]
// PATTERN: Kadane’s Algorithm
// PROBLEM: Maximum Subarray Sum
import java.util.Arrays;
public class array10pattern {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        Arrays.sort(arr);
        System.out.println((maxsubarr(arr)));
    }
    static int maxsubarr(int[]arr){
        int maxsum=arr[0];
        int currentsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            //decide weather to extend or restart
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    
    }
}
