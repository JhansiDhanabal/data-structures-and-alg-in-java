/*
  		   n1
  		  /  \
  		n2	  n3
  	   /  \   / \
  	  n4  n5 n6	 n7
 */
package binarytree_linkedlist;

public class linkedlist_binarytree {
	public static void main(String args[]) {
		binarytree tree = new binarytree();
		tree.insert("N1");
		tree.insert("N2");
		tree.insert("N3");
		tree.insert("N4");
		tree.insert("N5");
		tree.insert("N6");
		tree.insert("N7");

		System.out.println("preorder : ");
		tree.preorder(tree.root);
		System.out.println("\npostorder : ");
		tree.postorder(tree.root);
		System.out.println("\ninorder : ");
		tree.inorder(tree.root);
		System.out.println("\nlevelorder : ");
		tree.levelorder();
		System.out.println();
		tree.search("N9");
		tree.search("N4");
		System.out.println("Deepestnode : "+tree.deepestnode().value);
		tree.deletedeepestnode();
		System.out.println("levelorder : ");
		tree.levelorder();
		System.out.println();
		tree.delete("N4");
		System.out.println("levelorder : ");
		tree.levelorder();
	}
}
