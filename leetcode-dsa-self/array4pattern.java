// Problem 4 of 15 (Medium)
// Problem Statement

// Given an array of integers and a target sum X, check if there exists a pair of elements whose sum equals X.

// Example:

// arr = [2, 7, 11, 15]
// X = 9
// Output = true (2 + 7)

import java.util.Arrays;
import java.util.HashSet;
public class array4pattern {
    public static void main(String[] args) {
        int[]arr={2, 7, 11, 15};
        int tar=9;
        System.out.println(pairexists(arr,tar));
    }
    //pair with given sum (slightly optimised)
    // static boolean pairexists(int[]arr,int tar){
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         int need=tar-arr[i];
    //         if(set.contains(need)){
    //             return true;
    //         }
    //         else{
    //             set.add(arr[i]);
    //         }
    //     }
    //     return false;
    // }

    static boolean pairexists(int[]arr,int tar){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==tar){
                return true;
            }
            else if(sum<tar){
                l++;
            }
            else{
                r--;
            }
        }
        return false;
    }
}
