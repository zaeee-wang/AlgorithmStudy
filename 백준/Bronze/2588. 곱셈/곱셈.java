import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short a = in.nextShort();
        short b = in.nextShort();
        int sum = 0;
        short flag=1;
        int[] arrVal=Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = arrVal.length -1; i>=0; i--){
            int val = a * arrVal[i];
            System.out.println(a * arrVal[i]);
            sum += val * flag;
            flag *= 10;
        }
        System.out.println(sum);
    }
}
