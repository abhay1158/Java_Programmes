import java.util.Scanner;
public class terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int v =0;
		for(int i=1; i<=x+v; i++) {
			//System.out.println(i);
			int a =i;
			int b=a*3+2;
			//System.out.println(b);
			if(b%4!=0) {
				System.out.println(b);
		}
			else {
			v++;
			}
		}
		

	}

}
