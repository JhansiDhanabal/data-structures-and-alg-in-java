package Hashing;
import java.util.*;
public class DirectChaining {	
	LinkedList<String>[] hashtable;
	DirectChaining(int size){
		hashtable = new LinkedList[size];
	}
	private int hashfunction(String word, int M) {
		char ch[] = word.toCharArray();
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			sum += ch[i];
		}
		return sum%M;
	}
	public void insert(String word) {
		int index = hashfunction(word, hashtable.length);
		if(hashtable[index]==null) {
			hashtable[index]=new LinkedList<>();
			hashtable[index].add(word);
		}
		else {
			hashtable[index].add(word);
		}
		System.out.println(word + " Inserted Successfully");
	}
	private boolean search(String word) {
		int index = hashfunction(word, hashtable.length);
		if(hashtable[index]!=null && hashtable[index].contains(word)) 
			return true;
		return false;
	}
	public void delete(String word) {
		boolean flag = search(word);
		int index = hashfunction(word, hashtable.length);
		if(flag == true) {
			hashtable[index].remove(word);
			System.out.println(word + " Deleted Successfully");
			return;
		}
		System.out.println(word + " does not exist");
	}
	public void searching(String word) {
		if(search(word))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
	public void displaytable() {
		for(int i=0;i<hashtable.length;i++) {
			System.out.println("Key "+i+" : Value : "+hashtable[i]);
		}
	}
}
