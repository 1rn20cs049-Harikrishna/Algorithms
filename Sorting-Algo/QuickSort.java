import java.util.Random;
import java.util.Scanner;

public class QuickSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			int i;
			System.out.print("Enter the number of elements ");
			int n=sc.nextInt();
			int a[]=new int[n];
			Random r=new Random();
			while(true)
			{
				System.out.print("1.Best case\t2.worst case\n");
				System.out.print("Enter your choice\n");
				int ch=sc.nextInt();
				
				switch(ch)
				{ 
					case 1: for(i=0;i<n;i++)
							a[i] = r.nextInt();
							break;
					
					case 2:for(i=0;i<n;i++)
								a[i] = n-i;
							break;
					case 3: return;
					default:System.out.println("enter valid choice\n");
					
				}
				long start=System.nanoTime();
				quick(a,0,n-1);
				long stop=System.nanoTime();
				System.out.println("Time to run:"+(stop-start));
				sc.close();
			}
		}
	}

	private static void quick(int[] a, int low, int high) 
	{
		int k;
		if(low<high) {		
			k=partion(a,low,high);
			quick(a,low,k-1);
			quick(a,k+1,high);	
		}
	}

	private static int partion(int[] a, int low, int high) {
		int key=a[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while(i<high && a[i]<=key)
				i++;
			while(j>low && a[j]>key)
				j--;
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		a[low]=a[j];
		a[j]=key;
		return j;
	}
	
}

