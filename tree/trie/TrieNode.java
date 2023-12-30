package binarytree;
import java.util.HashMap;
import java.util.Map;
public class TrieNode {
	Map<Character, TrieNode> children;
	boolean endofstring;
	TrieNode(){
		children = new HashMap<>();
		endofstring = false;
	}
}
