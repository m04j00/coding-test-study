import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        String[] sen = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            sen[i] = scan.next();
        }
        lengthCompare(sen);

        for (int i = 0; i < sen.length - 1; i++) {
            if (sen[i].equals(sen[i + 1])) {
                sen[i] = "";
            }
        }
        for (String s : sen) {
            if (s.length() != 0)
                System.out.println(s);
        }
    }

    public static String[] lengthCompare(String[] sen) {
        Arrays.sort(sen, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else
                    return s1.length() - s2.length();
            }
        });
        return sen;
    }
}