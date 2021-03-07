package daily;

import java.util.HashMap;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中第一个重复的数字。 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是第一个重复的数字2。没有重复的数字返回-1。
 */
public class demo103 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        if (numbers.length == 0) return -1;
        // write code here
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(Integer num : numbers) {
            if (numMap.containsKey(num)) {
                return num;
            } else {
                numMap.put(num, 1);
            }
        }
        return -1;
    }
}
