  void Sum(vector<int>& candidates, int target, vector<vector<int> >& res, vector<int>& r, int i)
    {
        
        if(target == 0)
        {
            // if we get exact answer
            res.push_back(r);
            return;
        }
        
        while(i <  candidates.size() && target - candidates[i] >= 0)
        {
      
            r.push_back(candidates[i]);
            
           
            Sum(candidates,target - candidates[i],res,r,i);
            ++i;
            
           
            r.pop_back();
        }
}

class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector <int> res;
        vector <vector<int> > finals;
        int n=candidates.size();
        //if(candidates.size()==1 && candidates[0]!=target)
           // return finals;
        if(candidates.size()==1 && candidates[0]==target){
            res.push_back(target);
            finals.push_back(res);
            return finals;
        }
      
        sort(candidates.begin(),candidates.end());
  
        Sum(candidates,target,finals,res,0);
        
        return finals;
  
            
        
    }
};