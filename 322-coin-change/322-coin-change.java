class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
    int [] few = new int[amount + 1];
        Arrays.fill(few, amount + 1);
    few[0] = 0;
    for(int i=0;i<=amount; i++) {
        for(int j = 0; j < coins.length; j++) {
            if(coins[j]<= i){
            few[i] = Math.min(few[i], 1 + few[i - coins[j]]);
            } 
            else {break;}
        }   
}


return few[amount] > amount ? -1 : few[amount];
    }    
}