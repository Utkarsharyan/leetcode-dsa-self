public class Bin_searchP1 {
    
}
//P1
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.
class Solution1 {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
                l=m+1;
            }
            if(nums[m]>target){
                r=m-1;
            }
        }
        return -1;
    }
}

// P2
// Given a sorted array of distinct integers and a target value, return 
// the index if the target is found. If not, return 
// the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
                l=m+1;
            }
            if(nums[m]>target){
                r=m-1;
            }
        }
        return l;
        //points to the plce the target should be if not fount the start pointer last postion 
    }
}

//P3
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=findfirstidx(nums,target);
        ans[1]=findsecondidx(nums,target);
        return ans;
    }
    public int findfirstidx(int[]nums,int target){
        int idx=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target==nums[m]){
                idx=m;
            }
            if(target>nums[m]){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return idx;
    }
    public int findsecondidx(int[]nums,int target){
        int idx=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target==nums[m]){
                idx=m;
            }
            if(target>=nums[m]){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return idx;
    }

}
