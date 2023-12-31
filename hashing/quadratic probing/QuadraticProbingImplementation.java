package Hashing;

public class QuadraticProbingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Hello","Welcome","to","My","Coding","Program","Java","Hello","Welcome","to","My","Coding","Program","Java"};
		QuadraticProbing hashing = new QuadraticProbing(13);
		for(int i=0;i<str.length;i++) {
			hashing.insert(str[i]);
		}
		hashing.displaytable();

	}

}
