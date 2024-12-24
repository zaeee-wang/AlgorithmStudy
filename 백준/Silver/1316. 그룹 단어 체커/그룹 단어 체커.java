import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int cnt = 0;
        for (int i=0;i<n;i++){
            if (check() == true) cnt++;
        }
        System.out.println(cnt);
    }
    public static boolean check(){
        boolean[] arr = new boolean[26];
        int prev = 0;
        String str = in.next();
        for(int i = 0; i < str.length(); i++){
            int cur = str.charAt(i);
            if(prev!=cur){
                if(arr[cur-'a']==false){
                    arr[cur-'a'] = true;
                    prev = cur;
                }
                else return false;
            }else continue;
        }
        return true;
    }
}
