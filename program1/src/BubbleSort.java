import java.util.Scanner;
public class BubbleSort {
	public static int[] array() {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}



// # Bubble sort

	public static void Bubblesort(int a[]) { 
		int temp=0;
		  for(int i=0;i<a.length-1;i++) {
			  int flag = 0;
			  for(int j=0;j<a.length-1-i;j++) {
				  if(a[j]>a[j+1]) {
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
					  flag=1;
					  }
			  	}
			  if(flag==0){
				  break;
			  }
		  }
		  for(int c=0;c<a.length;c++) {
			  System.out.print(a[c]+" ");
		  }
	}

	public static void main(String args[]) {
		int e[]= array();
		Bubblesort(e);
		
		
	}

}
