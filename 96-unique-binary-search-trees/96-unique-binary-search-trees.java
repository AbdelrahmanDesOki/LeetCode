class Solution {
    public int numTrees(int n) {
     HashMap <Integer, Integer> nop = new HashMap<>();
        int sum = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        else{

            for (int i = 1; i <= n; ++i) {
                if(!nop.containsKey(i-1))
                    nop.put(i-1,numTrees(i-1));
                if(!nop.containsKey(n-i))
                    nop.put(n-i,numTrees(n-i));

                sum += nop.get(n-i) * nop.get(i-1);
            }
        }

        return sum;
    }
}