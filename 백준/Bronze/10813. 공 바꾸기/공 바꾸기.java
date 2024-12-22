import java.util.*;
//import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= i+1;
        }
        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // System.out.println(list);
        for(int i=0; i<m; i++){
            int a = in.nextInt(), b = in.nextInt();
            int temp = 0;
            temp = arr[b-1];
            arr [b-1] = arr [a-1];
            arr[a-1] = temp;
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }    
}
