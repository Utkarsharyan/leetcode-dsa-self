// Problem Statement
// Given a string s, find the length of the longest substring without repeating characters.
// Example:
// s = "abcabcbb"
// Output = 3  // "abc"

import java.util.HashMap;

public class array6pattern {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(maxstrlen(s));
    }
    static int maxstrlen(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c, right);
            max=Math.max(max, right-left+1);
        }
        return max;

    }
}
