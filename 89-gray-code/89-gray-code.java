class Solution {
    public List<Integer> grayCode(int n) {
        
          int limit = (int)Math.pow(2,n-1);
          int item =0;
          boolean swap = false;
          List<Integer> sequence = new ArrayList<>(limit*2);
       
        for(int i=0;i<limit;i++){
            int db= item*2;
            if(swap){
                sequence.add(db+1);
                sequence.add(db);
            }
            else{
                sequence.add(db);
                sequence.add(db+1); 
            }
                swap = !swap;
                item = sequence.get(i+1);
        }
        return sequence; 
    }
}