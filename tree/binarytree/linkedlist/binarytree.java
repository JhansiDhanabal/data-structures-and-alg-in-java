package binarytree_linkedlist;

import java.util.*;

public class binarytree {
	binarynode root;
	binarytree(){
		this.root = null;
	}
	//preorder traversal
	public void preorder(binarynode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.value+" ");
		preorder(node.left);
		preorder(node.right);
	}
	//postorder traversal
	public void postorder(binarynode node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value+" ");
		
	}
	//inorder traversal
	public void inorder(binarynode node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.value+" ");
		inorder(node.right);
	}
	//levelorder traversal
	public void levelorder() {
		Queue<binarynode> queue = new LinkedList<>();
		queue.add(root);
		binarynode present;
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
	public void search(String value) {
		Queue<binarynode> queue = new LinkedList<>();
		queue.add(root);
		binarynode present = null;
		while(!queue.isEmpty()) {
			present = queue.remove();
			if(present.value.equals(value)) {
				System.out.println("found");
				return;
			}
			if(present.left!=null)
				queue.add(present.left);
			if(present.right!=null)
				queue.add(present.right);
		}
		System.out.println("Not found");
	}
	//deepest node
	public binarynode deepestnode() {
		Queue<binarynode> queue = new LinkedList<>();
		queue.add(root);
		binarynode present = null;
		while(!queue.isEmpty()) {
			present = queue.remove();
			if(present.left!=null)
				queue.add(present.left);
			if(present.right!=null)
				queue.add(present.right);
		}
		return present;
	}
	//delete deepest node
	public void deletedeepestnode() {
		Queue<binarynode> queue = new LinkedList<>();
		queue.add(root);
		binarynode previous,present = null;
		while(!queue.isEmpty()) {
			previous = present;
			present = queue.remove();
			if(present.left==null) {
				previous.right=null;
				return;
			}
			else if(present.right == null) {
				present.left=null;
				return;
			}
			queue.add(present.left);
			queue.add(present.right);
		}

	}
	//delete particular nodevalue
	public void delete(String value) {
		Queue<binarynode> queue = new LinkedList<>();
		queue.add(root);
		binarynode present = null;
		while(!queue.isEmpty()) {
			present = queue.remove();
			if(present.value==value) {
				binarynode node = deepestnode();
				present.value = node.value;
				deletedeepestnode();
				System.out.println("Successfully deleted");
				return;
			}
			queue.add(present.left);
			queue.add(present.right);
		}
		System.out.println("Element not found");
	}
	//insert
	public void insert(String value) {
		binarynode node = new binarynode();
		node.value = value;
		if(root == null) {
			root = node;
		}
		else {
			Queue<binarynode> queue = new LinkedList<>();
			queue.add(root);
			binarynode present;
			while(!queue.isEmpty()) {
				present = queue.remove();
				if(present.left==null) {
					present.left = node;
					return;
				}
				else if(present.right==null) {
					present.right = node;
					return;
				}
				queue.add(present.left);
				queue.add(present.right);
			}
		}
	}
	
}
