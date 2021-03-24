package daily;

import java.util.ArrayList;

/*
题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
示例1
输入
复制
"ab"
返回值
复制
["ab","ba"]
 */
public class demo47 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str.length() == 0){
            return result;
        }

        recur(str,"",result);
        return result;
    }

    public void recur(String str,String cur,ArrayList<String> result){
        if(str.length() == 0){
            if(!result.contains(cur)){
                result.add(cur);
            }
        }
        for(int i = 0; i < str.length();i++){
            recur(str.substring(0,i)+str.substring(i+1,str.length()),cur+str.charAt(i),result);
        }
    }
}
