package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,3,7,2,9,97,5,85,83,1,67,32,9};
		System.out.println("Orginal array : ");
		printarray(arr);
		insertionsort_ascending(arr);
		insertionsort_descending(arr);
	}
	public static void insertionsort_ascending(int arr[]) {
		int n = arr.length, j, temp;
		for(int i=1;i<n;i++) {
			temp = arr[i];
			j = i;
			while(j>0 && arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		System.out.println("Ascending Sorted array : ");
		printarray(arr);
	}
	public static void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void insertionsort_descending(int arr[]) {
		int n = arr.length, j, temp;
		for(int i=1;i<n;i++) {
			temp = arr[i];
			j = i;
			while(j>0 && arr[j-1]<temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		System.out.println("Descending Sorted array : ");
		printarray(arr);
	}
}
