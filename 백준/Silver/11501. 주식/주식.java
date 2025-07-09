import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] prices = new long[N];

            for (int index = 0; index < N; index++) {
                prices[index] = (Long.parseLong(st.nextToken()));
            }

            long maxProfit = 0;
            long maxPrice = 0;

            for(int i = N - 1; i >= 0; i--){
                if(prices[i] > maxPrice){
                    maxPrice = prices[i];
                } else {
                    maxProfit += maxPrice - prices[i];
                }
            }
            bw.write((String.valueOf(maxProfit)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
