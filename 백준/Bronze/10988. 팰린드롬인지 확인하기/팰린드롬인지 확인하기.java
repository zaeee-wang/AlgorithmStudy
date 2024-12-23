import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] word = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            word[i] = str.charAt(str.length()-i-1);
        }
        if(str.equals(String.valueOf(word)))System.out.println(1);
        else System.out.println(0);
    }
}
