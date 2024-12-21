import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = 0;
        for(int i = 0; i < 3; i++){
            a += in.nextLong();
        }
        System.out.println(a);
    }
}
