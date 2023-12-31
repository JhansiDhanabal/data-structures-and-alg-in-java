package graph;

import java.util.*;

public class GraphMatrix {
	ArrayList<GraphNode>nodelist;
	int adjacency_matrix[][];
	GraphMatrix(ArrayList<GraphNode>nodelist){
		this.nodelist = nodelist;
		adjacency_matrix = new int[nodelist.size()][nodelist.size()];
	}
	public void undirected(int i,int j) {
		adjacency_matrix[i][j] = 1;
		adjacency_matrix[j][i] = 1;
	}
	public void directed(int i,int j) {
		adjacency_matrix[i][j] = 1;
	}
	public void display_matrix() {
		System.out.print("  ");
		for(GraphNode gn:nodelist) {
			System.out.print(gn.value+" ");
		}
		System.out.println();
		for(int i=0;i<adjacency_matrix.length;i++) {
			System.out.print(nodelist.get(i).value+" ");
			for(int j=0;j<adjacency_matrix.length;j++) {
				System.out.print(adjacency_matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
