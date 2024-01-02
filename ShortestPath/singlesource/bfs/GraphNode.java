package graph;

import java.util.ArrayList;

public class GraphNode {
	String value;
	int index;
	boolean visit = false;
	GraphNode parent = null;
	ArrayList<GraphNode>neighbours = new ArrayList<>();
	GraphNode(String value, int index){
		this.value = value;
		this.index = index;
	}
}
