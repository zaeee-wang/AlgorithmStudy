import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        Set<Integer> twoSums = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) { 
                twoSums.add(arr[i] + arr[j]);
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                int target_ab = arr[i] - arr[j];

                if (twoSums.contains(target_ab)) {
                    System.out.println(arr[i]);
                    br.close();
                    return;
                }
            }
        }
        br.close();
    }
}