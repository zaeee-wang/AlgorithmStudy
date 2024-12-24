import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[][] c_arr = new char[5][15];
		int i,j;
		int max = 0;
		
		for(i=0;i<5;i++) {
			String str = in.next();
			
			if(str.length()>max) 
				max = str.length();
			
			for(j=0;j<str.length();j++) {
				c_arr[i][j] = str.charAt(j);
			}
		}
		for(i=0;i<max;i++) {
			for(j=0;j<5;j++) {
				if(c_arr[j][i] == '\0')
					continue;
				System.out.print(c_arr[j][i]);
			}
		}
	}
}
