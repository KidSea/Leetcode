package daily;

public class demo14 {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (judge(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean judge(int m) {
        if (m < 2) return false;
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}
