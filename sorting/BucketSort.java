package sorting;

import java.util.*;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,8,5,3,2,9,6,7,3,7,8,3,5,1,6,4};
		System.out.println("Orginal array : ");
		printarray(arr);
		bucketsort(arr);
	}
	public static void bucketsort(int arr[]) {
		int maxvalue = arr[0], index;
		for(int i=1;i<arr.length;i++) {
			if(maxvalue<arr[i])
				maxvalue = arr[i];
		}
		int number_of_bucket =(int) Math.round(Math.sqrt((double)arr.length));
		ArrayList<Integer>[] bucket= new ArrayList[number_of_bucket];
		for(int i=0;i<bucket.length;i++) {
			bucket[i] = new ArrayList<>();
		}
		for(int element:arr) {
			index = (int)Math.ceil((double)element*number_of_bucket/(double)maxvalue);
			bucket[index-1].add(element);
		}
		for(ArrayList<Integer>element : bucket) {
			Collections.sort(element);
		}
		index = 0;
		for(int i=0;i<bucket.length;i++) {
			for(int j=0;j<bucket[i].size();j++) {
				arr[index++]=bucket[i].get(j);
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
	
}
