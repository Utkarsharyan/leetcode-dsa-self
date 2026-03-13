//striver 3 
public  class q3 {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int n=s.length();
        int l=0;
        int r=0;
        int max=0;
        while(r<n){
            char ch=s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}
