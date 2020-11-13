
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 9, 3, 15, 6, 2, 1};
		
		System.out.println("The original array is: ");
		
		for(int i = 0; i< a.length; i++)
		{
			System.out.println(" "+a[i]);
		}
		
		sort(a, a.length);
		
		System.out.println("Sorted array is: ");
		
		for(int i = 0; i< a.length; i++)
		{
			System.out.println(" "+a[i]);
		}

	}
	
	public static void sort(int a[], int size)
	{
		int j;
		for(int i = 1; i<size; i++)
		{
			int key = a[i];
			j = i-1;
			
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				--j;
			}
			a[j+1] = key;
		}
	}

}
