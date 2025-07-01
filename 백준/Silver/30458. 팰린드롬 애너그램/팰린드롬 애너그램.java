import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine(); 

        int[] charCounts = new int[26];

        int L = N / 2; 

        for (int i = 0; i < L; i++) {
            char leftChar = S.charAt(i);
            charCounts[leftChar - 'a']++;

            char rightChar = S.charAt(N - 1 - i);
            charCounts[rightChar - 'a']++;
        }

        boolean possible = true;
        for (int count : charCounts) {
            if (count % 2 != 0) { 
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }
}