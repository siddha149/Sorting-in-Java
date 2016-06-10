import java.util.Scanner;

public class SelectionSort {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements in an array:\n");
		int n = sc.nextInt();
		
		int[] a = new int [n];
		
		System.out.println("Enter the elements of the array:\n");
		
		int temp;
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int minindex, min;
		
		for(int i=0;i<n-1;i++)
		{
			minindex = i;
			min = a[i];
			
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min = a[j];
					minindex = j;
				}
			}
			
			temp = a[i];
			a[i]= min;
			a[minindex] = temp;
		}
		
		System.out.println("Sorted array:\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}