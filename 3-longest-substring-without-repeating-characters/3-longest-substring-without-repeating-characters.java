class Solution {
    public int lengthOfLongestSubstring(String s) {
        
          if(s.length()==0||s.length()==1){
            return s.length();
        }
        HashSet<Character> charHS = new HashSet<>();
        int i=0,j=0;
        int max = 0;
        int n=s.length();
        while(j<n){
            char c = s.charAt(j);
            if(!charHS.contains(c)){
                charHS.add(c);
                j++;
            }
            else{
                charHS.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max,charHS.size());
    }
        return max;
}
}