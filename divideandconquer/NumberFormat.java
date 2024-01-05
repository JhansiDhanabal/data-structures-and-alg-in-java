/*
  show how many ways that can be express n in sequence of 1,3,4 
 */
package divideandconquer;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = number(6);
		System.out.println(num);

	}
	public static int number(int n) {
		if(n==0 || n==1 || n== 2)
			return 1;
		if(n==3)
			return 2;
		return number(n-1)+number(n-3)+number(n-4);
				
	}
}
