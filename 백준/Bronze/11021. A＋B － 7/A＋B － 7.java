import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short t = in.nextShort();
        for(int i = 0; i < t; i++){
            short a = in.nextShort();
            short b = in.nextShort();
            System.out.println(("Case #"+(i+1)+": " +(a+b)));
        }
    }   
}
