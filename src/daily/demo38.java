package daily;
/*
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class demo38 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @param pattern string字符串
     * @return bool布尔型
     */
    public boolean match (String str, String pattern) {
        // write code here
        if (pattern.length() == 0) {
            return str.length() == 0;
        }
        // 一对一匹配 或 .
        boolean match = (str.length() > 0 && (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.'));
        // 有*
        if (pattern.length() > 1 && pattern.charAt(1) == '*') {
            // 0个 || 多个
            return match(str, pattern.substring(2)) || (match && match(str.substring(1), pattern));
        }
        // 无*
        else {
            return match && match(str.substring(1), pattern.substring(1));
        }
    }
}
