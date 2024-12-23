import java.util.Scanner;

public class Main {
    public static void main(String[] args) {         
        Scanner in = new Scanner(System.in);
        String str = in.next();        
        // 문자열 reverse        
        StringBuffer sb = new StringBuffer(str);        
        String reverse = sb.reverse().toString();         
        if(str.equals(reverse))System.out.println(1);
        else System.out.println(0);
        }
}
