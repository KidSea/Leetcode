package daily;
/*
 求从小到大第n个丑数
 */
public class demo23 {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        int [] uglys = new int[index];
        uglys[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1;i <= index;i++) {
            uglys[i] = Math.min(uglys[p2]*2, Math.min(uglys[p3]*3, uglys[p5]*5));
            if(uglys[i] == uglys[p2]*2)p2++;//为了防止重复需要三个if都能够走到
            if(uglys[i] == uglys[p3]*3)p3++;//为了防止重复需要三个if都能够走到
            if(uglys[i] == uglys[p5]*5)p5++;//为了防止重复需要三个if都能够走到
        }
        return uglys[index - 1];
    }
}
