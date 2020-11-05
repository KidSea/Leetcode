package daily;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 * 示例 2：
 *
 * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出：[[1,2],[3,10],[12,16]]
 * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/insert-interval
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo3 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int leftInterval = newInterval[0];
        int rightInterval = newInterval[1];
        for (int[] interval: intervals) {
            if (interval[0] > rightInterval || interval[1] < leftInterval) {
                list.add(new int[]{
                   Math.min(interval[0], leftInterval),
                   Math.min(interval[1], rightInterval),
                });
                leftInterval = Math.max(interval[0], leftInterval);
                rightInterval = Math.max(interval[1], rightInterval);
            } else {
                leftInterval = Math.min(interval[0], leftInterval);
                rightInterval = Math.max(interval[1], rightInterval);
            }
        }
        list.add(new int[]{leftInterval, rightInterval});
        return list.toArray(new int[0][]);
    }
}
