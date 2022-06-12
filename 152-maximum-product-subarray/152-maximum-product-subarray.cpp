class Solution {
public:
    int maxProduct(vector<int>& nums) {
     
        if(nums.size()==1)
            return nums[0];
        int best = nums[0], sum = nums[0], min_here= nums[0];
    for (int k = 1; k < nums.size(); k++) {
        int tempsum = max({nums[k],sum*nums[k], min_here * nums[k]});
           min_here = min({nums[k],sum*nums[k], min_here * nums[k]});
        sum = tempsum;
        best = max(best,sum);
    }
        return best;
        
    }
};