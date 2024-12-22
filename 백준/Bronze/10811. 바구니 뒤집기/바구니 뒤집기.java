import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] arr = new int[n+1];

        for(int i = 1; i<n+1; i++){
            arr[i] = i;
        }

        for(int i=0; i<m; i++){
            int a = in.nextInt(), b = in.nextInt();
            int temp = 0;
            while(a < b){
                temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;
            }
        }
        for(int i = 1; i<=n; i++)System.out.print(arr[i]+" ");
    }
}
