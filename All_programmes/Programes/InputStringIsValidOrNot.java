package Programes;

import java.util.Scanner;

public class InputStringIsValidOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Use only below Characters : \n ( , )\n< , >\n[ , ]\n{ , }");
		System.out.println("Enter a string : ");
		String s1=sc.next();
		System.out.println(isValid(s1)?"String is valid":"String is not valid");
	}

	private static boolean isValid(String s1) {
		/* ASCII value of brackets 
		 * ( - 40, ) - 41
		 * < - 60, > - 62
		 * [ - 91, ] - 93
		 * { - 123, } - 125
		 */
		
		/*
		 * here we check character means types of brackets is symmetric or not
		 * it means which bracket is open in array index and next contagious index this bracket
		 * is closed or not
		 * if bracket is open and closed contagiously when condition is true
		 * else false
		 */
		int cnt=0;
		for(int i=0;i<s1.length()-1;i+=2)
		{
			/*
			 * we creating two int variable c1 & c2
			 * c1 store character in ith index character in array
			 * and c2 store character in i+1 th index character in array
			 */
			int c1=(int)(s1.charAt(i));
			
			int c2=(int)(s1.charAt(i+1));
			/*
			 * in if condition have multiple conditions
			 * if any one is true then cnt is increases
			 */
			if((c1==40 && c2==41)||(c1==60 && c2==62)||(c1==91 && c2==93)||(c1==123 && c2==125))
			{
				cnt++;
			}
		}
		// we compare cnt is equal to half of array length 
		// if cnt equal then String is valid
		//	else not valid
		if(cnt==s1.length()/2)
			return true;
		else
			return false;
	}

}
