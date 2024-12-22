import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short n = in.nextShort();
        short m = in.nextShort();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }

        for(int i = 0; i < m; i++){
            short a = in.nextShort();
            short b = in.nextShort();
            short c = in.nextShort();
            for(; a < b; a++){
                arr[a-1] = c;
            }
            if(a==b)arr[a-1]=c;
        }
        for(int i = 0; i < n; i++)System.out.print(arr[i]+" ");
    }    
}
