package daily;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
给定String类型的数组strArr，再给定整数k，请严格按照排名顺序打印 出次数前k名的字符串。
[要求]
如果strArr长度为N，时间复杂度请达到O(N \log K)O(NlogK)

输出K行，每行有一个字符串和一个整数（字符串表示）。
你需要按照出现出现次数由大到小输出，若出现次数相同时字符串字典序较小的优先输出
 */
public class demo29 {
    /**
     * return topK string
     * @param strings string字符串一维数组 strings
     * @param k int整型 the k
     * @return string字符串二维数组
     */
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        if (strings.length == 0) return null;
        Map<String, Integer> stringMap = new HashMap<>();
        for (String s : strings) {
            if (stringMap.containsKey(s)) {
                Integer c = stringMap.get(s);
                stringMap.put(s, c + 1);
            } else {
                stringMap.put(s, 1);
            }
        }

        String[][] results = new String[k][2];

        // 建立大小为k的小顶堆
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> stringMap.get(w1).equals(stringMap.get(w2)) ?
                        w2.compareTo(w1) : stringMap.get(w1) - stringMap.get(w2) );

        for (String word: stringMap.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        int j = k-1;
        while (!heap.isEmpty()) {
            String tmp = heap.poll();
            results[j][0] = tmp;
            results[j][1] = stringMap.get(tmp) + "";
            j--;
        }
        return results;
    }
}
