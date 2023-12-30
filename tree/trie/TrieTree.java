package binarytree;

public class TrieTree {
	TrieNode root;
	TrieTree(){
		root = new TrieNode();
	}
	public void insert(String word) {
		TrieNode current = root;
		TrieNode node;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			node = current.children.get(ch);
			if(node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		System.out.println("Inserted Successfully "+word);
		current.endofstring = true;
	}
	private boolean searched(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(current.children.get(ch)==null)
				return false;
			current = current.children.get(ch);
		}
		return current.endofstring;
	}
	public void search(String word) {
		if(searched(word))
			System.out.println("Found");
		else
			System.out.println("Not found");
	}
	private boolean delete(TrieNode parent, String word, int index) {
		char ch = word.charAt(index);
		TrieNode node = parent.children.get(ch);
		boolean deleted;
		if(index == word.length()-1 ) {
			if(node.children.size()>=1) {
				node.endofstring = false;
				return false;
			}
			else {
				parent.children.remove(ch);
				return true;
			}	
		}
		if(node.children.size()>1) {
			delete(node, word, index+1);
			return false;
		}
		
		if(node.endofstring == true) {
			delete(node, word, index+1);
			return false;
		}
		deleted = delete(node, word, index+1);
		if(deleted) {
			parent.children.remove(ch);
			return true;
		}else {
			return false;
		}
	}
	public void delete(String word) {
		if(searched(word)) {
			delete(root, word, 0);
			System.out.println("Successfully Deleted");
			return;
		}
		System.out.println("Word not found");
	}
}
