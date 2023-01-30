package AllDSAMethods;

import java.util.Scanner;

import DatatStructures.ToLinkedListDataStructure;
import LinkedList_Implementation.MyLinkedList;

public class LinkedListMethods {
	
	Scanner sc=new Scanner(System.in);
	ToLinkedListDataStructure lds=new ToLinkedListDataStructure();
	//CheckListDataType check=new CheckListDataType();
	public  void DoubleLinkedList(MyLinkedList<Double> list) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				double element=sc.nextDouble();
				list.add(element);
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
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Enter the element");
				double element=sc.nextDouble();
				list.addAt(ind, element);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Object at index "+ind+"is : "+list.get(ind));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("Enter the Object ");
				double element=sc.nextDouble();
				System.out.println("Object presnt : "+list.contains(element));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 5:{
				System.out.println("Enter the index of object which you want to remove");
				int ind=sc.nextInt();
				list.remove(ind);
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:{
				System.out.println("All ArrayList:\n"+list.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				lds.toLinkedListDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}

		} while (true);

	}

	public  void StringLinkedList(MyLinkedList<String> list) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String element=sc.next();
				list.add(element);
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
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Enter the element");
				String element=sc.next();
				list.addAt(ind, element);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Object at index "+ind+"is : "+list.get(ind));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("Enter the Object ");
				String element=sc.next();
				System.out.println("Object presnt : "+list.contains(element));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 5:{
				System.out.println("Enter the index of object which you want to remove");
				int ind=sc.nextInt();
				list.remove(ind);
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:{
				System.out.println("All ArrayList:\n"+list.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				lds.toLinkedListDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}

		} while (true);


	}

	public  void CharacterLinkedList(MyLinkedList<Character> list) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				char element=sc.next().charAt(0);
				list.add(element);
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
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Enter the element");
				char element=sc.next().charAt(0);
				list.addAt(ind, element);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Object at index "+ind+"is : "+list.get(ind));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("Enter the Object ");
				char element=sc.next().charAt(0);
				System.out.println("Object presnt : "+list.contains(element));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 5:{
				System.out.println("Enter the index of object which you want to remove");
				int ind=sc.nextInt();
				list.remove(ind);
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:{
				System.out.println("All ArrayList:\n"+list.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				lds.toLinkedListDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}

		} while (true);


	}

	public  void LongLinkedList(MyLinkedList<Long> list) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				long element=sc.nextLong();
				list.add(element);
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
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Enter the element");
				String s1=sc.next();
				checkcheckInputAddAtL(ind,s1,list);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Object at index "+ind+"is : "+list.get(ind));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("Enter the Object ");
				long element=sc.nextLong();
				System.out.println("Object presnt : "+list.contains(element));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 5:{
				System.out.println("Enter the index of object which you want to remove");
				int ind=sc.nextInt();
				list.remove(ind);
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:{
				System.out.println("All LinkedList:\n"+list.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				lds.toLinkedListDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}

		} while (true);

	}
	public  void checkInputLong(String s1,MyLinkedList<Long> list) {
		int cnt=0;
		if(s1.length()>19)
		{
			System.out.println("Please enter correct input");
			LongLinkedList(list);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			long y=Long.parseLong(s1);
			list.add(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			LongLinkedList(list);
		}
	}
	public void checkcheckInputAddAtL(int ind, String s1, MyLinkedList<Long> list) {
		
		
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			LongLinkedList(list);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' || s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			long y=Integer.parseInt(s1);
			list.addAt(ind, y);
		}
		else
		{
			System.out.println("Please enter correct input");
			LongLinkedList(list);
		}
	}

	public  void IntegerLinkedList(MyLinkedList<Integer> list) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String s1=sc.next();
				checkInputAdd(s1,list);
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
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Enter the element");
				String s1=sc.next();
				checkcheckInputAddAt(ind,s1,list);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 3:{
				System.out.println("Enter the index");
				int ind=sc.nextInt();
				System.out.println("Object at index "+ind+"is : "+list.get(ind));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 4:{
				System.out.println("Enter the Object ");
				int y=sc.nextInt();
				System.out.println("Object presnt : "+list.contains(y));
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 5:{
				System.out.println("Enter the index of object which you want to remove");
				int ind=sc.nextInt();
				list.remove(ind);
				System.out.println("remove successfully...");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 6:{
				System.out.println("All ArrayList:\n"+list.toString());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 8:{
				lds.toLinkedListDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}

		} while (true);

	}
	public  void checkInputAdd(String s1,MyLinkedList<Integer> list) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			IntegerLinkedList(list);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			list.add(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			IntegerLinkedList(list);
		}
	}
	public void checkcheckInputAddAt(int ind, String s1, MyLinkedList<Integer> list) {
		
		
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			IntegerLinkedList(list);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' || s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			list.addAt(ind, y);
		}
		else
		{
			System.out.println("Please enter correct input");
			IntegerLinkedList(list);
		}
	}

	
	


}
