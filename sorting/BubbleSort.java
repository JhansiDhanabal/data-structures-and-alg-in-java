package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,3,7,2,97,5,85,83,1,67,32,9};
		System.out.println("Orginal array : ");
		printarray(arr);
		bubblesort_ascending(arr);
		bubblesort_descending(arr);
	}
	public static void bubblesort_ascending(int arr[]) {
		int n = arr.length, temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
	public static void bubblesort_descending(int arr[]) {
		int n = arr.length, temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Descending Sorted array : ");
		printarray(arr);
	}
}
