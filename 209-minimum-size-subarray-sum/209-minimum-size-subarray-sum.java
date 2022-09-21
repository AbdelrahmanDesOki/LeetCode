class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int sum=0;
      for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return 1;
            sum+= nums[i];
        }
        if(sum<target)
            return 0;
     sum=0;
    int left=0, res =Integer.MAX_VALUE;
        
    for(int right=0;right<nums.length;right++){
        sum+=nums[right];
        while(sum>=target){
          res = Math.min(right-left+1, res);
          sum-=nums[left];
          left+=1;
        }
       
    }
        



        return res;
    }
}