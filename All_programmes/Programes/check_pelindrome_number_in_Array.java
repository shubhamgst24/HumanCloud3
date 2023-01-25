package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class check_pelindrome_number_in_Array {

	public static void main(String[] args) {
		/*
		 * here we create an integer array 
		 * and entered element in array
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int size=sc.nextInt();
		
		int[] a=new int[size];
		
		System.out.println("enter Arrays number : ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		/*
		 * we create method for finding pelindrome number
		 * in array and this method is return pelindrome number array
		 */
		int [] b=findPelindromeNumber(a);
		System.out.println(Arrays.toString(b));

	}

	private static int[] findPelindromeNumber(int[] a) {
		
		int[]b=new int[a.length];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			/*
			 * here taken a one by one element in array
			 * and checked it is pelindrome or not
			 */
			int t=a[i];
			int s=t;
			int p=0;
			while(t>0)
			{
				p*=10;
				p+=t%10;
				t/=10;
			}
			// if number is pelindrome then it store in another array
			if(s==p)
			{
				b[ind++]=s;
				
			}
		}
		/*
		 * here created new array for returning only pelindrome 
		 * number array
		 */
		int c[]=new int[ind];
		for(int i=0;i<ind;i++)
		{
			c[i]=b[i];
		}
		
		return c;
	}

}
