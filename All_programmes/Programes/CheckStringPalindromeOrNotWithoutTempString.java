package Programes;

public class CheckStringPalindromeOrNotWithoutTempString {

	public static void main(String[] args) {
		
		// we checked string is pelindrome or not without using temporary string 
		
		String s1="abcdcba";
		
		/*
		 * creating a method for checking string is pelindrome or not
		 * and this method is give a result in boolean
		 * here used ternary operator for printing a result
		 */
		
		System.out.println(checkPelindrome(s1)?"is pelindrome":"is not palindrome");

	}

	private static boolean checkPelindrome(String s1) {
		
		// if given string length is less than 1 then it return true
		if(s1.length()<=1)
			return true;
		/*
		 * if string length is greater than 0 then we 
		 * take a two variable 
		 * 1st represent index position of 1st index of string
		 * and 2nd represent index position of last index of string 
		 */
		int i=0,j=s1.length()-1;
		while(i<=j)
		{
			/* checked 1st and last element is same or not
			 * if not then it return false
			 */
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
