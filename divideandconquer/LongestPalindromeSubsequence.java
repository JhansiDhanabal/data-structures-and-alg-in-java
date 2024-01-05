package divideandconquer;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AMEEWMEA";
		System.out.println(palindrome(str, 0, str.length()-1 ));
	}
	public static int palindrome(String s1, int start, int end) {
		if(start>end)
			return 0;
		if(start == end)
			return 1;
		int option1 = 0;
		if(s1.charAt(start)==s1.charAt(end))
			option1 = 2+palindrome(s1, start+1, end-1);
		int option2 = palindrome(s1, start+1, end);
		int option3 = palindrome(s1, start, end-1);
		return Math.max(option1, Math.max(option2, option3));
	}
}
