class Solution {
    public int maxProfit(int[] prices) {
        int Minprice =Integer.MAX_VALUE;
        int Maxprice =Integer.MIN_VALUE;
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<Minprice){
                Minprice=prices[i];
            }
            else {Maxprice=prices[i];

                if(maxprofit< Maxprice-Minprice){
                    maxprofit = Maxprice - Minprice;

                }
            }
        }
        return maxprofit;
    
    }
}