package Programes;

import java.util.Scanner;

public class numero_name {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name : ");
		String s1=sc.next();
		System.out.println("Your numero name is : "+nemo(s1));
		
	}

	private static String nemo(String s1) {
		
		if(s1.length()<1)
		{
			return "-1";
		}
		else if(s1.length()==1)
		{
			System.out.println("only one character in name");
			return s1;
		}
		else if(s1.length()==2)
		{
			System.out.println("No character between first and last character of name");
			return s1;
		}
		else {
		String s2="";
		s2+=s1.charAt(0);
		int i=1;
		int cnt=0;
		while(i<s1.length()-1)
		{
			cnt++;
			i++;
		}
		s2+=cnt;
		s2+=s1.charAt(s1.length()-1);
		return s2;}
	}

}
