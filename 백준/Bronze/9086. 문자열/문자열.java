import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            String str = in.next();
            if(str.length()!=0)System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}
