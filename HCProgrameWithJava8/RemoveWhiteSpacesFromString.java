package HCPrograme;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {

		String s1="   abc bnv cdf  ";
		
		String s2="";
		for(char c:s1.toCharArray())
		{
			if(c!=' ')
			{
				s2+=c;
			}
		}
		System.out.println(s2);
		
		System.out.println(s1.replaceAll(" ", ""));
	}

}
