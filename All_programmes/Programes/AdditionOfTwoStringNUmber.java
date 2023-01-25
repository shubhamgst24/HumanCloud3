package Programes;

import java.util.*;

public class AdditionOfTwoStringNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="64";
		String s2="499664";
		
		/* here firstly check in both string String is 
		 * startWith '0' if yes then remove them
		 */
		 int cnt1=0;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)=='0')
					cnt1++;
			}
			int cnt2=0;
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)=='0')
					cnt2++;
			}
			/* here checked if both string are only zeros then 
			 * print 0 and exit from program
			 */
			if(cnt1==s1.length() && cnt2==s2.length())
			{
			System.out.println("0");
			System.exit(0);
				
			}
			else{
				/*
				 * here checked the both string length is same or not
				 * if string is not same then it create same length
				 */
	        int t=0;
			if(s1.length()>s2.length())
			{
				t=s1.length()-s2.length();
				String s3="";
				for(int i=0;i<t;i++)
					s3+='0';
				s2=s3+s2;
			}
			else if(s1.length()<s2.length())
			{
				t=s2.length()-s1.length();
				String s3="";
				for(int i=0;i<t;i++)
					s3+='0';
				s1=s3+s1;
			}
			
			/*
			 * and here after creating a both string length same
			 * do addition of two string
			 */
			int i=s1.length()-1;
			String s4="";
			int extra=0;
			int t1=0;
			int t2=0;
			while(i>=0)
			{
				int temp=((int)(s1.charAt(i)-48)+(int)(s2.charAt(i)-48));
				String ss=Integer.toString(temp);
				int cnt=ss.length();
				t1=temp+extra;
				if(t1<10)
				{
					extra=0;
				}
				t2=t1;
				int t3=t1%10;
				if(cnt>1)
				{
					extra=t1/10;
				}
				s4+=t3;	
				
				i--;
			}
			
			s4+=extra;
			String s5="";
			int sf=s4.length()-1;
			while(s4.charAt(sf)=='0')
			{
				sf--;
			}
			// print new string after addition of two string
			for(int x=sf;x>=0;x--)
				s5+=s4.charAt(x);
			System.out.println(s5);
			}

	}

}
