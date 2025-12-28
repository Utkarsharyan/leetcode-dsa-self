// Problem Statement
// Given an array of integers, move all zeros to the end while maintaining the relative order of non-zero elements.
// Example:
// arr = [0, 1, 0, 3, 12]
// Output = [1, 3, 12, 0, 0]

import java.util.Arrays;

public class array3pattern {
    public static void main(String[] args) {
        int arr[]={0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(fastslowtwopinters(arr)));
    }
    static int[] fastslowtwopinters(int[]arr){
        int slow=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }
        }
        return arr;
    }

}
