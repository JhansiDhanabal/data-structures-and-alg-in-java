package divideandconquer;

public class MinimumCostToReachCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{4,7,8,6,4},{6,7,3,9,2},{3,8,1,2,4},{7,1,7,3,7},{2,9,8,9,3}};
		System.out.println(reach(arr, arr.length-1, arr[0].length-1));

	}
	public static int reach(int arr[][], int row, int col) {
		if(row<0 || col<0)
			return Integer.MAX_VALUE;
		if(row == 0 && col==0) {
			return arr[row][col];
		}
		int right = reach(arr, row-1, col);
		int down = reach(arr, row, col-1);
		return arr[row][col]+Math.min(right, down);
	}
}
