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
        
        
//     int max_ending_here = arr[0];
 
//     int min_ending_here = arr[0];
 
//     int max_so_far = arr[0];
  
//     for (int i = 1; i < n; i++)
//     {
//         int temp = max({arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here});
//         min_ending_here = min({arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here});
//         max_ending_here = temp;
//         max_so_far = max(max_so_far, max_ending_here);
//     }
//     return max_so_far;
    }
};