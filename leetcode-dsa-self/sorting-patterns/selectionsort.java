import java.util.ArrayList;
import java.util.List;
public class selectionsort {
    
}
//p1
// Given an array of integers nums, sort the array in ascending order and return it.
// You must solve the problem without using any built-in functions
class Solution0{
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(nums[minidx]>nums[j]){
                    minidx=j;
                }
            }
            int temp=nums[minidx];
            nums[minidx]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}

//p2
// Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr
// Example 1:

// Input: arr = [4,2,1,3]
// Output: [[1,2],[2,3],[3,4]]
// Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
// Example 2:

// Input: arr = [1,3,6,10,15]
// Output: [[1,3]]
// Example 3:

// Input: arr = [3,8,-10,23,19,-4,-14,27]
// Output: [[-14,-10],[19,23],[23,27]]

class Solution1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }
        List<List<Integer>>outer=new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int curdiff=arr[i+1]-arr[i];
            if(curdiff<diff){
                diff=curdiff;
                outer.clear();
                List<Integer>inpair=new ArrayList<>();
                inpair.add(arr[i]);
                inpair.add(arr[i+1]);
                outer.add(inpair);
            }
            else if(curdiff==diff){
                List<Integer>inpair=new ArrayList<>();
                inpair.add(arr[i]);
                inpair.add(arr[i+1]);
                outer.add(inpair);
            }
        }
        return outer;

    }
}
