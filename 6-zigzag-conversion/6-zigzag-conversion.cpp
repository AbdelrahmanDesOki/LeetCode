class Solution {
public:
    string convert(string s, int numRows) {
        
       
        if(numRows == 1 || s.length()==1)
            return s;
       
         string sol="";
         int itr = 2 * numRows -2;
        
        for(int i=0;i<numRows;i++){
            for(int j=0;j+i<s.size();j+=itr){
                sol+=s[i+j];
                if( i>0  && i!=numRows-1 && j+itr-i <s.size() ){
                    sol+=s[j+itr-i];
                }
            }
        }
      
        return sol;
    }
};