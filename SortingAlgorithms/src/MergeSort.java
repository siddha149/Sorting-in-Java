import java.util.Scanner;

public class MergeSort {
	
	public static void MSort (int[] a)
	{
		int n = a.length;
		
		if(n < 2)
			return;
		int l = n/2;
		int r = n-l;
		
		int[] left = new int [l];
		int[] right = new int [r];
		
		int i;
		for(i=0;i<l;i++)
		{
			left[i] = a[i];
		}
		
		for(i=l;i<n;i++)
		{
			right[i-l]=a[i];
		}
		
		MSort(left);
		MSort(right);
		Merge(a,left,right);
	}
	
	public static void Merge (int[] a, int[] left, int[] right)
	{
		int l = left.length;
		int r = right.length;
		
		int i = 0 , j= 0, k = 0;
		
		while (i<l && j<r)
		{
			if(left[i] <= right[j])
			{
				a[k++] = left[i++];
			}
			
			else
			{
				a[k++] = right[j++];
			}
		}
		
		while (i<l)
		{
			a[k++] = left[i++];
		}
		
		while (j<r)
		{
			a[k++] = right[j++];
		}
	}
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. elements of the array:\n");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array:\n");
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		MSort(a);
		
		System.out.println("Sorted array:\n");
		for (int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
