public class Solution {
    public int maxProfit(int a[]) {
//         int maxprofit = 0;
//         for (int i = 0; i < prices.length - 1; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 int Profit = prices[j] - prices[i];
//                 if (Profit > maxprofit)
//                     maxprofit = Profit;
//             }
//         }
//         return maxprofit;
//     }
// }
        int maxProfit=0;
        int minSofar=a[0];
        for(int i=0;i<a.length;i++)
        {
            minSofar=Math.min(minSofar,a[i]);
            int profit=a[i]-minSofar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}