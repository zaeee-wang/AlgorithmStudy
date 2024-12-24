import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = -1;
        int row = -1, col = -1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = in.nextInt();
                if(max<arr[i][j]){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(row+ " " + col);
    }
}
