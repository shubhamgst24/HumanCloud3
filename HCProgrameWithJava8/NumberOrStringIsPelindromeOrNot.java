package HCPrograme;

import java.util.stream.IntStream;

public class NumberOrStringIsPelindromeOrNot {

	public static void main(String[] args) {

		int a = 12321;

		String s1 = Integer.toString(a);

		//normal way
		int i = 0;
		int j = s1.length() - 1;
		int c=0;
		while (i < j) {

			if(s1.charAt(i)==s1.charAt(j))
				c++;
			i++;
			j--;
		}
		System.out.println((c==s1.length()/2)?"palindrome":"not palindrome");
		
		//************************* using java8 *******************************
		
		boolean b=IntStream.range(0, s1.length()/2)
				.noneMatch(e-> s1.charAt(e)!=s1.charAt(s1.length()-e-1));
		
		System.out.println(b?"palindrome":"not palindrome");
		
		
		
	}

}
