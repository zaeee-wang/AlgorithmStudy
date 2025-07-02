import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine()); 
            String arrStr = br.readLine(); 

            // 1. 배열 파싱 및 Deque 초기화
            Deque<String> deque = new ArrayDeque<>();
            // n > 0 일 때만 파싱 수행 (n=0일 경우 arrStr은 "[]"가 됨)
            if (n > 0) {
                // "[1,2,3]" -> "1,2,3"
                String[] nums = arrStr.substring(1, arrStr.length() - 1).split(",");
                for (String s : nums) {
                    deque.add(s);
                }
            }
            
            // 2. 명령어 처리
            boolean isReversed = false; // 배열이 뒤집힌 상태인지 확인하는 플래그
            boolean isError = false; // 에러 발생 여부 확인

            for (char command : p.toCharArray()) {
                if (command == 'R') {
                    // 실제로 뒤집지 않고 플래그 값만 변경 (O(1) 연산)
                    isReversed = !isReversed;
                } else { // command == 'D'
                    if (deque.isEmpty()) {
                        isError = true;
                        break; // 더 이상 처리할 필요 없으므로 반복 중단
                    }

                    if (isReversed) {
                        // 뒤집힌 상태에서는 마지막 원소를 제거
                        deque.pollLast();
                    } else {
                        // 정방향 상태에서는 첫 원소를 제거
                        deque.pollFirst();
                    }
                }
            }

            // 3. 결과 출력
            if (isError) {
                System.out.println("error");
            } else {
                // StringBuilder를 사용해 효율적으로 출력 문자열 생성
                StringBuilder sb = new StringBuilder();
                sb.append("[");

                while (!deque.isEmpty()) {
                    if (isReversed) {
                        // 뒤집힌 상태에서는 마지막 원소부터 출력
                        sb.append(deque.pollLast());
                    } else {
                        // 정방향 상태에서는 첫 원소부터 출력
                        sb.append(deque.pollFirst());
                    }
                    // 마지막 원소가 아니라면 콤마 추가
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}