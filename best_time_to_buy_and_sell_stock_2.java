// Time Complexity : O(n), where n is the size of the input array
// Space Complexity :O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation of your code in plain english
//1. Iterate over the array starting from index 1 and check if you can buy that day (Assuming you sold on i-1th day) ,
        //i.e, prices[i] > prices[i-1]
//2. If yes, calculate the profit (difference) and add it to the total profit
//3. Move i and keep doing the same check with i-1 (Remember, you can do more than one transaction moving forward in the array, so 
        // so you don't have to find the maximum profit, but the possible total maximum profit)

// Your code here along with comments explaining your approach

class Solution {
    public int maxProfit(int[] prices) {
        //edge case
        if(prices == null || prices.length == 0) return 0;
        int profit = 0;
        //calculate the adjacent days stock prices
        for(int i=1; i<prices.length; i++){
            //add to profit, if selling price is higher than buying price
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}