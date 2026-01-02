// PROBLEM STATEMENT:
// Given an integer array, answer multiple queries where each query asks
// for the sum of elements between indices l and r (inclusive).

// Example:
// arr = [2, 4, 6, 8, 10]
// Query: l = 1, r = 3
// Output: 18  // 4 + 6 + 8

public class array9pattern {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        int l=1;
        int r=3;
        System.out.println(prefixsum(arr,l,r));
    }
    
    static int prefixsum(int[]arr,int l, int r){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        if(l==0){
            return prefix[r];
        }
        else{
            return prefix[r]-prefix[l-1];
        }
    }
}
