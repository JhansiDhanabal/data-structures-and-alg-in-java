package binarytree;

public class TrieImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieTree tree = new TrieTree();
		String str[] = {"API","APPLE","K","APIS","AP","BIL"};
		for(String word:str)
			tree.insert(word);
		tree.search("API");
		tree.search("BAR");
		tree.delete("AP");
		tree.delete("K");
		tree.delete("APIS");
		tree.search("API");
		tree.search("APIS");
		tree.search("K");
	}

}
