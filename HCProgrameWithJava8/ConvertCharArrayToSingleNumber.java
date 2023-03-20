package HCPrograme;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertCharArrayToSingleNumber {

	public static void main(String[] args) {

		char[]ch= {'2','3','5','6','7','9','a','6'};
		
		//using ascii value normal way 
		long number=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57) {
			number*=10;
			number+=(int)(ch[i]-48);
			}
		}
		System.out.println(number);
		
		// using java8
		String s1=Stream.of(ch).map(e-> new String(e)).collect(Collectors.joining());
		
		System.out.println(s1);
		
		
		
	}

}
