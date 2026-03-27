package strings;
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        int n=s.length();
       
        ArrayList<String> words=new ArrayList<>();
        int i=0;
        while(i<n){
            
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n)break;
            
            int start=i;
            while(i<n && s.charAt(i)!=' '){
                i++;
            }
            words.add(s.substring(start,i));
        }
        Collections.reverse(words);
        
        return String.join(" ", words);
        
    }
}