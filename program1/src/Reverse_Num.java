import java.util.Scanner;
public class Reverse_Num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int digit = 0;
		
		while(N>0) {
			digit = digit*10 + N%10;
			N=N/10;				
			}			
		System.out.print(digit);
	}

}
