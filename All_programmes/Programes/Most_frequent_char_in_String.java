package Programes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Most_frequent_char_in_String {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
//		System.out.println("enter string : ");
//		String s5=input.readLine();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String s5=sc.nextLine();
		/* when we taken string from console in their
		 * Possibility is number of excessive spaces
		 * so thats why firstly we trim and split the string and
		 * after split we store only those strings concate in single string 
		 */
		s5=s5.trim();
		String[] ch1=s5.split(" ");
		
		String s1="";
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i].length()>0)
			{
			s1+=ch1[i];
			System.out.println(ch1[i]);
			}
		}
		
		String s2="";
		// here we create new string and store only distinct character from trim and concated string
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt==0)
			{
				s2+=s1.charAt(i);
			}
		}
		//System.out.println(s2);
		//we create string to char array and sort the array
		
		char[] sa=s2.toCharArray();
		Arrays.sort(sa);
		// again we stored element in new string after sorting
		String s3="";
		for(int i=0;i<sa.length;i++)
		s3+=sa[i];
		//System.out.println(s3);
		
		int m=-1;
		char ch=' ';
		/*
		 * here we compare two string to each other and find 
		 * the most frequent character
		 */
		for(int i=0;i<s3.length();i++)
		{
			int cnt=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s3.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt>m)
			{
				m=cnt;
				ch=s3.charAt(i);
			}
		}
		System.out.println(ch+" "+m);
	}

}
