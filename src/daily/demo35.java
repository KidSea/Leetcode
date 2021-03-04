package daily;
/*
假定你知道某只股票每一天价格的变动。
你最多可以同时持有一只股票。但你最多只能进行两次交易（一次买进和一次卖出记为一次交易。买进和卖出均无手续费）。
请设计一个函数，计算你所能获得的最大收益。
 */
public class demo35 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 两次交易所能获得的最大收益
     * @param prices int整型一维数组 股票每一天的价格
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int n = prices.length;
        if(n<2)
            return 0;
        //从后往前遍历,f[i] 表示从i点到之后的一次交易的最大收益
        int[] f = new int[n];
        int max = prices[n-1];
        f[n-1] = 0;    //初始化
        for(int i=n-2;i>=0;i--){
            max = Math.max(max,prices[i]);
            f[i] = Math.max(f[i+1], max-prices[i]);
        }
        int res = 0;
        //从前往后遍历
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min = Math.min(min,prices[i]);
            res  = Math.max(res,prices[i]-min + f[i+1]);
        }
        return res;
    }
}
