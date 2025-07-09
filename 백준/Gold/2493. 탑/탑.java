import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class Tower {
        int height;
        int index;

        Tower(int height, int index) {
            this.height = height;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answer = new int[N]; 
        Deque<Tower> stack = new ArrayDeque<>(); 

        for (int i = 0; i < N; i++) {
            int currentHeight = Integer.parseInt(st.nextToken()); 
            int currentIndex = i + 1; 

            while (!stack.isEmpty() && stack.peek().height <= currentHeight) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek().index;
            }

            stack.push(new Tower(currentHeight, currentIndex));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(answer[i]);
            if (i < N - 1) { 
                sb.append(" ");
            }
        }
        bw.write(sb.toString());
        bw.newLine();
        bw.flush(); 
        br.close();
        bw.close();
    }
}