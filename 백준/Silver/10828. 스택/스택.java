import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] arr;
    public static int size = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            String[] req = bf.readLine().split(" ");
            switch (req[0]) {
                case "push":
                    push(Integer.parseInt(req[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "top":
                    top();
                    break;
                case "clear":
                    clear();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
    }

    public static void push(int x) {
        arr[++size] = x;
    }

    public static void pop() {
        if (size != -1) System.out.println(arr[size--]);
        else System.out.println(-1);

    }

    public static void top() {
        if (size == -1) System.out.println(-1);
        else System.out.println(arr[size]);
    }

    public static void clear() {
        size = -1;
    }

    public static void size() {
        System.out.println(size + 1);
    }

    public static void empty() {
        if (size == -1) System.out.println(1);
        else System.out.println(0);
    }
}
