public void bellmanford(WeightedNode src) {
		src.distance = 0;
		for(int i=0;i<nodelist.size();i++) {
			for(WeightedNode node:nodelist) {
				for(WeightedNode neighbour:node.neighbours) {
					if(neighbour.distance > node.distance+node.map.get(neighbour)) {
						neighbour.distance = node.distance+node.map.get(neighbour);
						neighbour.parent = node;
						System.out.println(neighbour.value+" "+node.value);
					}
				}
			}
		}
		
		for(WeightedNode node:nodelist) {
			for(WeightedNode neighbour:node.neighbours) {
				if(neighbour.distance > node.distance+node.map.get(neighbour)) {
					System.out.println("Negative Cycle Found");
					System.out.println("Old value : "+neighbour.distance);
					System.out.println("New Value : "+node.distance+node.map.get(neighbour));
					return;
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
