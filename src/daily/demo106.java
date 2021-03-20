package daily;

import java.util.Arrays;
import java.util.HashMap;

public class demo106 {
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        if(array.length <= 4) return array;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int [] results = new int[2];
        for(int i = 0; i < array.length;i++) {
            if(countMap.containsKey(array[i])) {
                int currentCount = countMap.get(array[i]);
                countMap.put(array[i], currentCount + 1);
            } else {
                countMap.put(array[i], 1);
            }
        }

        int index = 0;

        for(Integer temp : countMap.keySet()) {
            if(countMap.get(temp) == 1) {
                results[index++] = temp;
            }
        }

        Arrays.sort(results);
        return results;
    }
}
