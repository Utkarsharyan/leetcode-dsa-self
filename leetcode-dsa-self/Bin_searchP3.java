public class Bin_searchP3 {
    
}



//P1
// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.
// Example 1:
// Input: piles = [3,6,7,11], h = 8
// Output: 4
class Solution0 {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;

        int high = 0;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }

        int ans = high;

        while(low <= high){

            int mid = low + (high - low) / 2;

            int total = 0;

            for(int i = 0; i < piles.length; i++){
                total += (piles[i] + mid - 1) / mid;   // ceil
            }

            if(total <= h){
                ans = mid;
                high = mid - 1;   // try smaller speed
            }
            else{
                low = mid + 1;    // need faster speed
            }
        }

        return ans;
    }
}

//P2
// The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
// Example 1:

// Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
// Output: 15
// Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
// 1st day: 1, 2, 3, 4, 5
// 2nd day: 6, 7
// 3rd day: 8
// 4th day: 9
// 5th day: 10

// Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

class Solution1 {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>l){
                l=weights[i];
            }
            h+=weights[i];
        }
        int ans=h;
        while(l<=h){
            int m=l+(h-l)/2;
            int day=1;
            int currload=0;
            for(int i=0;i<weights.length;i++){
                if(currload+weights[i]<=m){
                    currload+=weights[i];
                }
                else{
                    day++;
                    currload=weights[i];
                }
            }
            if(day<=days){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }

        }
        return ans;
    }
}
