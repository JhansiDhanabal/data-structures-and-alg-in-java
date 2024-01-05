package divideandconquer;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,7,1,30,8,2,4};
		System.out.println(houserobber(arr, 0));
		
	}
	public static int houserobber(int arr[],int index) {
		if(index >= arr.length)
			return 0;
		int amt1 = arr[index]+houserobber(arr, index+2);
		int amt2 = houserobber(arr, index+1);
		return Math.max(amt1, amt2);
	}
}
