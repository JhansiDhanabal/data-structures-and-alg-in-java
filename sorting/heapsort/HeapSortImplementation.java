package sorting;

import java.util.Arrays;

public class HeapSortImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,8,5,3,2,9,7,8,4,6,67,3,45,21,12,7,9};
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		HeapSort sort = new HeapSort(arr.length);
		for(int val : arr) {
			sort.insert(val, "Min");
		}
		sort.heapsort();
		System.out.println("Sorted Array :");
		sort.printarray();
	}

}
