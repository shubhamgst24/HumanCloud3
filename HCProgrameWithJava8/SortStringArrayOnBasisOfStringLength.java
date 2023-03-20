package HCPrograme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortStringArrayOnBasisOfStringLength {

	public static void main(String[] args) {


		String[] s1= {"abcd","bcdfs","afsxdvdc","sd","sedfsxdcaz"};
		System.out.println("without sort "+Arrays.toString(s1));
		
		//using normal loop sorting technique
		String[] s2=s1;
		for(int i=0;i<s2.length-1;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].length()>s2[j].length())
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		System.out.println("with sorting technique "+Arrays.toString(s2));
		
		String s3[]=s1;
		List<String> list=List.of(s3)
				.stream()
				.sorted((o1,o2)-> Integer.compare(o1.length(), o2.length()))
				.collect(Collectors.toList());
		System.out.println("acending order "+list);
		
		List<String> list1=List.of(s3)
				.stream()
				.sorted((o1,o2)-> Integer.compare(o2.length(), o1.length()))
				.collect(Collectors.toList());
		System.out.println("desc order "+list1);
		
		
		
	}	
	
	

}
