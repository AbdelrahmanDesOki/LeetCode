class Solution {
public:
    bool isAnagram(string s, string t) {
     int count=0;
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());
        
//         for(int i=0;i<t.length();i++){
//              if(t[i]==s[i]){
//                  count++;
                
//              }   
            
//         }
        
//         if(count==s.length())
//             return true;
            
        return s==t;    
    }
};