import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		boolean isprime = true;
		for(int i = 2;i<N;i++) {
			//System.out.println(i);
			isprime = true;
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					isprime = false;
				}
				
				}if(isprime == true){
					System.out.println(i);
			}
		}
			 
			
	}
}