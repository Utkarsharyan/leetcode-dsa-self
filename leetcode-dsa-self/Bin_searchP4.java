public class Bin_searchP4 {
    
}

//P1
// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.

 // Example 1:
// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.

class Solution0{
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            //THE ELEMENT AHEAD IS BIGGER SO PEAK IS AHEAD SO l=m+1;
            //the the search space is to be moved ahead so l=m+1;
            if(nums[m]<nums[m+1]){
                l=m+1;
            }
            //if not means the peak is behind so we can make the 
            //the search space behind so r=m
            else{
                r=m;
            }
        }
        return l;
    }
}


// //p2
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.
// Example 1:

// Input: arr = [0,1,0]

// Output: 1
class Solution1{
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]<arr[m+1]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }
}