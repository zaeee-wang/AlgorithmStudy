import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean IsPalindrome(String a, String b) {
        String combined = a + b; // 두 문자열을 결합
        int len = combined.length();
        for (int i = 0; i < len / 2; i++) {
            if (combined.charAt(i) != combined.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
    
        for (int i = 0; i < t; i++) { // 각 테스트 케이스 반복
            List<String> list = new ArrayList<>(); // 각 테스트 케이스마다 리스트 초기화
            int k = Integer.parseInt(br.readLine()); // 단어 개수
            for (int j = 0; j < k; j++) {
                list.add(br.readLine());
            }
    
            boolean foundPalindrome = false; // 회문을 찾았는지 여부를 나타내는 플래그
    
            // 모든 단어 조합을 검사 (str1 + str2)
            for (int l = 0; l < k; l++) {
                for (int j = 0; j < k; j++) { // 모든 조합을 위해 j=0부터 시작
                    if (l == j) continue; // 같은 단어를 두 번 사용하는 경우는 스킵 (문제의 의도에 따라 다름)
    
                    String str1 = list.get(l);
                    String str2 = list.get(j);
    
                    if (IsPalindrome(str1, str2)) {
                        System.out.println(str1 + str2);
                        foundPalindrome = true; // 회문 찾음
                        break; // 내부 루프 탈출
                    }
                }
                if (foundPalindrome) {
                    break; // 외부 루프 탈출
                }
            }
    
            // 만약 어떤 회문도 찾지 못했다면 0 출력
            if (!foundPalindrome) {
                System.out.println(0);
            }
        }
        br.close(); // BufferedReader 닫기
    }
}