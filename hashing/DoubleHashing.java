package Hashing;

import java.util.ArrayList;

public class DoubleHashing {
	String hashtable[];
	int cellused;
	DoubleHashing(int size){
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
	private int sumdigits(int sum) {
		int value = 0;
		while(sum>0) {
			value += sum%10;
			sum = sum/10;
		}
		return value;
	}
	private int secondhashfunction(String word, int M) {
		char ch[] = word.toCharArray();
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			sum += ch[i];
		}
		while(sum>hashtable.length) {
			sum = sumdigits(sum);
		}
		return sum%M;
	}
	public void insert(String word) {
		double factor = loadfactor();
		if(factor >= 0.75) {
			rehashing(word);
		}else {
			int x = hashfunction(word,hashtable.length);
			int y = secondhashfunction(word, hashtable.length);
			for(int i=0;i<hashtable.length;i++) {
				int position = (x+i*y)%hashtable.length;
				if(hashtable[position] == null) {
					hashtable[position] = word;
					break;
				}
			}
		}
		cellused++;
	}
	
	public void displaytable() {
		for(int i=0;i<hashtable.length;i++) {
			System.out.println("Key "+i+" : Value : "+hashtable[i]);
		}
	}
}
