package Programes;

import java.util.Scanner;

public class Ways_of_Climbing_stairs_to_top_in_steps_of_1_or_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stairs number : ");
		int s=sc.nextInt();
		
		System.out.println("Number of ways : "+countWays(s));
		
	}

	private static int countWays(int s) {
		if(s==1)
			return 1;
		int s1=1;
		int s2=2;
		for(int i=3;i<=s;i++)
		{
			int s3=s1+s2;
			s1=s2;
			s2=s3;
		}
		return s2;
	}

}
