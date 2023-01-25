package Programes;

public class StringIntoInteger {

	public static void main(String[] args) {

		String s1="1234567890";
		int a=0;
		int i=0;
		while(i<s1.length())
		{
			a*=10;
			a+=(int)(s1.charAt(i)-48);
			i++;
		}
		System.out.println(a);
	}

}
