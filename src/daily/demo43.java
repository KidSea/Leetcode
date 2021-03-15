package daily;

import java.util.ArrayList;
import java.util.HashSet;

/*
每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)

如果没有小朋友，请返回-1
 */
public class demo43 {
    public static void main(String[] args) {
        demo43 demo43 = new demo43();
        System.out.println("child: "+demo43.LastRemaining_Solution(5, 3));
    }
    public int LastRemaining_Solution(int n, int m) {
        // 不满足的条件
        if (n <= 0 || m <= 0) return -1;
        return n == 1 ? 0 : (LastRemaining_Solution(n - 1, m) + m) % n;
    }
    /*
    public int LastRemaining_Solution(int n, int m) {
        if (n < 0) return -1;
        int lastIndex = 0;
        ArrayList<Integer> childs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            childs.add(i);
        }
        System.out.println(childs);
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("index,"+ index);
                if (index++ == childs.size()) {
                    System.out.println("change index,"+index);
                    index = 0;
                }
            }
            System.out.println("--------------------------------------");
            int key = index > 0 ? index - 1 : 0;
            System.out.println("key,"+ key + ", " + index);
            if (key >= 0 && key <= childs.size() - 1) {
                childs.remove(key);
                System.out.println("key,"+key + ", " + childs);
                if (index - 1 == childs.size()) {
                    index = 0;
                }
                if (index > 0) index--;
            }
        }
        return childs.get(0);
    }
     */
}
