package daily;

public class demo13 {
    public static void main(String[] args) {
        reversePairs(new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647});
    }
    public static int reversePairs(int[] nums) {
        int count = 0;
        if (nums.length < 2) return 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("i: " + i + ", j: " + j + ", " + nums[i] + ", " + nums[j]);
                int max = (int) (Math.pow(2, 32) - 1);
                if (nums[j] == max) continue;
                if (nums[i] > 2 * nums[j]) {
                    System.out.println(count);
                    count++;
                }
            }
        }
        return count;
    }
}
