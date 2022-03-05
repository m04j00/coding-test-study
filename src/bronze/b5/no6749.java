package bronze.b5;

import java.util.Scanner;

public class no6749 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int youngestChild = scan.nextInt();
        int middleChild = scan.nextInt();

        System.out.println(middleChild + (middleChild - youngestChild));
    }
}
