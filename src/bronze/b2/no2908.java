package bronze.b2;

import java.util.Scanner;

public class no2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int intA = reserve(a);
        int intB = reserve(b);

        System.out.println(Math.max(intA, intB));
    }
    public static int reserve(String n){

        StringBuffer stringBuffer = new StringBuffer(n);
        String res = stringBuffer.reverse().toString();
        return Integer.parseInt(res);
    }
}
