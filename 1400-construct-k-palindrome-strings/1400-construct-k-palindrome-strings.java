class Solution {
    public boolean canConstruct(String s, int k) {
        int freq_t[] = new int [26];
         int cnt=0;
        
         if(s.length()<k)
           return false;
         if(s.length()==k)
            return true;
          
        
        for(char r:s.toCharArray())
            freq_t[r-'a']++;
        for(int e: freq_t)
            if(e%2!=0)
                cnt++;
        
        return cnt<=k;
    }
}