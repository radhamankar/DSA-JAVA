package strings;
import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        int i=0;
        for(int j=0;j<n;j++){
            
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            }
            
            int length=j-i+1;
            maxlen=Math.max(maxlen,length);
        }
        return maxlen;
    }
}