import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        s += c;

        while(s >= 60){
            s -= 60;
            m++;
            if(m >= 60){
                m -= 60;
                h++;
            }
        }
        while(h >= 24){
            h -= 24;
        }
        System.out.println(h + " " + m + " " + s);
    }
}
