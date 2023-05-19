import java.util.Scanner;
import java.util.Random;

public class Mergesort{
	
     public static void main(String[]args)
     {
    	int n,a[],i;
    	Scanner sd=new Scanner(System.in);
    	Random ran = new Random();    	
    	System.out.println("enter the number of elemenys in an array\n");
    	n = sd.nextInt();    	
     	a = new int[n];
      long start ,stop;		
		  System.out.print("1.Best case\t2.Average case\t3.worst case\n");
			System.out.print("Enter your choice\n");
			int ch=sd.nextInt();
			
			switch(ch)
			{ 
				case 1: System.out.print(" elements in ascending order\n");
					   	for(i=0;i<n;i++)
							a[i] =i;
				  		break;
						
				case 2: System.out.print(" elements in random manner\n");
					  	for(i=0;i<n;i++)
							a[i] = ran.nextInt();
					  	break;
						
						
				case 3: System.out.print(" elements in descending order\n");
					  	for(i=0;i<n;i++)
							a[i] = n-i;						
				   		break;				
			}
	
			start = System.nanoTime();
			MergeSort(a,0,n-1);
			stop = System.nanoTime();
			System.out.println("\n time taken to sort " + a.length + "elements = " + (stop - start));		
	   sd.close();
     }
    	

     
     
     public static void Merge(int a[],int low,int mid,int high)
     {
    	 int i =low;
    	 int  j=mid+1;
    	 int k=low;
    	 
    	 while(i<=mid && j<=high)
    	 {
    		 if(a[i] < a[j]) {
    			 a[k] = a[i];
    			 k++;
    			 i++;
    		 }    		 
    		 else {
    			 a[k++] = a[j++];
    		 }    		 
    		 while(i<=mid) {
    			 a[k++] = a[i++];
    		 }    		 
    		 while(j<=high) {
    			 a[k++] = a[j++];
    		 }
    	 }
   		
     }    
     
     public static void MergeSort(int a[],int low, int high)
     {
    	 if(low < high ) {    		
    	 int mid = (low + high)/2;     	 
    	 MergeSort(a,low,mid);
    	 MergeSort(a,mid+1,high);
    	 Merge(a,low,mid,high);	 
    	 
        }
     }
     
     
}

