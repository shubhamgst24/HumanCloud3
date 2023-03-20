package HCPrograme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DistictCharAndCountInString {

	public static void main(String[] args) {

		String s1="aabcc";
		
		//using map
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(char c:s1.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				int temp=map.get(c);
				map.put(c, temp+1);
			}
		}
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey());
		}
		System.out.println(map.size());
		
		// using normal loop
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=i-1;j>=0;j--)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0) {
				s2+=s1.charAt(i);
				System.out.println(s1.charAt(i));}
		}
	
		System.out.println(s2.length());
		
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			if(s3.indexOf(s1.charAt(i))==-1)
			{
				s3+=s1.charAt(i);
			}
		}
		System.out.println(s3+"\n"+s3.length());
		
		// Using java8
		
		s1.chars().distinct().forEach(e-> System.out.println((char)(e)));
		int count=(int) s1.chars().distinct().count();
		System.out.println(count);
		
		
	}

}
