import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(a + b, "+");
        map.put(a - b, "-");
        map.put(a * b, "*");

        if (map.size() < 3) {
            System.out.println("NIE");
        } else {
            Object[] mapKey = map.keySet().toArray();
            Arrays.sort(mapKey);
            StringBuilder str = new StringBuilder();
            int max = (int) mapKey[2];
            if (a < 0) {
                str.append("(").append(a).append(")");
            } else {
                str.append(a);
            }
            str.append(map.get(max));
            if (b < 0) {
                str.append("(").append(b).append(")");
            } else {
                str.append(b);
            }
            str.append("=");
            if (max < 0) {
                str.append("(").append(max).append(")");
            } else {
                str.append(max);
            }
            System.out.println(str);
        }

    }
}