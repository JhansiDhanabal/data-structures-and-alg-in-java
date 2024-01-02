package graph;

import java.util.ArrayList;

/*      0    1    2    3
        A -> B -> C -> D
		|	 ^
		V	 |
		E	 F <- G
		4	 5 	  6
 */
public class GraphListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNode> nodelist = new ArrayList<>();
		nodelist.add(new GraphNode("A",0));
		nodelist.add(new GraphNode("B",1));
		nodelist.add(new GraphNode("C",2));
		nodelist.add(new GraphNode("D",3));
		nodelist.add(new GraphNode("E",4));
		nodelist.add(new GraphNode("F",5));
		nodelist.add(new GraphNode("G",6));
		
		GraphList graph = new GraphList(nodelist);
		graph.directed(0, 1);
		graph.directed(1, 2);
		graph.directed(2, 3);
		graph.directed(0, 4);
		graph.directed(5, 1);
		graph.directed(6, 5);
		
		graph.display_matrix();
		
		graph.topological_sort();
		
	}

}
