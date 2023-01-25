package Programes;

import java.util.Scanner;

public class CharArrayToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character array size less than 11 : ");
		int size=sc.nextInt();
		System.out.println("Enter Numeric character element from 0 to 9 in Array : ");
		char[] ch=new char[size];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println(charArrayToNumber(ch));
	}

	private static int charArrayToNumber(char[] ch) {
		
		
		/*
		 * in this we take a one by one element from array
		 * and covert it into integer and add into integer variable
		 */
		int a=0;
		int i=0;
		while(i<ch.length)
		{
			a*=10;
			a+=((int)(ch[i]-48));
			i++;
		}
		return a;
	}

}
