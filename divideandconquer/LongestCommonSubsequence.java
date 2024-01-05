package divideandconquer;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(common("elephant","erepant",0,0));
	}
	public static int common(String s1, String s2, int index1, int index2) {
		if(index1 == s1.length() || index2 == s2.length())
			return 0;
		int option1 = 0;
		if(s1.charAt(index1)==s2.charAt(index2))
			option1 = 1+common(s1, s2, index1+1, index2+1);
		int option2 = common(s1, s2, index1+1, index2);
		int option3 = common(s1, s2, index1, index2+1);
		return Math.max(option2, Math.max(option1, option3));
	}
}
