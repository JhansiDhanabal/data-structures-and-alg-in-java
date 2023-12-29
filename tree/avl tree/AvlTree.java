package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class AvlTree {
	binarysearchnode root;
	AvlTree(){
		root = null;
	}
	//getbalance
	int getbalance(binarysearchnode node) {
		if(node==null)
			return 0;
		return getheight(node.left)-getheight(node.right);
	}
	//getheight
	int getheight(binarysearchnode node) {
		if(node==null)
			return 0;
		return node.height;
	}
	//rotateright
	public binarysearchnode rotateright(binarysearchnode imbalancenode) {
		binarysearchnode newnode = imbalancenode.left;
		imbalancenode.left = newnode.right;
		newnode.right = imbalancenode;
		newnode.height = 1+Math.max(getheight(newnode.left),getheight(newnode.right));
		imbalancenode.height = 1+Math.max(getheight(imbalancenode.left),getheight(imbalancenode.right));
		return newnode;
	}
	//rotateleft
		public binarysearchnode rotateleft(binarysearchnode imbalancenode) {
			binarysearchnode newnode = imbalancenode.right;
			imbalancenode.right = newnode.left;
			newnode.left = imbalancenode;
			newnode.height = 1+Math.max(getheight(newnode.left),getheight(newnode.right));
			imbalancenode.height = 1+Math.max(getheight(imbalancenode.left),getheight(imbalancenode.right));
			return newnode;
		}
	//insert
	private binarysearchnode insert(binarysearchnode node, int value) {
		if(node==null) {
			binarysearchnode newnode = new binarysearchnode();
			newnode.value = value;
			newnode.height = 1;
			return newnode;
		}
		else if(value <= node.value) {
			node.left = insert(node.left, value);
		}
		else{
			node.right = insert(node.right, value);
		}
		node.height = 1+Math.max(getheight(node.left), getheight(node.right));
		int balance = getbalance(node);
		if(balance>1 && value <= node.left.value) {
			return rotateright(node);
		}
		if(balance>1 && value > node.left.value) {
			node.left = rotateleft(node.left);
			return rotateright(node);
		}
		if(balance<-1 && value>node.right.value) {
			return rotateleft(node);
		}
		if(balance<-1 && value <= node.right.value) {
			node.right = rotateright(node.right);
			return rotateleft(node);
		}
		return node;
	}
	//insert
	public void insert(int value) {
		root = insert(root,value);
	}
	//preorder
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
		root.height = 1+Math.max(getheight(root.left), getheight(root.right));
		
		int balance = getbalance(root);
		if(balance>1 && getbalance(root.left)>=0) {
			return rotateright(root);
		}
		else if(balance>1 && getbalance(root.left)<0) {
			root.left = rotateleft(root.left);
			return rotateright(root);
		}
		else if(balance<-1 && getbalance(root.right)<=0) {
			return rotateleft(root);
		}
		else if(balance<-1 && getbalance(root.right)>0) {
			root.right = rotateright(root.right);
			return rotateleft(root);
		}
		return root;
	}
	public void delete(int value) {
		root = delete(root, value);
	}
	public void deletetree() {
		root = null;
		System.out.println("Successfully deleted");
	}
	
}
