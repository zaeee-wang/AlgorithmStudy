import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean IsPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        for (int i = 0; i < reverse.length(); i++) {
            if(s.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(IsPalindrome(str));
    }
}
