package daily;
/*
给定一个非负整数N，返回N!结果的末尾为0的数量
示例1
输入
复制
3
返回值
复制
0
说明
3!=6
示例2
输入
复制
5
返回值
复制
1
说明
5!=120
示例3
输入
复制
1000000000
返回值
复制
249999998
 */
public class demo51 {
    /**
     * the number of 0
     * @param n long长整型 the number
     * @return long长整型
     */
    public long thenumberof0 (long n) {
        // write code here
        return recurve(n);
    }

    public long recurve(long n) {
        if(n < 5){
            return 0;
        }
        long res = 0;
        while(n !=0 ) {
            res = res + n / 5;
            n = n / 5;
        }
        return res;
    }
}
