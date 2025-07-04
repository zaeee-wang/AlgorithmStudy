import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tt = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(tt.nextToken());
        int W = Integer.parseInt(tt.nextToken());
        int[] height = new int[W];
        int left = 0;
        int right = height.length - 1;
        int volume = 0;
        int leftMax = height[left];
        int rightMax = height[right];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < W; i++){ 
            height[i] = Integer.parseInt(st.nextToken());
        }

        while(left < right){
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            if(leftMax <= rightMax){
                volume += leftMax - height[left];
                left++;
            } else{
                volume += rightMax - height[right];
                right--;
            }
        }
        System.out.println(volume);
        br.close();
    }
}
