import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sounds = new int[4];
        
        for (int i = 0; i < 4; i++) {
            sounds[i] = scanner.nextInt();
            if(sounds[i] < 0) {
                System.out.println("No Fish");
                return;
            }
        }
        
        int plug = 0;
        if (sounds[0] < sounds[1]) plug = 1;
        else if (sounds[0] > sounds[1]) plug = 2;
        else plug = 3;
        
        for (int i = 1; i < 3; i++) {
            if (plug == 1) {
                if (sounds[i] >= sounds[i + 1]) plug = 0;
            } else if (plug == 2) {
                if (sounds[i] <= sounds[i + 1]) plug = 0;
            } else {
                if (sounds[i] != sounds[i + 1]) plug = 0;
            }
            if (plug == 0) {
                System.out.println("No Fish");
                return;
            }
        }
        
        if (plug == 1) {
            System.out.println("Fish Rising");
        } else if (plug == 2) {
            System.out.println("Fish Diving");
        } else {
            System.out.println("Fish At Constant Depth");
        }
    }
}
