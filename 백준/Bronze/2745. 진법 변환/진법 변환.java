import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String origin = in.next();
        int exp = in.nextInt(), flag = 1;
        long total = 0;
    
        for(int i = origin.length()-1; i >= 0; i--){
            char a = origin.charAt(i);
            if('A'<= a && a <= 'Z') total += (a - 'A' + 10) * flag;
            else total += (a - '0') * flag;
            flag *= exp;
        }
        System.out.println(total);
    }
}
