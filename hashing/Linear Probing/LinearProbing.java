package Hashing;

import java.util.*;

public class LinearProbing {
	String hashtable[];
	int cellused;
	LinearProbing(int size){
		hashtable = new String[size];
		cellused = 0;
	}
	private double loadfactor() {
		return cellused*1.0/hashtable.length;
	}
	private int hashfunction(String word, int M) {
		char ch[] = word.toCharArray();
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			sum += ch[i];
		}
		return sum%M;
	}
	private void rehashing(String word) {
		cellused = 0;
		ArrayList<String> arr = new ArrayList<>();
		for(String str:hashtable) {
			if(str!=null)
				arr.add(str);
		}
		arr.add(word);
		hashtable = new String[hashtable.length * 2];
		for(String str: arr) {
			insert(str);
		}
	}
	public void insert(String word) {
		double factor = loadfactor();
		if(factor >= 0.75) {
			rehashing(word);
		}else {
			int index = hashfunction(word,hashtable.length);
			for(int i=index;i<index+hashtable.length;i++) {
				int position = i%hashtable.length;
				if(hashtable[position] == null) {
					hashtable[position] = word;
					break;
				}
			}
		}
		cellused++;
		System.out.println(word+" Inserted Successfully");
	}
	private boolean search(String word) {
		int index = hashfunction(word,hashtable.length);
		for(int i=index;i<index+hashtable.length;i++) {
			int position = i%hashtable.length;
			if(hashtable[position]!=null && hashtable[position].equals(word))
				return true;
		}
		return false;
	}
	public void searching(String word) {
		if(search(word))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
	public void delete(String word) {
		if(search(word)) {
			int index = hashfunction(word,hashtable.length);
			for(int i=index;i<index+hashtable.length;i++) {
				int position = i%hashtable.length;
				if(hashtable[position]!=null && hashtable[position].equals(word)) {
					hashtable[position]=null;
					System.out.println(word + " Successfully Deleted");
					return;
				}
			}
		}else {
			System.out.println(word + " does not exist");
		}
	}
	public void displaytable() {
		for(int i=0;i<hashtable.length;i++) {
			System.out.println("Key "+i+" : Value : "+hashtable[i]);
		}
	}
}
