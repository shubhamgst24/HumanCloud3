package Programes;

import java.util.Scanner;

public class GivenArraySymetricalOrNot2DArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int row=sc.nextInt();
		int column=row;
		System.out.println("you store "+(row*column)+" elements in array");
		int [][]a=new int[row][column];
		System.out.println("enter elements : ");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		 * first we create 2d array and insert element in this array
		 * and then create isSymmetric() method 
		 * it returns true if symmetric else not symmetric
		 */
		boolean s=isSymmetric(a);
		if(s==true)
		{
			System.out.println("Symmetrical");
		}
		else
		{
			System.out.println("Not Symmetrical");

		}
	}

	private static boolean isSymmetric(int[][] a) {
		/*
		 * here we use the transpose approach for 
		 * checking 2d array is symmetrical or not
		 * *** here we not create new array *** 
		 */
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]!=a[j][i])
					return false;
			}
		}
		return true;
	}

}
