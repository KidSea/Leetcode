package daily;

import java.util.Arrays;
import java.util.HashMap;
/*
数组中最长连续子串
 */
public class demo109 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int max = 1;
        int continuousLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                continuousLength++;
                max = Math.max(max, continuousLength);
            } else if (nums[i] == nums[i-1]) {
                continue;
            } else {
                continuousLength = 1;
            }
        }
        return max;
    }

    public int longestConsecutives(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int x : nums) {
            if (!map.containsKey(x)) {
                int left = map.getOrDefault(x - 1, 0);
                int right = map.getOrDefault(x + 1, 0);
                int sum = left + right + 1;
                map.put(x, sum);
                map.put(x - left, sum);
                map.put(x + right, sum);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
