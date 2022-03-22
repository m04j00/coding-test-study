import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean plug = false;
        String op = "";
        int bNum = scanner.nextInt();
        do {
            if (plug) {
                int num = scanner.nextInt();
                if (op.equals("+")) bNum += num;
                else if (op.equals("-")) bNum -= num;
                else if (op.equals("*")) bNum *= num;
                else if (op.equals("/")) bNum /= num;
            } else op = scanner.next();
            plug = !plug;
        } while (!op.equals("="));
        System.out.println(bNum);
    }
}
