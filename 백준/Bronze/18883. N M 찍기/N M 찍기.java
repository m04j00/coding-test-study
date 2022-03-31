import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        br.close();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = 1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++, k++) {
                stringBuilder.append(k);
                if (j != m - 1) stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
