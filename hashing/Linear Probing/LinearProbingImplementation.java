package Hashing;

public class LinearProbingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Hello","Welcome","to","My","Coding","Program","Java"};
		LinearProbing hashing = new LinearProbing(6);
		for(int i=0;i<str.length;i++) {
			hashing.insert(str[i]);
		}
		hashing.displaytable();
		hashing.searching("Our");
		hashing.searching("Welcome");
		hashing.delete("My");
		hashing.displaytable();
	}

}
