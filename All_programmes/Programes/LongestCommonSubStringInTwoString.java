package Programes;

public class LongestCommonSubStringInTwoString {

	public static void main(String[] args) {
		
		// we taken two strings s1 and s2
		String s1="GeeksforGeeks";
		String s2="GeeksQuiz";
		
		//we create another empty string for store new longest common sub string in
		// between two strings
		String s3="";
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				// 1st we check common character between those two string
				if(s1.charAt(i)==s2.charAt(j))
				{
				// when common character is found in those string
				// we declare two variable X and Y
				// in x and y stored ith index and jth index
					int x=i;
					int y=j;
					String s4="";
				// after that we check both string from x and yth index upto last index 
				// of both string in parallel
					while(y<s2.length() && x<s1.length())
					{
						// if condition is true upto we stored 2nd string character into 
						// another new string
						if(s1.charAt(x)==s2.charAt(y))
						{
							s4+=s2.charAt(y);
						}
						else
						{
							break;
						}
						x++;
						y++;
					}
					/*
					 * we check length of strings if s4 length is bigger than s3
					 * we stored s4 into s3
					 */
					if(s4.length()>s3.length())
						s3=s4;
				}
			}
		}
		// common string is printed with his length
		System.out.println("New SubString : "+s3+"\nSize of substring : "+s3.length());

	}

}
