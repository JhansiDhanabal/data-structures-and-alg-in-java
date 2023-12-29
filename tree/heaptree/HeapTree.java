package binarytree;

public class HeapTree {
	int arr[];
	int lastindex;
	HeapTree(int size){
		arr = new int[size+1];
		lastindex = 0;
	}
	//level order traversal
	public void levelorder() {
		for(int i=1;i<=lastindex;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//ismempty
	public boolean isempty() {
		if(lastindex==0) 
			return true;
		return false;
	}
	//peak
	public Integer peek() {
		if(!isempty())
			return arr[1];
		return null;
	}
	//size
	public int size() {
		return lastindex;
	}
	//swap
	public void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//heapify bottom to top
	public void heapifybottomtotop(int index, String heaptype) {
		int parent = index/2;
		if(index<=1)
			return;
		if(heaptype == "Max") {
			if(arr[parent] < arr[index])
				swap(parent,index);
		}
		else if(heaptype == "Min") {
			if(arr[parent] > arr[index])
				swap(parent,index);
		}
		heapifybottomtotop(parent, heaptype);
	}
	//insert
	public void insert(int value, String heaptype) {
		arr[++lastindex] = value;
		heapifybottomtotop(lastindex,heaptype);
	}
	//heapify top to bottom
	public void heapifytoptobottom(int index, String heaptype) {
		int left = 2*index;
		int right = 2*index+1;
		int swapchild = 0;
		if(left > lastindex)
			return;
		if(heaptype == "Min") {
			if(left == lastindex) {
				if(arr[index] > arr[left])
					swap(index, left);
				return;
			}
			else {
				if(arr[left] < arr[right])
					swapchild = left;
				else
					swapchild = right;
				if(arr[index] > arr[swapchild])
					swap(index, swapchild);
			}
		}else if(heaptype == "Max") {
			if(left == lastindex) {
				if(arr[index] < arr[left])
					swap(index, left);
				return;
			}
			else {
				if(arr[left] > arr[right])
					swapchild = left;
				else
					swapchild = right;
				if(arr[index] < arr[swapchild])
					swap(index, swapchild);
			}
		}
		heapifytoptobottom(swapchild, heaptype);
	}
	//extract node -> only root node
	public Integer extract(String heaptype) {
		if(!isempty()) {
			int extractnode = arr[1];
			arr[1] = arr[lastindex--];
			heapifytoptobottom(1,heaptype);
			return extractnode;
		}
		return null;
	}
}
