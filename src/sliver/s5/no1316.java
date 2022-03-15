package sliver.s5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class no1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;
        for (int i = 0; i < num; i++) {
            Map<String, Integer> map = new HashMap<>();
            boolean plug = true;
            String str = scan.next();
            map.put(str.substring(0, 1), 1);
            for (int j = 1; j < str.length(); j++) {
                String s = str.substring(j, j + 1);
                if (s.equals(str.substring(j - 1, j))) continue;
                if (map.containsKey(s)) {
                    plug = false;
                    break;
                }
                map.put(s, 1);
            }
            if (plug) answer++;
        }
        System.out.println(answer);
    }
}
