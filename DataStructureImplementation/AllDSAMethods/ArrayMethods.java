package AllDSAMethods;

import java.util.Scanner;

import Array_Implementation.MyArray;
import DatatStructures.ToArrayDataStructure;

public class ArrayMethods {
	
	Scanner sc=new Scanner(System.in);
	ToArrayDataStructure ads=new ToArrayDataStructure();
	public  void DoubleArray(MyArray<Double> arr) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - insertElements\n7 - toString()\n8 - derminate program\n9 - Back");
			int z=sc.nextInt();
			switch(z) {
			case 1: {
				System.out.println("Array length is : "+arr.length());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 2: {
				Object[] b=arr.sort();
				for(Object i:b)
					System.out.print(i+" ");
				System.out.println("\nyou want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}

			break;
			case 3:{
				System.out.println("Enter elemet which you want to find in Array");
				double y=sc.nextDouble();
				System.out.println(arr.contains(y));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 4: {
				System.out.println("enter index number");
				int x=sc.nextInt();
				System.out.println(arr.get(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 5:{
				System.out.println("enter element index ");
				int x=sc.nextInt();
				arr.remove(x);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 6:
			{
				System.out.println("enter element");
				double y=sc.nextDouble();
				arr.ensertElement(y);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7: {
				System.out.println(arr.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			case 8:{
				System.out.println("you want to derminate program if yse then enter 1 else for continue enter 2");
				int y=sc.nextInt();
				if(y==1)
				{
					System.exit(0);
				}
			}
			break;
			case 9:{
				ads.toArrayDataStructure();
			}break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);
	}

	public  void StringArray(MyArray<String> arr) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - insertElements\n7 - toString()\n8 - derminate program\n9 - Back");
			int z=sc.nextInt();
			switch(z) {
			case 1: {
				System.out.println("Array length is : "+arr.length());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 2: {
				Object[] b=arr.sort();
				for(Object i:b)
					System.out.print(i+" ");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}

			break;
			case 3:{
				System.out.println("Enter elemet which you want to find in Array");
				String y=sc.next();
				System.out.println(arr.contains(y));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 4: {
				System.out.println("enter index number");
				int x=sc.nextInt();
				System.out.println(arr.get(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 5:{
				System.out.println("enter element index ");
				int x=sc.nextInt();
				arr.remove(x);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:
			{
				System.out.println("enter element");
				String y=sc.next();
				arr.ensertElement(y);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7: {
				System.out.println(arr.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 8:{
				System.out.println("you want to derminate program if yse then enter 1 else for continue enter 2");
				int y=sc.nextInt();
				if(y==1)
				{
					System.exit(0);
				}
			}
			break;
			case 9:{
				ads.toArrayDataStructure();
			}break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);



	}

	public  void CharacterArray(MyArray<Character> arr) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - insertElements\n7 - toString()\n8 - derminate program\n9 - Back");	
			int z=sc.nextInt();
			switch(z) {
			case 1: {
				System.out.println("Array length is : "+arr.length());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 2: {
				Object[] b=arr.sort();
				for(Object i:b)
					System.out.print(i+" ");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}

			break;
			case 3:{
				System.out.println("Enter elemet which you want to find in Array");
				char y=sc.next().charAt(0);
				System.out.println(arr.contains(y));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 4: {
				System.out.println("enter index number");
				int x=sc.nextInt();
				System.out.println(arr.get(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 5:{
				System.out.println("enter element index ");
				int x=sc.nextInt();
				arr.remove(x);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 6:
			{
				System.out.println("enter element");
				char y=sc.next().charAt(0);
				arr.ensertElement(y);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7: {
				System.out.println(arr.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 8:{
				System.out.println("you want to derminate program if yse then enter 1 else for continue enter 2");
				int y=sc.nextInt();
				if(y==1)
				{
					System.exit(0);
				}
			}
			break;
			case 9:{
				ads.toArrayDataStructure();
			}break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);


	}

	public  void LongArray(MyArray<Long> arr) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - insertElements\n7 - toString()\n8 - derminate program\n9 - Back");
			int z=sc.nextInt();
			switch(z) {
			case 1: {				
				System.out.println("Array length is : "+arr.length());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 2: {
				Object[] b=arr.sort();
				for(Object i:b)
					System.out.print(i+" ");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}

			break;
			case 3:{
				System.out.println("Enter elemet which you want to find in Array");
				long x=sc.nextLong();
				System.out.println(arr.contains(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 4: {
				System.out.println("enter index number");
				int x=sc.nextInt();
				System.out.println(arr.get(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 5:{
				System.out.println("enter element index ");
				int x=sc.nextInt();
				arr.remove(x);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 6:
			{
				System.out.println("enter element");
				String s1=sc.next();
				checkInputAddL(s1,arr);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7: {
				System.out.println(arr.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 8:{
				System.out.println("you want to derminate program if yse then enter 1 else for continue enter 2");
				int y=sc.nextInt();
				if(y==1)
				{
					System.exit(0);
				}
			}
			break;
			case 9:{
				ads.toArrayDataStructure();
			}break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);

	}
	public  void checkInputAddL(String s1,MyArray<Long> arr) {
		int cnt=0;
		if(s1.length()>19)
		{
			System.out.println("Please enter correct input");
			LongArray(arr);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			long y=Integer.parseInt(s1);
			arr.ensertElement(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			LongArray(arr);
		}
	}

	public  void IntegerArray(MyArray<Integer> arr) {

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - insertElements\n7 - toString()\n8 - derminate program\n9 - Back");
			int z=sc.nextInt();
			switch(z) {
			case 1: {
				System.out.println("Array length is : "+arr.length());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 2: {
				Object[] b=arr.sort();
				for(Object i:b)
					System.out.print(i+" ");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}

			break;
			case 3:{
				System.out.println("Enter elemet which you want to find in Array");
				int x=sc.nextInt();
				System.out.println(arr.contains(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 4: {
				System.out.println("enter index number");
				int x=sc.nextInt();
				System.out.println(arr.get(x));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 5:{
				System.out.println("enter element index ");
				int x=sc.nextInt();
				arr.remove(x);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 6:
			{
				System.out.println("enter element");
				String s1=sc.next();
				checkInputAdd(s1,arr);
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7: {
				System.out.println(arr.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
			break;
			case 8:{
				System.out.println("you want to derminate program if yse then enter 1 else for continue enter 2");
				int y=sc.nextInt();
				if(y==1)
				{
					System.exit(0);
				}
			}
			break;
			case 9:{
				ads.toArrayDataStructure();
			}break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);

	}
	public  void checkInputAdd(String s1,MyArray<Integer> arr) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			IntegerArray(arr);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			arr.ensertElement(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			IntegerArray(arr);
		}
	}
}
