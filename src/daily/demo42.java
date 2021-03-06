package daily;
/*
题目描述
给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
输入描述:
输入一个数n，意义见题面。（2 <= n <= 60）
返回值描述:
输出答案。
示例1
输入
复制
8
返回值
复制
18
 */
public class demo42 {
//    public int cutRope(int target) {
//        if(target <= 4) return target;
//        return cutRope(target, 0);
//    }
//    public int cutRope(int target, int max) {
//        int maxValue = max;
//        for(int i = 1; i < target; ++i){
//            maxValue = Math.max(maxValue, i*cutRope(target -i, target -i));
//        }
//        return maxValue;
//    }
    public int cutRope(int n) {
        // n<=3的情况，m>1必须要分段，例如：3必须分成1、2；1、1、1 ，n=3最大分段乘积是2,
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int[] dp = new int[n+1];
            /*
            下面3行是n>=4的情况，跟n<=3不同，4可以分很多段，比如分成1、3，
            这里的3可以不需要再分了，因为3分段最大才2，不分就是3。记录最大的。
             */
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        for (int i = 4; i <= n; i++) {
            int res=0;//记录最大的
            for (int j = 1; j <=i/2 ; j++) {
                res=Math.max(res,dp[j]*dp[i-j]);//这里需要是两个dp值的乘积，而不是我之前想的j*dp[i-j]
            }
            dp[i]=res;
        }
        return dp[n];
    }
}
