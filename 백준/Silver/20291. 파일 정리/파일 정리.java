import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> results = new TreeMap<>();

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String str = br.readLine();
            int last = str.lastIndexOf('.');
            String extension = str.substring(last + 1);
            results.put(extension, results.getOrDefault(extension, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : results.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
