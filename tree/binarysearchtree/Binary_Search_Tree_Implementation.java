/*
  		   10
  		  /  \
  		6	  12
  	   / \    / \
  	  4   8  11	 18
 */
package binarytree;

public class Binary_Search_Tree_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_search_tree tree = new binary_search_tree();
		tree.insert(10);
		tree.insert(6);
		tree.insert(4);
		tree.insert(8);
		tree.insert(12);
		tree.insert(11);
		tree.insert(18);
		System.out.println("Postorder Traversal : ");
		tree.postorder(tree.root);
		System.out.println("\nPreorder Traversal : ");
		tree.preorder(tree.root);
		System.out.println("\nInorder Traversal : ");
		tree.inorder(tree.root);
		System.out.println("\n Levelorder Traversal : ");
		tree.levelorder();
		tree.search(tree.root, 8);
		tree.search(tree.root, 2);
		tree.delete(tree.root, 4);
		System.out.println("\nLevelorder Traversal : ");
		tree.levelorder();
		tree.delete(tree.root, 6);
		System.out.println("\nLevelorder Traversal : ");
		tree.levelorder();
		tree.delete(tree.root, 12);
		System.out.println("\nLevelorder Traversal : ");
		tree.levelorder();
	}

}
