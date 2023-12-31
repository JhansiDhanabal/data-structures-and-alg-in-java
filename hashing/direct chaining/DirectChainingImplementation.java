package Hashing;

public class DirectChainingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String str[] = {"Hello","Welcome","to","My","Coding","Program"};
		DirectChaining hashing = new DirectChaining(7);
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
