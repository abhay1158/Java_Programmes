import java.util.Scanner;
public class Sum_Product {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  int N = s.nextInt();
		  int C = s.nextInt();
		  int i = 1;
		  int sum = 0;
		  int mul = 1;
		  if(C==1) {
			  while(i<=N) {
				  sum=sum+i;
				  i++;
				  }System.out.print(sum);				  
			
		  
		  if(C==2) {
			while(i<=N) {
				mul=mul*i;
				i++;
				}System.out.print(mul);
		  }
	}
		  else {
				System.out.print(-1);
			  }
		  
		  
	}

}
