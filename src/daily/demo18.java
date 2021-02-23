package daily;

import java.util.HashMap;

/**
 * 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中第一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 返回描述：
 * 如果数组中有重复的数字，函数返回true，否则返回false。
 * 如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。（ps:duplication已经初始化，可以直接赋值使用。）
 */
public class demo18 {
    public static void main(String[] args) {
        demo18 demo18 = new demo18();
        int number[] = new int[] {6,3,2,0,2,5,0};
        int duplication[] = new int[]{0};
        boolean duplicate = demo18.duplicate(number, 7, duplication);
        System.out.println(duplicate +", " + duplication[0]);
    }
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean hasDuplicate = false;
        //[6,3,2,0,2,5,0]
        if (length <= 1) return hasDuplicate;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (countMap.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                countMap.put(numbers[i], 1);
            }
        }
        return hasDuplicate;
    }
}