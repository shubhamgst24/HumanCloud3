package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class mostCommonPrefixInStringArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Declaring String array size
		System.out.println("Enter Size of String array : ");
		int size=sc.nextInt();
		
		//creating string array with size
		String[]a=new String[size];
		
		System.out.println("Enter Array elements");
	
		for(int i=0;i<a.length;i++)
		{
			// Storing one by one String in array
			a[i]=sc.next();
		}
		
		// here use another method for finding longest common String
		String s=longestCommonPrefix(a);
		
		System.out.println(s);

	}
	public static  String longestCommonPrefix(String arr[]){
	        
			// first array is sort because in array first position 
			// of string is smaller than all string element in array
	        
	        Arrays.sort(arr);
	        
	        // first string in array is store in another string 
	        // for compare the all other string
	        String s=arr[0];
	        
	        for(int i=1;i<arr.length;i++)
	        {
	            int j=0;
	           String s2=arr[i];
	           String s3="";
	           while(j<s.length())
	           {
	               if(s.charAt(j)==s2.charAt(j))
	               {
	                   s3+=s.charAt(j);
	               }
	               else
	               {
	                   break;
	               }
	               j++;
	           }
	        
	              s=s3;
	        }
	        return s;
	   
	 }
}
