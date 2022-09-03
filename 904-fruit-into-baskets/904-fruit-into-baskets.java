class Solution {
    public int totalFruit(int[] fruits) {
             if(fruits.length <=2)
           return fruits.length;
       int first=-1, sec=-1;
       int first_count=0;
       int max=0,current_max=0;

       for(Integer fruit: fruits){
        if(fruit==first || fruit==sec){
            current_max+=1;
        }
        else{
            current_max = first_count+1;
        }

        if(fruit==first){
            first_count+=1;
        }else{
            first_count=1;
        }

        if(fruit!=first){
            sec=first;
            first=fruit;
        }

        max= Math.max(max,current_max);



       }




       return max;
    }
}