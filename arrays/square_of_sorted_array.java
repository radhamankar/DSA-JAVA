package arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        int i=0,j=n-1,k=n-1;

        while(i<=j){
            int leftsquare=nums[i]*nums[i];
            int rightsquare=nums[j]*nums[j];
            if(leftsquare>rightsquare){
                ans[k]=leftsquare;
                i++;
            }else{
                ans[k]=rightsquare;
                j--;
            }
            k--;
        }
        return ans;
        
    }
}