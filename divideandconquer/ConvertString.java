package divideandconquer;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertstring("table","tbres",0,0));
	}
	public static int convertstring(String s1, String s2, int index1, int index2) {
		if(index1 == s1.length())
			return s2.length() - index2;
		if(index2 == s2.length())
			return s1.length() - index1;
		if(s1.charAt(index1)==s2.charAt(index2))
			return convertstring(s1, s2, index1+1, index2+1);
		else {
			int delete = 1+convertstring(s1, s2, index1, index2+1);
			int insert = 1+convertstring(s1, s2, index1+1, index2);
			int replace = 1+convertstring(s1, s2, index1+1, index2+1);
			return Math.min(replace, Math.min(delete, insert));
		}
	}
}
