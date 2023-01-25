package Programes;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoBigNumber {

	public static void main(String[] args) {
		
		
		// addition of two large number using BigInteger
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number N1 : ");
		String s1=sc.next();
		System.out.println("Enter number N2 : ");
		String s2=sc.next();
		
		System.out.println("addition of two big number is : \n"+add(s1,s2));
		
	}

	private static BigInteger add(String s1, String s2) {
		BigInteger b1=new BigInteger(s1);
		BigInteger b2=new BigInteger(s2);
		BigInteger b3=b1.add(b2);
		return b3;
	}

}
