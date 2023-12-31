package coding;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 9, 23, 25, 36, 46, 78, 89};
		binarysearch(arr,45);
		binarysearch(arr,3);
	}
	public static void binarysearch(int arr[],int val) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid] == val) {
				System.out.println("Found");
				return;
			}
			else if(val < arr[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		System.out.println("Not Found");
	}
}
