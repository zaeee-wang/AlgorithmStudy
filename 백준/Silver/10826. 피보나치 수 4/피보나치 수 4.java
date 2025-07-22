import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(fib(n) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static BigInteger fib(int n){
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ONE;
        for(int i = 0; i < n; i++){
            BigInteger z = x.add(y);
            x = y;
            y = z;
        }
        return x;
    }
}