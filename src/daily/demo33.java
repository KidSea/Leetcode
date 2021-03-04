package daily;

import java.util.ArrayList;
import java.util.Arrays;
/*
给出一组数字，返回该组数字的所有排列
例如：
[1,2,3]的所有排列如下
[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2], [3,2,1].
（以数字在数组中的位置靠前为优先级，按字典序排列输出。）
 */
public class demo33 {
    public static void main(String[] args) {
        demo33 demo33 = new demo33();
        demo33.permute(new int[] {1,2,3});
    }
    ArrayList<ArrayList<Integer>> res;
    // [1,2,3]
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        res = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length < 1) return null;
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<>();

        solve(list, num);
        return res;
    }

    private void solve(ArrayList<Integer> list, int[] num) {
        if (list.size() == num.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (!list.contains(num[i])) {
                list.add(num[i]);
                solve(list, num);
                System.out.println(list);
                list.remove(list.size() - 1);
            }
        }
    }
/*
1 
 */

}
