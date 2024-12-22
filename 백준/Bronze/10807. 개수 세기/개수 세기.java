import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short n = in.nextShort();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        int v = in.nextInt();
        int frequency = Collections.frequency(list, v);
        System.out.println(frequency);
    }
}
