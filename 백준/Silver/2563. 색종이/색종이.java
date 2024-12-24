import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[][] arr = new boolean[101][101];
        int n = in.nextInt();
        int area = 0;
        for(int i = 0; i < n; i++){
            int x = in.nextInt(), y = in.nextInt();
            for(int j = x; j < x + 10; j++){
                for(int k = y; k< y + 10; k++){
                    if(!arr[j][k]){
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
