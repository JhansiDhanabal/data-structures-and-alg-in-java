package binarytree;

public class binary_tree_array {
	String arr[];
	int lastindex;
	binary_tree_array(int size){
		arr = new String[size+1];
		lastindex=0;
	}
	public void insert(String value) {
		if(!isfull()) {
			arr[++lastindex] = value;
			System.out.println("Successfully inserted");
			return;
		}
		System.out.println("Array is full");
	}
	public boolean isfull() {
		if(lastindex == arr.length-1)
			return true;
		return false;
	}
	public int search(String value) {
		for(int i=1;i<=lastindex;i++) {
			if(arr[i]==value) {
				System.out.println("Found at index "+i);
				return i;
			}
		}
		return -1;
	}
	public void delete(String value) {
		int index = search(value);
		if(index != -1) {
			arr[index] = arr[lastindex];
			lastindex--;
			System.out.println("Successfully deleted");
			return;
		}
		System.out.println("Element not found");
	}
	public void postorder(int index) {
		if(index>lastindex)
			return;
		postorder(2*index);
		System.out.print(arr[index]+" ");
		postorder(2*index+1);
	}
	public void preorder(int index) {
		if(index>lastindex)
			return;
		System.out.print(arr[index]+" ");
		preorder(2*index);
		preorder(2*index+1);
	}
	public void inorder(int index) {
		if(index>lastindex)
			return;
		inorder(2*index);
		inorder(2*index+1);
		System.out.print(arr[index]+" ");
	}
	public void levelorder() {
		for(int i=1;i<=lastindex;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
