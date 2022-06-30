import java.util.Scanner;

public class SelectionSort {
	public static int[] array() {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}

	
	public static void SelectionSort(int a[]) {
		int min;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int c=0;c<a.length;c++) {
			System.out.print(a[c]+" ");
		}
	}
	
	public static void main(String args[]) {
		int e[]= array();
		SelectionSort(e);
			
			
		}

}
