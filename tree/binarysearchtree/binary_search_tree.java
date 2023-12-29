package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class binary_search_tree {
	binarysearchnode root;
	binary_search_tree(){
		root = null;
	}
	public binarysearchnode insert(binarysearchnode node, int value) {
		if(node==null)
		{
			binarysearchnode temp = new binarysearchnode();
			temp.value = value;
			return temp;
		}
		else if(node.value >= value) {
			node.left = insert(node.left,value);
			return node;
		}
		else {
			node.right = insert(node.right,value);
			return node;
		}
	}
	public void insert(int value) {
		root = insert(root,value);
	}
	public void preorder(binarysearchnode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.value+" ");
		preorder(node.left);
		preorder(node.right);
	}
	//postorder traversal
	public void postorder(binarysearchnode node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value+" ");
		
	}
	//inorder traversal
	public void inorder(binarysearchnode node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.value+" ");
		inorder(node.right);
	}
	//levelorder traversal
	public void levelorder() {
		Queue<binarysearchnode> queue = new LinkedList<>();
		queue.add(root);
		binarysearchnode present;
		while(!queue.isEmpty()) {
			present = queue.remove();
			System.out.print(present.value+" ");
			if(present.left!=null)
				queue.add(present.left);
			if(present.right!=null)
				queue.add(present.right);
		}
	}
	//search 
	public binarysearchnode search(binarysearchnode node,int value) {
		if(node==null) {
			System.out.println("Not Found");
			return null;
		}
		else if(node.value == value) {
			System.out.println("\nFound");
			return node;
		}
		else if(value < node.value) {
			return search(node.left, value);
		}
		else {
			return search(node.right,value);
		}
	}
	//mininum
	public binarysearchnode getminimum(binarysearchnode node) {
		if(node.left == null)
			return node;
		return getminimum(node.left);
	}
	//delete
	public binarysearchnode delete(binarysearchnode root, int value) {
		if(root==null) {
			System.out.println("Not Found");
			return null;
		}
		else if(value<root.value) {
			root.left = delete(root.left, value);
		}
		else if(value>root.value) {
			root.right = delete(root.right, value);
		}
		else {
			if(root.left!=null && root.right!=null) {
				binarysearchnode minimum = getminimum(root.right);
				root.value = minimum.value;
				root.right = delete(root.right,root.value);
			}
			else if(root.left != null) {
				root = root.left;
			}
			else if(root.right != null) {
				root = root.right;
			}
			else {
				root = null;
			}
		}
		return root;
	}
	public void deletetree() {
		root = null;
		System.out.println("Successfully deleted");
	}
}
