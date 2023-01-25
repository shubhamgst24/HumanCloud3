package Programes;

import java.util.Scanner;

public class Given_Array_Symmetrical_or_Not {
//*********** 1-D array *********************//
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter even array size : ");
		int size=sc.nextInt();
		char[]a=new char[size];
		
		System.out.println("Use only below brackets : \n ( , )\n< , >\n[ , ]\n{ , }");
		System.out.println("enter characters in array : ");
		int z=0;
		while(z<size)
		{
			a[z]=sc.next().charAt(0);
			z++;
		}
//		
		//char[] a= {'(','<','>',')'};
		int i=0,j=a.length-1;
		//System.out.println((int)a[i]+" "+(int)a[j]);
		int cnt=0;
		/* ASCII value of brackets 
		 * ( - 40, ) - 41
		 * < - 60, > - 62
		 * [ - 91, ] - 93
		 * { - 123, } - 125
		 * 
		 * here we use approach to finding char array is symmetrical or not is
		 * we create a two variable 
		 * 1st {i} is indicate first position of array
		 * and 2nd {j} is indicate last position of array
		 * and 1st is increases and 2nd one is decreases
		 */
		while(i<=j)
		{
			/*
			 * we declare two variable to store arrays element
			 * and it is always change depend on indexes 
			 * c1 and c2
			 */
			int c1=a[i];
			int c2=a[j];
			//System.out.println(c1+" "+c2);
			/* in below if any condition is true then count variable is increases
			 * In this if condition is checked 
			 * c1 number and c2 number is present then it is true if true then 
			 * count is increases
			 */
			if((c1==40 && c2==41)||(c1==60 && c2==62)||(c1==91 && c2==93)||(c1==123 && c2==125))
			{
				cnt++;
			}
			i++;
			j--;
		}
		// if count is equal to half of array length then array is symmetrical
		// else not Symmetrical
		if(cnt==a.length/2)
			System.out.println("Symmetrical");
		else
			System.out.println("not Symmetrical");

	}

}
