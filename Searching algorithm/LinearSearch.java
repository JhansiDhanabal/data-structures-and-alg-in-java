package coding;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,7,5,35,9,97,63};
		linearsearch(arr,7);
		linearsearch(arr,98);
	}
	public static void linearsearch(int arr[], int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}
}
