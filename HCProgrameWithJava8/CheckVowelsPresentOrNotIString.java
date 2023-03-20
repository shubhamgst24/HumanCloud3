package HCPrograme;

import java.util.stream.IntStream;

public class CheckVowelsPresentOrNotIString 
{

	public static void main(String[] args) {
		
		String s1="Shubham";
		System.out.println(checkVowels(s1));
		System.out.println(checkVowelInString(s1)? "present":"not present");
	}

	//using java8 feature
	private static boolean checkVowelInString(String s1) {

		boolean s=IntStream.range(0, s1.length()).mapToObj(s1::charAt).anyMatch(i-> "aeiouAEIOU".indexOf(i) >=0);
		return s;
	}
	
	// without using java8 feature
	private static String checkVowels(String s1) {


		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='A'|| s1.charAt(i)=='E'|| s1.charAt(i)=='I'|| s1.charAt(i)=='O'|| s1.charAt(i)=='U'|| s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
			{
				return "present";
			}
		}
		return "not present";
	}
}
