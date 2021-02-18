package daily;

/**
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * 示例 1：
 *
 * 输入：n = 1
 * 输出："1"
 * 解释：这是一个基本样例。
 * 示例 2：
 *
 * 输入：n = 4
 * 输出："1211"
 * 解释：
 * countAndSay(1) = "1"
 * countAndSay(2) = 读 "1" = 一 个 1 = "11"
 * countAndSay(3) = 读 "11" = 二 个 1 = "21"
 * countAndSay(4) = 读 "21" = 一 个 2 + 一 个 1 = "12" + "11" = "1211"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo16 {
    public String countAndSay(int n) {
        if (n < 1 || n > 30) return null;
        if (n == 1) {
            return "1";
        }
        String lastString = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        // 记录每个数字的开始索引
        int start = 0;
        //"1211"
        for (int i = 1; i < lastString.length(); i++) {
            // 当数字发生改变时执行
            if (lastString.charAt(i) != lastString.charAt(start)) {
                result.append(i - start).append(lastString.charAt(start));
                start = i;
            }
        }
        // 字符串最后一个数字
        result.append(lastString.length() - start).append(lastString.charAt(start));
        return result.toString();
    }
}
