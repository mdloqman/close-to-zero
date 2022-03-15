import java.util.Arrays;
import java.util.Scanner;

class Closetozero{
	
	static void closetoze(int arr[], int size)
	{
		Arrays.sort(arr);
		
	
	
	
	}
	
	
	public static void main(String[] args) {
		int size;
		Scanner scan = new Scanner(System.in);
		//size of array
		size = scan.nextInt();
		int arr[] =new int[size];
		for(int i = 0; i<size-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		closetoze(arr, size);
		scan.close();
	}
}