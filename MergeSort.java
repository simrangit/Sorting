public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {9, 3, 15, 6, 2, 1};
		
		sort(a, 0, a.length-1);
		
		printArray(a);

	}
	
	public static void sort(int[] a, int l, int r)
	{
		try {
			if(l<r)
			{
				int mid = (l+r)/2;
			
				sort(a, l, mid);
				sort(a, mid+1, r);
			
				merge(a, l, mid, r);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is encountered "+e.getMessage());
		}
	}

	public static void merge(int[] a, int l, int mid, int r)
	{
		//find sizes of 2 sub-arrays to be merged
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		//create temp arrays of size n1 and n2
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//copy data to temp arrays
		for(int i = 0; i < n1; i++)
			L[i] = a[i+l];
		for(int j = 0; j < n2; j++)
			R[j] = a[mid+j+1];
		
		//indexes of 1st and 2nd array
		int i = 0, j = 0, k = l;
		
		while( i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			}
			else
			{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements of L[] if any.
		while(i<n1)
		{
			a[k] = L[i];
			i++;
			k++;
		}
		
		//copy remaining elements of R[] if any.
		while(j<n2)
		{
			a[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void printArray(int a[])
	{
		int n = a.length;
		
		for(int i = 0; i < n; i++)
			System.out.print("  "+a[i]);
	}
	
}
