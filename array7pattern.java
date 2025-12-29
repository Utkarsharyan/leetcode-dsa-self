// Problem Statement
// Given a string s and a string t, check if t is an anagram of s.
// Example:
// s = "anagram"
// t = "nagaram"
// Output = true
// Two strings are anagrams if:
// They contain the same characters
// With the same frequencies
// But the order can be different

import java.util.HashMap;

public class array7pattern {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(anagramcheck(s,t));
    }
    
    static boolean anagramcheck(String s, String t){
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            }
            else{
                map2.put(t.charAt(i), 1);
            }
        }
        return map1.equals(map2);
    }
}
