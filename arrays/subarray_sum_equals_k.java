package arrays;
import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int prefixsum=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
          map.put(0,1);
        for(int i=0;i<n;i++){

            prefixsum+=nums[i];
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }

       return count; 
    }
}