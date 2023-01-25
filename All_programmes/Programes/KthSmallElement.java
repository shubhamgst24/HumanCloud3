package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("enter element in array ");
		int i=0;
		while(i<size)
		{
			a[i]=sc.nextInt();
			i++;
		}
		System.out.println("enter Kth smallest element : ");
		int k=sc.nextInt();
		System.out.println("enter Kth Biggest element : ");
		int km=sc.nextInt();
		
		sort(a);
		System.out.println("Kth smallest element : "+a[k-1]);
		System.out.println("Kth biggest element : "+a[a.length-km]);
		

	}

	private static void sort(int[] a) {
		
		// here used sorting  bubble sort
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
	}

}
