import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long total = in.nextLong();
        short n = in.nextShort();
        long sum = 0;

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            short b = in.nextShort();
            sum += a * b;
        }

        if(sum == total) System.out.println("Yes");
        else System.out.println("No");

    }    
}
