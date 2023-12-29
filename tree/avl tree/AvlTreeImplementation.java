package binarytree;

public class AvlTreeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvlTree tree = new AvlTree();
		int arr[] = {10,35,53,52,42,25,12,45,24,38,22};
		for(int i=0;i<arr.length;i++) {
			tree.insert(arr[i]);
		}
		System.out.println("levelorder traversal");
		tree.levelorder();
		tree.delete(24);
		System.out.println("\nlevelorder traversal");
		tree.levelorder();
		tree.insert(60);
		tree.insert(70);
		tree.insert(100);
		System.out.println("\nlevelorder traversal");
		tree.levelorder();
	}

}
