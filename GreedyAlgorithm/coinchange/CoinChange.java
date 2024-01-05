package greedyalgorithm;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {1,2,5,10,20,1000,100,50,500};
		coinchange(coins, 2156);
	}
	public static void coinchange(int coin[],int amt) {
		Arrays.sort(coin);
		int index = coin.length-1;
		while(amt > 0) {
			if(coin[index]<=amt) {
				System.out.println(coin[index]+" ");
				amt -= coin[index];
			}
			else {
				index--;
			}
		}
	}

}
