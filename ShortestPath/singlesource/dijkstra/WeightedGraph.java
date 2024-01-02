package graph;

import java.util.*;

public class WeightedGraph {
	ArrayList<WeightedNode> nodelist;
	WeightedGraph(ArrayList<WeightedNode>nodelist){
		this.nodelist = nodelist;
	}
	public void addedge(int start, int end, int cost) {
		WeightedNode s = nodelist.get(start);
		WeightedNode e = nodelist.get(end);
		s.neighbours.add(e);
		s.map.put(e, cost);
	}
	public void display() {
		for(WeightedNode w:nodelist) {
			System.out.print("\n"+w.value+"->");
			for(WeightedNode neighbour:w.neighbours) {
				System.out.print("["+neighbour.value+" "+w.map.get(neighbour)+"] ");
			}
		}
	}
	public void dijikstra(WeightedNode node) {
		PriorityQueue<WeightedNode> q = new PriorityQueue<>();
		node.distance = 0;
		q.addAll(nodelist);
		while(!q.isEmpty()) {
			WeightedNode next = q.remove();
			for(WeightedNode neighbour:next.neighbours) {
				if(q.contains(neighbour)) {
					if(neighbour.distance>next.distance+next.map.get(neighbour)) {
						neighbour.distance = next.distance+next.map.get(neighbour);
						neighbour.parent = next;
						q.remove(neighbour);
						q.add(neighbour);
					}
				}
			}
		}
		for(WeightedNode neighbour:nodelist) {
			System.out.print("\n"+neighbour.value+" -> ");
			print_path(neighbour);
			System.out.println(neighbour.distance);
		}
		
	}
	private void print_path(WeightedNode node) {
		if(node==null)
			return;
		print_path(node.parent);
		System.out.print(node.value+" ");
	}
}
