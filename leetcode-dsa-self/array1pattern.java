//prob1
// Problem Statement
// Given an integer array arr of size n, find the maximum sum of any contiguous subarray of size k.
// Example
// arr = [2, 1, 5, 1, 3, 2]
// k = 3
// Output = 9
// Explanation: subarray [5,1,3]

public class array1pattern {
   public static void main(String[] args) {
    int arr[]={2,1,5,1,3,2};
    int k=3;
    int ans=findmaxsubarr(arr,k);
    System.out.println(ans);
   } 
   //bruteforce
//    static int findmaxsubarr(int[]arr,int k){
//         int max=0;
//         int l=0;
//         int r=l+k-1;
//         while(r<arr.length){
//             int sum=0;
//             for(int i=l;i<=r;i++){
//                 sum+=arr[i];
//             }
//             if(sum>max){
//                 max=sum;
//             }
//             l++;
//             r=l+k-1;
//         }
//         return max;    
//    }


//optimised sliding window
   static int findmaxsubarr(int[]arr,int k){
      int max=0;
      int windowsum=0;
      for(int i=0;i<k;i++){
         windowsum+=arr[i];
      }
      max=windowsum;
      for(int i=k;i<arr.length;i++){
         windowsum+=arr[i];//expandthewindow
         windowsum-=arr[i-k];//reduce the window
         max=Math.max(max, windowsum);
      }
      return max;
   }
}
