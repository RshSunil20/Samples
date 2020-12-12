package mycode;

public class InsertionSort {
	
	public static void insertions(int arr[])
	{
		int len = arr.length;
		
		for (int j=1; j<len;j++)
		{
			int key = arr[j];
			int i = j-1;
			
			while ((i>=0)&&(arr[i]>key)){
			arr[i+1] = arr[i];
			i--;
			}
			arr [i+1] = key;
		}
		
	}

	
	public static void main(String[] args) {
		int[] arr1 = {9,4,2,6,22,11,66,5};
		
		for(int i:arr1)
		System.out.println("Array before sort: " +i);
		
		System.out.println("\n Array after sort: ");
		insertions(arr1);
		
		for(int i:arr1)
		System.out.println("Array before sort: " +i);
			
	}
	
	
}
