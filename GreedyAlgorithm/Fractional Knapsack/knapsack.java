package greedyalgorithm;

public class knapsack {
	int weight;
	int value;
	double fraction;
	int index;
	knapsack(int index, int weight, int value){
		this.index = index;
		this.weight = weight;
		this.value = value;
		fraction = value*1.0/weight;
	}
}
