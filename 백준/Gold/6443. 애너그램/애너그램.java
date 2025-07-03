import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] alphabetCounts;
    private static char[] currentAnagram;
    private static int originalLength;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
             if (str == null) {
                System.err.println("예상치 못한 입력 종료. " + (i + 1) + "번째 문자열을 읽을 수 없습니다.");
                break;
            }
            
            if (str.isEmpty()) {
                sb.append("").append('\n'); 
                continue;
            }

            originalLength = str.length();

            alphabetCounts = new int[26];

            for (char c : str.toCharArray()) {
                alphabetCounts[c - 'a']++;
            }

            currentAnagram = new char[originalLength];
            generateAnagrams(0);
        }

        System.out.print(sb.toString());
        br.close();
    }

    private static void generateAnagrams(int depth) {
        if (depth == originalLength) {
            sb.append(new String(currentAnagram)).append('\n');
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabetCounts[i] > 0) {

                alphabetCounts[i]--;
                currentAnagram[depth] = (char)('a' + i); 

                generateAnagrams(depth + 1);

                alphabetCounts[i]++;
            }
        }
    }
}