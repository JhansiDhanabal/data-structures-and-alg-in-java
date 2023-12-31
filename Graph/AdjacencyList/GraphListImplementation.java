package graph;

import java.util.ArrayList;

/*
        A - B - F
        | \	/   |
        C- D  - E
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
		
		GraphList graph = new GraphList(nodelist);
		graph.undirected(0, 1);
		graph.undirected(0, 2);
		graph.undirected(0, 3);
		graph.undirected(1, 5);
		graph.undirected(1, 3);
		graph.undirected(2, 3);
		graph.undirected(4, 5);
		graph.undirected(4, 3);
		
		graph.display_matrix();
	}

}
