import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[4];
        for(int i = 0; i < n; i++){
            int money = in.nextInt();
            arr[0] = (int) Math.ceil(money / 25);
            arr[1] = (int) Math.ceil((money - 25*arr[0]) / 10);  
            arr[2] = (int) Math.ceil((money - 10*arr[1] -25*arr[0]) / 5); 
            arr[3] = (int) Math.ceil((money - 5*arr[2] - 10*arr[1] - 25*arr[0] ) / 1);
            for(int a : arr)System.out.print(a + " ");
            System.out.println();
        }
    }
}
