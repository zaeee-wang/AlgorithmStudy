import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            if (n <= 1) {
                sb.append(n).append("\n");
                continue;
            }

            int i = 0;
            while (i + 1 < n && A[i] <= A[i+1]) {
                i++;
            }
            
            if (i == n - 1) {
                sb.append(1).append("\n");
                continue;
            }

            int length = 1;
            
            while (i < n - 1) {
                int start_i = i;
                while (i + 1 < n && A[i] >= A[i+1]) {
                    i++;
                }

                if (i > start_i) {
                    length++;
                }

                start_i = i;
                while (i + 1 < n && A[i] <= A[i+1]) {
                    i++;
                }

                if (i > start_i) {
                    length++;
                }
                
                if(i == start_i) {
                    break;
                }
            }
            sb.append(length).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
