package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		find();
	}

	private static void find() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();
		System.out.println("enter array element");
		int[] a=new int[size];
		int i=0;
		/*
		 * here we create int array with using scanner for binary serch
		 */
		while(i<a.length)
		{
			a[i]=sc.nextInt();
			i++;
		}
		
		/* firstly we sort the array because
		 * binary search work with only sorted array
		 */
		Arrays.sort(a);
		
		/*
		 * here we taken a number from user and find
		 * in array and if it is present then printed index
		 *  of that element in array else it is not present
		 *  in array then print number is not present in array
		 */
		int start=0;
		int end=a.length-1;
		System.out.println("Enter the number which want to index of that number");
		int num=sc.nextInt();
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]== num)
			{
				System.out.println("number found at index : "+mid);
				break;
			}
			else if(a[mid]>num)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		
		if(start>end)
		{
			System.out.println("Number is not present in array ");
		}
	}

}
