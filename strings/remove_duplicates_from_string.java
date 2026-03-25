package strings;
import java.util.HashSet;
class Solution {
    String removeDuplicates(String s) {
        
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
