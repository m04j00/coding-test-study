package bronze.b1;

import java.util.HashMap;
import java.util.Scanner;

public class no1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.next().toUpperCase();
        String[] sen = sentence.split("");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : sen) {
            if (map.containsKey(s)) {
                int cnt = map.get(s);
                map.replace(s, ++cnt);
            } else {
                map.put(s, 1);
            }
        }

        int max = 0;
        String maxKey = "";
        for (String key : map.keySet()) {
            int cnt = map.get(key);
            if (cnt > max) {
                max = cnt;
                maxKey = key;
            }
        }

        int max2 = 0;
        for (String key : map.keySet()) {
            int cnt = map.get(key);
            if (cnt == max) max2++;
        }

        if (max2 > 1) System.out.println("?");
        else System.out.println(maxKey);
    }
}
