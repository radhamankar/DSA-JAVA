package strings;
class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j){
            if(i<j && !Character.isLetter(arr[i])){
                i++;
            }else if(i<j && !Character.isLetter(arr[j])){
                j--;
            }else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                 i++;
                j--;
            }
           
        }
        return new String(arr);
        
    }
}