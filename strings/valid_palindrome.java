package strings;
class Solution {

    boolean isAlphanumeric(char ch){
        return(ch>='A' && ch<='Z')||
               (ch>='a' && ch<='z')||
               (ch>='0' && ch<='9');
    }
    public boolean isPalindrome(String s) {

        int i=0,j=s.length()-1;
        while(i<j){

            while(i<j && !isAlphanumeric(s.charAt(i))){
                i++;
            }
             while(i<j && !isAlphanumeric(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=
            Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}