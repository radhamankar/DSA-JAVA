package strings;
import java.util.HashMap;

class Sol {
    int getCount(String S, int N) {
        // your code here
        int n=S.length();
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(i==0 || S.charAt(i)!=S.charAt(i-1)){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        int count=0;
        for(int it:map.values()){
            if(it==N){
                count++;
            }
        }
        return count;
    }
}