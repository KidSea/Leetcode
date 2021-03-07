package daily;

/**
 * 题目描述
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 返回值描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 示例1
 * 输入
 * 复制
 * "+2147483647"
 * 返回值
 * 复制
 * 2147483647
 */
public class demo102 {
    public int StrToInt(String str) {
        if (str.isEmpty()) return 0;
        str = str.trim();
        int sum = 0;
        int flag = 1;
        if (str.charAt(0) == '-') flag = -1;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int temp = 0;
            if (isValideC(c)) {
                temp = asInt(c);
            } else {
                if (i > 0) return 0;
                temp = 0;
            }
            sum = temp + sum * 10;
        }
        return sum * flag;
    }

    private boolean isValideC(char c) {
        return c >= 48 && c <= 57;
    }

    private int asInt(char c) {
        switch (c) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return 0;
        }
    }

    /**
     * public int StrToInt(String str) {
     *        Integer res=0;
     *         try {
     *              res = new Integer(str);
     *         } catch (NumberFormatException e) {
     *
     *         } finally {
     *             return res;
     *         }
     * }
     */
}
