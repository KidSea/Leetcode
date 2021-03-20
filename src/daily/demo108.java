package daily;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class demo108 {
    public static void main(String[] args) {
        demo108 demo108 = new demo108();
        demo108.reOrderArray(new int[] {1,2,3,4,5,6,7});
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        if (array.length <= 1) return array;
        int [] results = new int[array.length];
        Queue<Integer> odds = new ArrayDeque<Integer>();
        Queue<Integer> means = new ArrayDeque<Integer>();
        for (int temp : array) {
            if (temp % 2 == 0) {
                means.offer(temp);
            } else {
                odds.offer(temp);
            }
        }
        int index = 0;
        System.out.println("odds: " + odds);
        System.out.println("means: " + means);
        while (!odds.isEmpty()) {
            results[index++] = odds.poll();
        }
        while (!means.isEmpty()) {
            results[index++] = means.poll();
        }
        return results;
    }
}
