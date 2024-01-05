package divideandconquer;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[] = {3, 1, 2, 5};
		int value[] = {31, 26, 17, 72};
		System.out.println(knapsack(value, weight, 7, 0));

	}
	public static int knapsack(int value[], int weight[], int capacity, int index) {
		if(index>=value.length || capacity<=0 || index<0)
			return 0;
		int profit1 = 0;
		if(weight[index]<=capacity)
		{
			profit1 = value[index] + knapsack(value, weight, capacity-weight[index], index+1);
		}
		int profit2 = knapsack(value, weight, capacity, index+1);
		return Math.max(profit1, profit2);
	}
}
