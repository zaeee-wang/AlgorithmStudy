import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int val;
        Node prev, next;
        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        Node[] nodes = new Node[n + 1];
        Node head = new Node(1);
        nodes[1] = head;
        Node current = head;

        for (int i = 2; i <= n; i++) {
            Node newNode = new Node(i);
            nodes[i] = newNode;
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);
            int xVal = Integer.parseInt(st.nextToken());
            int yVal = Integer.parseInt(st.nextToken());

            Node nodeX = nodes[xVal];
            Node nodeY = nodes[yVal];

            if (nodeX.prev != null) nodeX.prev.next = nodeX.next;
            else head = nodeX.next;
            if (nodeX.next != null) nodeX.next.prev = nodeX.prev;

            if (command == 'A') {
                nodeX.prev = nodeY.prev;
                nodeX.next = nodeY;
                if (nodeY.prev != null) nodeY.prev.next = nodeX;
                else head = nodeX;
                nodeY.prev = nodeX;
            } else {
                nodeX.prev = nodeY;
                nodeX.next = nodeY.next;
                if (nodeY.next != null) nodeY.next.prev = nodeX;
                nodeY.next = nodeX;
            }
        }

        ArrayList<Integer> sequence = new ArrayList<>();
        current = head;
        while (current != null) {
            sequence.add(current.val);
            current = current.next;
        }

        ArrayList<Integer> tails = new ArrayList<>();
        int[] parent = new int[n + 1];
        
        for (int num : sequence) {
            int idx = Collections.binarySearch(tails, num);
            if (idx < 0) idx = -(idx + 1);

            if (idx == tails.size()) tails.add(num);
            else tails.set(idx, num);
            
            if (idx > 0) parent[num] = tails.get(idx - 1);
        }
        
        HashSet<Integer> lisSet = new HashSet<>();
        if (!tails.isEmpty()) {
            int last = tails.get(tails.size() - 1);
            while(last != 0) {
                lisSet.add(last);
                last = parent[last];
            }
        }
        
        List<Integer> toMove = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!lisSet.contains(i)) {
                toMove.add(i);
            }
        }

        System.out.println(toMove.size());
        
        StringBuilder sb = new StringBuilder();
        
        Collections.sort(toMove); 
        
        for (int num : toMove) {
            if(num == 1) { 
                 sb.append("A ").append(1).append(" ").append(head.val).append("\n");
            } else {
                sb.append("B ").append(num).append(" ").append(num - 1).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
