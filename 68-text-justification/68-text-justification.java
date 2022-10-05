class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        
         List<String> result = new ArrayList<>();
            StringBuilder substring = new StringBuilder();

            int start = 0, length = 0;
            for (int i = 0; i < words.length; i++) {
                
                if (words[i].length() <= (maxWidth - length)) {
                    length += words[i].length() + 1;
                    continue;
                }
             
                else {
                  
                    int remainingSpaces = maxWidth - length + 1;
                    
                    int noOfWords = i - start - 1;
                    int extraSpaceBetweenWords = 0;

                    if (noOfWords > 0) {
                        extraSpaceBetweenWords = remainingSpaces / noOfWords;
                        remainingSpaces = remainingSpaces % noOfWords;
                    }
                    
                    while (start < i - 1) {
                        substring.append(words[start++]).append(" ");
                        int k = 0;
                        while (k < extraSpaceBetweenWords) {
                            substring.append(" ");
                            k++;
                        }
                        if (remainingSpaces > 0) {
                            substring.append(" ");
                            remainingSpaces--;
                        }
                    }

                    substring.append(words[start]);
                    
                    while (remainingSpaces > 0) {
                        substring.append(" ");
                        remainingSpaces--;
                    }
                    result.add(substring.toString());

                    start = i;
                    length = words[i].length() + 1;
                    substring.setLength(0);
                }
            }
          
            substring.setLength(0);
            while (start < words.length - 1) {
                substring.append(words[start++]).append(" ");
            }
            substring.append(words[start]);

            while (substring.length() < maxWidth) {
                substring.append(" ");
            }
            result.add(substring.toString());

            return result;
    }
}