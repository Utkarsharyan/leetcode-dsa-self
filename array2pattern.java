// Problem Statement
// Given an array of integers, reverse the array in-place.
// Example:
// arr = [1, 2, 3, 4, 5]
// Output = [5, 4, 3, 2, 1]
// Rules:
// 1️⃣ First tell me the brute force logic
// 2️⃣ No code yet
// 3️⃣ Then we’ll optimize and extract the Two Pointers pattern

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2pattern {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverser(arr)));    
    }
    //two pointers pattern in place reversal
    static int[] reverser(int[]arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
}
