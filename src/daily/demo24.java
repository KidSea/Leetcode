package daily;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class demo24 {
    public static void main(String[] args) {
        demo24 demo24 = new demo24();
        String abcXYZdef = demo24.LeftRotateString("abcXYZdef", 3);
        System.out.println(abcXYZdef);
    }
    public String LeftRotateString(String str,int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.isEmpty() || str.length() == n) return str;
        // 记录从哪开始
        int index = n;
        // 如果大于字符长度的情况，就去掉一轮
        if (n > str.length()) {
            index = n - str.length();
        }
        for (int i = n; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
        }
        for (int i = 0;i < n;i++) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
