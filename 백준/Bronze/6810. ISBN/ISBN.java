import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] num3 = new int[3];
        for (int i = 0; i < 3; i++) {
            num3[i] = scanner.nextInt();
        }
        
        String[] num10 = "9780921418".split("");

        // true : 1, false : 3
        boolean plug13 = true;
        int sum = 0;
        for (String n : num10) {
            int num = Integer.parseInt(n);
            if (plug13) sum += num;
            else sum += num * 3;
            plug13 = !plug13;
        }

        plug13 = true;
        for (int num : num3) {
            if (plug13) sum += num;
            else sum += num * 3;
            plug13 = !plug13;
        }
        
        System.out.println("The 1-3-sum is " + sum);
    }
}
