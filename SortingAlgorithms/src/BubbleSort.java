import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no. of elements in an array:\n");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array:\n");
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array:\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
 