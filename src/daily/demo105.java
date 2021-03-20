package daily;

import java.math.BigDecimal;

/*
统计一个数字在升序数组中出现的次数。
示例1
输入
复制
[1,2,3,3,3,3,4,5],3
返回值
复制
4
 */
public class demo105 {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length <= 0) return 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            }
        }
        return count;
    }
}
