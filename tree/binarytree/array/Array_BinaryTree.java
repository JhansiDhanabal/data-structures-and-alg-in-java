/*
  		   n1
  		  /  \
  		n2	  n3
  	   /  \   / \
  	  n4  n5 n6	 n7
 */
package binarytree;

public class Array_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_tree_array tree = new binary_tree_array(7);
		tree.insert("N1");
		tree.insert("N2");
		tree.insert("N3");
		tree.insert("N4");
		tree.insert("N5");
		tree.insert("N6");
		tree.insert("N7");
		System.out.println("preorder : ");
		tree.preorder(1);
		System.out.println("\npostorder : ");
		tree.postorder(1);
		System.out.println("\ninorder : ");
		tree.inorder(1);
		System.out.println("\nlevelorder : ");
		tree.levelorder();
		System.out.println();
		tree.search("N9");
		tree.search("N4");
		System.out.println();
		tree.delete("N4");
		System.out.println("levelorder : ");
		tree.levelorder();
	}

}
