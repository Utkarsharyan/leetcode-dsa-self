import java.util.HashMap;

public class q2 {
    public static void main(String[] args) {
        
    }
}
class solution{
    static int[] twosum(int[]nums,int tar){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=tar-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};//get the index of the val
            }
        }
        return new int[]{-1,-1};
    }
}