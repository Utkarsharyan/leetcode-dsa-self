// Problem Statement
// Given an array, rotate the array to the right by k steps.
// Example:
// arr = [1,2,3,4,5,6,7]
// k = 3
// Output = [5,6,7,1,2,3,4]

import java.util.Arrays;

public class array8pattern {
// Original:        [1 2 3 4 5 6 7]
// Reverse all:     [7 6 5 4 3 2 1]
// Reverse first k: [5 6 7 4 3 2 1]
// Reverse rest:    [5 6 7 1 2 3 4]
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static void reverse(int[]arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
