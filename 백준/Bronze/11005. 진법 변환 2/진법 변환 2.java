import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[36];
        if(N == 0){
            sb.append(0);
        }
        for (int i= 0; i< 10; i++){
            arr[i] = (Character.forDigit(i,10));
        }
        for (int i = 10; i <= 35; i++) {
            arr[i] = (char)('A'+(i-10));
        }

        while(N != 0){
            sb.append(arr[N % B]);
            N/=B;
        }
        System.out.println(sb.reverse());
    }
}