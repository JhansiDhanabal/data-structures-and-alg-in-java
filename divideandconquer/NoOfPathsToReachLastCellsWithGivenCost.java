package divideandconquer;

public class NoOfPathsToReachLastCellsWithGivenCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{4,7,1,6},{5,7,3,9},{3,2,1,2},{7,1,6,3}};
		System.out.println(number_paths(arr, arr.length-1, arr[0].length-1, 25));

	}
	public static int number_paths(int arr[][],int row, int col, int cost) {
		if(row<0 || col<0)
			return 0;
		if(row == 0 && col == 0) {
			if(arr[row][col]-cost == 0)
				return 1;
			return 0;
		}
		if(row == 0) 
			return number_paths(arr, row, col-1, cost-arr[row][col]);
		if(col == 0)
			return number_paths(arr, row-1, col, cost-arr[row][col]);
		int right = number_paths(arr, row-1, col, cost-arr[row][col]);
		int down = number_paths(arr, row, col-1, cost-arr[row][col]);
		return right+down;
	}
}
