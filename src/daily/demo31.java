package daily;

import java.util.TreeSet;

public class demo31 {
    public boolean IsContinuous(int [] numbers) {
        if(numbers.length != 5) return false;
        int count0 = 0;
        TreeSet<Integer> Integers = new TreeSet<>();
        for (int num: numbers) {
            if (num == 0) {
                count0++;
            } else {
                Integers.add(num);
            }
        }

        if ((count0 + Integers.size()) != 5) return false;
        return Integers.last() - Integers.first() < 5;
    }
}
