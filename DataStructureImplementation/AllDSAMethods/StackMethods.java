package AllDSAMethods;

import java.util.Scanner;

import DatatStructures.toSatckData;
import Stack_Implementation.MyStack;

public class StackMethods {
	
	Scanner sc=new Scanner(System.in);
	toSatckData sd=new toSatckData();
	public  void DoubleStack(MyStack<Double> stack) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				double y=sc.nextDouble();
				stack.push(y);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}

			}
			break;
			case 2:{
				System.out.println("removed element: "+stack.pop());
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("All Stack element :\n");
				stack.print();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("peek element : "+stack.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("you want to terminate the program enter \n1");
					System.exit(-1);
				}
			}break;
			case 8:{
				sd.toStackDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

	}

	public  void StringStack(MyStack<String> stack) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String y=sc.next();
				stack.push(y);

				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}

			}
			break;
			case 2:{
				System.out.println("removed element: "+stack.pop());
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("All Stack element :\n");
				stack.print();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("peek element : "+stack.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program enter \n1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}
			}break;
			case 8:{
				sd.toStackDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);


	}

	public  void CharacterStack(MyStack<Character> stack) {
		// TODO Auto-generated method stub
		
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				char y=sc.next().charAt(0);
				stack.push(y);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 2:{
				System.out.println("removed element: "+stack.pop());
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("All Stack element :\n");
				stack.print();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("peek element : "+stack.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program enter \n1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				sd.toStackDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
	}
	public void checkChar(String s1,MyStack<Character> stack)
	{
		if(s1.length()>1 || s1.length()==0)
		{
			System.out.println("Please enter correct input");
			CharacterStack(stack);
		}
		char ch=s1.charAt(0);
		stack.push(ch);
		
	}
	public  void LongStack(MyStack<Long> stack) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String s1=sc.next();
				checkInputLong(s1,stack);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 2:{
				System.out.println("removed element: "+stack.pop());
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("All Stack element :\n");
				stack.print();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("peek element : "+stack.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program enter \n1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				sd.toStackDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

	}
	public  void checkInputLong(String s1,MyStack<Long> stack) {
		int cnt=0;
		if(s1.length()>19)
		{
			System.out.println("Please enter correct input");
			LongStack(stack);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			long y=Long.parseLong(s1);
			stack.push(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			LongStack(stack);
		}
	}

	public  void IntegerStack(MyStack<Integer> stack) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");	
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter element ");
				String s1=sc.next();
				checkInput(s1,stack);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 2:{
				System.out.println("removed element: "+stack.pop());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("All Stack element :\n");
				stack.print();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 4:{
				System.out.println("peek element : "+stack.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program enter \n1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				sd.toStackDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

	}

	public  void checkInput(String s1,MyStack<Integer> stack) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			IntegerStack(stack);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			stack.push(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			IntegerStack(stack);
		}
	}


}
