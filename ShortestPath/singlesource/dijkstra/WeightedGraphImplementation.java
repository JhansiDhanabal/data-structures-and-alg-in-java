package graph;

import java.util.*;

public class WeightedGraphImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WeightedNode> nodelist = new ArrayList<>();
		nodelist.add(new WeightedNode("A",0));
		nodelist.add(new WeightedNode("B",1));
		nodelist.add(new WeightedNode("C",2));
		nodelist.add(new WeightedNode("D",3));
		nodelist.add(new WeightedNode("E",4));
		nodelist.add(new WeightedNode("F",5));
		nodelist.add(new WeightedNode("G",6));
		
		WeightedGraph graph = new WeightedGraph(nodelist);
		graph.addedge(0, 1, 2);
		graph.addedge(0, 2, 5);
		graph.addedge(1, 2, 6);
		graph.addedge(1, 3, 1);
		graph.addedge(1, 4, 3);
		graph.addedge(2, 5, 8);
		graph.addedge(3, 4, 4);
		graph.addedge(4, 6, 9);
		graph.addedge(5, 6, 7);
		
		graph.display();
		graph.dijikstra(nodelist.get(0));
	}

}
