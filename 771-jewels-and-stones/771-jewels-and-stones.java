class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> trial = new HashSet<>();
        int common=0;
        for(int i=0;i<jewels.length();i++){
            trial.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(trial.contains(stones.charAt(i))) 
                common++;
        }
        return common;
    
    }
}