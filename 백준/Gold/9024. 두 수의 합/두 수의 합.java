import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;
            int minDiff = Integer.MAX_VALUE;
            int count = 0; 

            while (left < right) {
                int currentSum = arr[left] + arr[right];
                int currentDiff = Math.abs(currentSum - K);

                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    count = 1;
                } else if (currentDiff == minDiff) {
                    count++; 
                }

                if (currentSum < K) {
                    left++;
                } else if (currentSum > K) {
                    right--;
                } else { 
                    left++;
                    right--;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}