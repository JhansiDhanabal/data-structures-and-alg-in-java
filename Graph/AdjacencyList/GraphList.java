package graph;

import java.util.ArrayList;

public class GraphList {
	ArrayList<GraphNode>nodelist;
	int adjacency_matrix[][];
	GraphList(ArrayList<GraphNode>nodelist){
		this.nodelist = nodelist;
		adjacency_matrix = new int[nodelist.size()][nodelist.size()];
	}
	public void undirected(int i,int j) {
		GraphNode first = nodelist.get(i);
		GraphNode second = nodelist.get(j);
		first.neighbours.add(second);
		second.neighbours.add(first);
	}
	public void directed(int i,int j) {
		GraphNode first = nodelist.get(i);
		GraphNode second = nodelist.get(j);
		first.neighbours.add(second);
	}
	public void display_matrix() {
		for(int i=0;i<adjacency_matrix.length;i++) {
			System.out.print(nodelist.get(i).value);
			for(GraphNode gn:nodelist.get(i).neighbours) {
				System.out.print("->"+gn.value);
			}
			System.out.println();
		}
	}
}
