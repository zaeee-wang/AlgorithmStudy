import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean IsPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            } else{
                if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                start++;
                end--;
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
