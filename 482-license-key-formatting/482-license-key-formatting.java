class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
         s=   s.toUpperCase();
        StringBuilder word = new StringBuilder();

              int cnt =0;
              for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='-')
                    continue;

                    if(cnt ==k){
                        word.append("-");
                        cnt =0;

                    }
                   word.append(s.charAt(i));
                    cnt++;
              }

        return word.reverse().toString();
        
    }
}