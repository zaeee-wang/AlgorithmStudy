import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] student = new int[31];

        for(int i=1; i<29; i++) {
			int success = in.nextInt();
			student[success] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
    }
}
