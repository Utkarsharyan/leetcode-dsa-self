public class Bin_searchP2 {
    
}

//P2

// Question 1 (Pattern 2)
// Search in Rotated Sorted Array
// Example
// nums = [4,5,6,7,0,1,2]
// target = 0
// Output
// 4
class Solution1 {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){

            int m = l + (r - l) / 2;

            if(nums[m] == target){
                return m;
            }

            // LEFT HALF SORTED
            if(nums[l] <= nums[m]){

                if(target >= nums[l] && target < nums[m]){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }

            // RIGHT HALF SORTED
            else{

                if(target > nums[m] && target <= nums[r]){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
        }

        return -1;
    }
}

//P2
// Next Question
// Find Minimum in Rotated Sorted Array
// Example
// nums = [3,4,5,1,2]
// Output
// 1

class Solution2 {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r){

            int m = l + (r - l) / 2;

            if(nums[m] > nums[r]){
                l = m + 1;
            }
            else{
                r = m;
            }
        }

        return nums[l];
    }
}

//P3
// Next Problem
// Search in Rotated Sorted Array II
// Example
// nums = [2,5,6,0,0,1,2]
// target = 0
// Output
// true
// Key difference from LC 33:
// Duplicates exist
// Example where old logic breaks:
// [1,0,1,1,1]
// Here:
// nums[l] == nums[mid] == nums[r]
// We cannot detect which half is sorted.

class Solution {
    public boolean search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){

            int m = l + (r - l) / 2;

            if(nums[m] == target){
                return true;
            }

            // duplicate case
            if(nums[l] == nums[m] && nums[m] == nums[r]){
                l++;
                r--;
            }

            // left sorted
            else if(nums[l] <= nums[m]){

                if(nums[l] <= target && target < nums[m]){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }

            // right sorted
            else{

                if(nums[m] < target && target <= nums[r]){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
        }

        return false;
    }
}