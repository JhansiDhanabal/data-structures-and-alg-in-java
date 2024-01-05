package graph;

import java.util.ArrayList;

public class PrimsImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WeightedNode> nodelist = new ArrayList<>();
		nodelist.add(new WeightedNode("A",0));
		nodelist.add(new WeightedNode("B",1));
		nodelist.add(new WeightedNode("C",2));
		nodelist.add(new WeightedNode("D",3));
		nodelist.add(new WeightedNode("E",4));
		
		PrimsAlgorithm prims = new PrimsAlgorithm(nodelist);
		prims.addedge(0, 1, 10);
		prims.addedge(0, 2, 20);
		prims.addedge(1, 2, 30);
		prims.addedge(1, 3, 5);
		prims.addedge(2, 3, 15);
		prims.addedge(3, 4, 8);
		prims.addedge(4, 2, 6);
		
		prims.Prims_Minimum_Spanning(nodelist.get(2));

	}

}
