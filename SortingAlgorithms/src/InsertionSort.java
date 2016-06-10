import java.util.Scanner;

public class InsertionSort {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. elements of the array:\n");
		int n =  sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array:\n ");
		for (int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int key;
		
		for(int i=1;i<n;i++)
		{
			key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j = j-1;
			}
			
			a[j+1] = key;
		}
		
		System.out.println("Sorted array:\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}