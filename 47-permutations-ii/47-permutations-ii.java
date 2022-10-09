class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
     return permuteRec_2(nums,new boolean[nums.length], new ArrayList<Integer>());
    }

    private List<List<Integer>> permuteRec_2 (int [] nums, boolean [] taken, List<Integer>prefix){

        List<List<Integer>> res  = new ArrayList<>();
        HashSet <Integer> visited = new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(visited.contains(nums[i]) || taken[i])
                continue;
            taken[i] =true;
            prefix.add(nums[i]);
            visited.add(nums[i]);
            res.addAll(permuteRec_2(nums,taken,prefix));
            prefix.remove(prefix.size()-1);
            taken[i]=false;


        }
        if(res.size()==0)
            res.add(new ArrayList<>(prefix));
        




        return res;
    }
}