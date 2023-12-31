package sorting;

public class MergeSortImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,8,5,3,2,9,7};
		MergeSort sort = new MergeSort(arr);
		System.out.println("Original Array :");
		sort.printarray(arr);
		sort.mergesort(arr);
		System.out.println("Sorted Array :");
		sort.printarray(arr);
	}

}
