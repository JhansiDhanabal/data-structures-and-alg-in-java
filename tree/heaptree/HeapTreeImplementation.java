package binarytree;

public class HeapTreeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapTree tree = new HeapTree(7);
		int arr[] = {5,3,2,6,1,7,8};
		for(int i=0;i<arr.length;i++) {
			tree.insert(arr[i], "Min");
		}
		System.out.print("Level Order Traversal : ");
		tree.levelorder();
		System.out.println(tree.peek());
		System.out.println(tree.size());
		tree.extract("Min");
		System.out.print("Level Order Traversal : ");
		tree.levelorder();
		System.out.println(tree.peek());
		System.out.println(tree.size());
		tree.extract("Min");
		System.out.print("Level Order Traversal : ");
		tree.levelorder();
	}

}
