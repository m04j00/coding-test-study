package bronze.b2;

import java.util.Scanner;

public class no10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();

        int[] alp = new int[26];
        for(int i = 0; i < 26; i++){
            alp[i] = -1;
        }

        for(int i = 0; i < sen.length(); i++){
            int s = sen.charAt(i) - 97;
            if(alp[s] == -1) alp[s] = i;
        }
        for(int i : alp){
            System.out.print(i + " ");
        }
    }
}