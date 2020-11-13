
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 9, 3, 15, 6, 2, 1};
		
		sort(a);

		print(a);
	}
	
	public static void sort(int[] a)
	{
		int n = a.length;
		int temp;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < (n-1)-i; j++)
			{
				if(a[j] > a[j+1])
					// swap the variables
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void print(int a[])
	{
		int n = a.length;
		
		for(int i = 0; i < n; i++)
			System.out.print("  "+a[i]);
	}

}
