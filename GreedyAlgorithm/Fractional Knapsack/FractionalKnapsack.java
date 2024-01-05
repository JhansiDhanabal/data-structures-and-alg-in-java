package greedyalgorithm;

import java.util.*;

public class FractionalKnapsack {
	public static void main(String args[]) {
		int value[] = {100, 60, 120};
		int weight[] = {20, 10, 30};
		ArrayList<knapsack>itemlist = new ArrayList<>();
		for(int i=0;i<weight.length;i++) {
			itemlist.add(new knapsack(i, weight[i], value[i]));
		}
		fractionalknapsack(itemlist, 50);
	}
	public static void fractionalknapsack(ArrayList<knapsack>itemlist, int bagweight) {
		Comparator<knapsack>fractionsort = new Comparator<>() {
			@Override
			public int compare(knapsack o1, knapsack o2) {
				if(o2.fraction>o1.fraction)
					return 1;
				return -1;
			}
		};
		Collections.sort(itemlist, fractionsort);
		int currentweight = 0;
		int currentvalue = 0;
		for(int i=0; i<itemlist.size();i++) {
			knapsack item = itemlist.get(i);
			if(currentweight + item.weight<=bagweight) {
				currentweight += item.weight;
				currentvalue += item.value;
				System.out.println(item.index+" "+currentvalue);
			}
			else {
				currentvalue += item.fraction*(bagweight-currentweight);
				System.out.println(item.index+" "+currentvalue);
				currentweight = bagweight;
			}
			if(currentweight == bagweight){
				break;
			}
		}
		System.out.println(currentvalue);
	}
}
