class Solution {
 public:   
    void Track(vector<vector<int>>& res, vector<int>& nums, vector<int>& permutation, vector<bool>& used){
     if(permutation.size() == nums.size()){
         res.push_back(permutation);
         return; 
     }
        
        for(int i=0;i<nums.size();i++){
            if (!used[i]){     
                //valid option
                used[i]= true;
                permutation.push_back(nums[i]);
                Track(res, nums, permutation, used);
                //Undo option
                used[i]= false;
                permutation.pop_back();
                    
            }
        }
    }
    

    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> res;
        vector<bool> used(nums.size(),false);
        vector<int> permutation;
        Track(res, nums, permutation, used);
        return res;
        
    }
};