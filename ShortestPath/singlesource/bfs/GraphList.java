package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
	public void bfs() {
		System.out.print("\nBFS Path : ");
		for(GraphNode gn:nodelist) {
			if(!gn.visit) 
				breadth_first_search(gn);
		}
	}
	private void breadth_first_search(GraphNode node) {
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		q.add(node);
		node.visit = true;
		while(!q.isEmpty()) {
			GraphNode next = q.remove();
			System.out.print(next.value+" ");
			for(GraphNode neighbour:next.neighbours) {
				if(!neighbour.visit) {
					q.add(neighbour);
					neighbour.visit = true;
				}
			}
		}
	}
	public void dfs() {
		System.out.println("\nDFS path : ");
		for(GraphNode gn:nodelist) {
			if(!gn.visit) {
				depth_first_search(gn);
			}
		}
	}
	private void depth_first_search(GraphNode node) {
		System.out.print(node.value+" ");
		node.visit = true;
		for(GraphNode neighbour:node.neighbours) {
			if(!neighbour.visit) {
				depth_first_search(neighbour);
			}
		}
	}
	private void topological_visit(GraphNode node, Stack<GraphNode>stack) {
		ArrayList<GraphNode> neighbours = node.neighbours;
		
		for(GraphNode neighbour:neighbours) {
			if(!neighbour.visit) {
				topological_visit(neighbour,stack);
			}
		}
		node.visit = true;
		stack.push(node);
	}
	public void topological_sort() {
		Stack<GraphNode>stack = new Stack<>();
		for(GraphNode node:nodelist) {
			if(!node.visit)
				topological_visit(node, stack);
		}
		System.out.println("\nTopological Sort : ");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().value+" ");
		}
	}
	public void bfs_ssspf(GraphNode node) {
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		q.add(node);
		node.visit = true;
		while(!q.isEmpty()) {
			GraphNode next = q.remove();
			System.out.print("\n"+next.value+" -> ");
			print_path(next);
			for(GraphNode neighbour:next.neighbours) {
				if(!neighbour.visit) {
					q.add(neighbour);
					neighbour.parent = next;
					neighbour.visit = true;
				}
			}
		}
	}
	private void print_path(GraphNode node) {
		if(node==null)
			return;
		print_path(node.parent);
		System.out.print(node.value+" ");
	}
}
