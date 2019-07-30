//Andre Barajas
//CECS 328
//Summer 2018
//This program will implement and test the quickSort algorithm and print an analysis. 
public class QuickSort 
{
	public static void main(String[] args)
	{
		int[] set0 = {3, 44, 54, 34, 21, 566, 2, 434, 15, 6, 23}; 
		 long timeAstart, timeAstop= 0;
		 
		 timeAstart=System.nanoTime();
		quickSort(set0, 0, 10);
		timeAstop= System.nanoTime();
		long aTime = timeAstop-timeAstart;
		System.out.println("time: " + aTime + " nanoSeconds.");
		
		
		
		for(int i= 0; i< 11; i++)
		{
			System.out.print(set0[i] + " ,");
		}
	}
	//quickSort takes parameters array 	A, int P and R
	//partition the list at some locus and then call quick sort on the left and right 
	//subsets. 
	public static void quickSort(int A[], int p, int r)
	{
		if (p < r)
		{
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}//End if
	}//end quickSort
	
	//Partition accepts paramters array A, int p and r 
	//which the array is handled by pointers to p and r. 
	public static int partition(int A[], int p, int r)
	{
		int x = A[r];
		int i = p-1; 
		for(int j =p;j <=r-1; j++)
		{
			if (A[j] <= x)
			{
				i += 1;
				int temp = A[i];
				A[i] = A[j];
				A[j]= temp;
			}//end if
		}//End for loop 
		int temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		return i+1; 
	}//end partition
}
