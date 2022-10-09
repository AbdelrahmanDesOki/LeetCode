class Solution {
        public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res =new ArrayList<>();

     HashSet<Integer> hashset = IntStream.of(nums).boxed().collect(Collectors.toCollection(HashSet::new));


        permuteRec(hashset, new ArrayList<Integer>() ,res );
      return res;

    }

    public void permuteRec(HashSet <Integer>nums, List<Integer> prefix, List<List<Integer>> res){
            if(nums.size()==0){
               res.add(new ArrayList<>(prefix));
                return;
            }
            HashSet<Integer> remainingnums= new HashSet<Integer>(nums);
            for(int value: nums){
                remainingnums.remove(value);
                prefix.add(value);
                permuteRec(remainingnums,prefix,res);
                remainingnums.add(value);
                prefix.remove(prefix.size()-1);
            }
    }
}