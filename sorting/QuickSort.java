package coding;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,23,78,36,25,89,46};
		sort(arr);
	}
	public static int partition(int []arr, int start,int end) {
		int pivot = end;
		int i = start-1;
		for(int j=start;j<=end;j++) {
			if(arr[j]<=arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}
	public static void quicksort(int arr[],int start,int end) {
		if(start<end) {
			int pivot = partition(arr,start,end);
			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}
	}
	public static void sort(int arr[]) {
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
