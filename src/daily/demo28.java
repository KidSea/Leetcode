package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo28 {
    public static void main(String[] args) {
        demo28 demo28 = new demo28();
        System.out.println(demo28.ReverseSentence(" "));
    }
    public String ReverseSentence(String str) {
        if (str.trim().isEmpty()) {
            System.out.println("1222");
            return str;
        }
        StringBuilder StringBuilder = new StringBuilder();
        String[] splits = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(splits));
        Collections.reverse(arrayList);
        for (String s : arrayList) {
            StringBuilder.append(s + " ");
        }
        return StringBuilder.toString().trim();
    }
}
