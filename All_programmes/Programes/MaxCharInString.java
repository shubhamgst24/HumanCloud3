package Programes;

import java.util.Scanner;

public class MaxCharInString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1=sc.nextLine();
		print(s1);
	}

	private static void print(String s1) {

		int max=Integer.MIN_VALUE;
		char ch=' ';
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=i;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				ch=s1.charAt(i);
			}
		}
		System.out.println("character "+ch+" no. of times "+max);
	}

}
