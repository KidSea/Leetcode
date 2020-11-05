package daily;

import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 说明：
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class demo1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> integers1 = new HashSet<Integer>();
        for (Integer integer : nums1) {
            integers1.add(integer);
        }
        HashSet<Integer> integers2 = new HashSet<Integer>();
        for (Integer integer: nums2) {
            if (integers1.contains(integer)) {
                integers2.add(integer);
            }
        }
        int[] results = new int[integers2.size()];
        int i = 0;
        for (Integer integer: integers2) {
            results[i++] = integer;
        }
        return results;
    }
}
