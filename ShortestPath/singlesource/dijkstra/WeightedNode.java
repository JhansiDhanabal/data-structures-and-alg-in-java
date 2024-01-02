package graph;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode>{
	public String value;
	public int index;
	public int distance;
	public WeightedNode parent;
	public boolean visit = false;
	public ArrayList<WeightedNode> neighbours = new ArrayList<>();
	public HashMap<WeightedNode, Integer> map = new HashMap<>();
	public WeightedNode(String value, int index){
		this.value = value;
		distance = Integer.MAX_VALUE;
		this.index = index;
	}
	public String toString() {
		return value;
	}
	public int compareTo(WeightedNode o) {
		// TODO Auto-generated method stub
		return this.distance-o.distance;
	}
	
}
