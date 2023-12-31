package Hashing;

public class DoubleHashingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Hello","Welcome","to","My","Coding","Program","Java","Hello","Welcome","to","My","Coding","Program","Java"};
		DoubleHashing hashing = new DoubleHashing(13);
		for(int i=0;i<str.length;i++) {
			hashing.insert(str[i]);
		}
		hashing.displaytable();

	}

}
