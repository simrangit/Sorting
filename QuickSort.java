
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 7, 8, 9, 1, 5};
		
		int n = a.length;
		
		sort(a, 0,n-1);
		
		// printing array
		for(int i = 0; i < n; i++)
			System.out.println(" "+a[i]);

	}
	
	public static void sort(int[] a, int low, int high)
	{
		int pi;
		
		if(low < high)
		{
			pi = partition( a, low, high);
		
			sort( a, low, pi-1); // recursively sort left and right half of the array
			sort( a, pi+1, high);
		}
		
	}
	
	public static int partition(int[] a, int low, int high)
	{
		int pivot = a[high];
		int i = low-1; // initializing index
		
		int temp; // to be used for swap
		
		for(int j = low; j < high; j++) // if current element is smaller than pivot, then swap a[j] and a[i]
		{
			if(a[j] < pivot)
			{
				// increment index position swap index element with the current element
				
				i++;
				
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
			
		}
			// swap arr[i+1] and arr[high] (or pivot)
			
			temp = a[i+1];
			a[i+1] = a[high];
			a[high] = temp;
		
		return i+1; // returning index because this is the partition index, where pivot element is placed and parted.s
	}

}
