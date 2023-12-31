package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,3,7,2,9,97,5,85,83,1,67,32,9};
		System.out.println("Orginal array : ");
		printarray(arr);
		selectionsort_ascending(arr);
		selectionsort_descending(arr);
	}
	public static void selectionsort_ascending(int arr[]) {
		int n = arr.length, temp, pos;
		for(int i=0;i<n-1;i++) {
			pos = i; 
			for(int j=i+1;j<n;j++) {
				if(arr[pos]>arr[j]) {
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
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
	public static void selectionsort_descending(int arr[]) {
		int n = arr.length, temp, pos;
		for(int i=0;i<n-1;i++) {
			pos = i; 
			for(int j=i+1;j<n;j++) {
				if(arr[pos]<arr[j]) {
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		System.out.println("Descending Sorted array : ");
		printarray(arr);
	}
}
