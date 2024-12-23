import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {0,0,0,0,0,0};
        for(int i = 0; i < 6; i++){
            arr[i]=in.nextInt();
            switch (i) {
                case 0, 1:
                    arr[i] = 1 - arr[i];
                    break;
                case 2, 3, 4:
                    arr[i] = 2 - arr[i];
                    break;
                case 5:
                    arr[i] = 8 - arr[i];
                default:
                    break;
            }
        }
        for(int a : arr)System.out.print(a+" ");
    }
}
