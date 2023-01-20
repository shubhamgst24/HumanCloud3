package DatatStructures;

import java.util.Scanner;

import ArrayList_Implementation.MyArrayList;
import Array_Implementation.MyArray;
import LinkedList_Implementation.MyLinkedList;
import Queue_Implementation.MyQueue;
import Stack_Implementation.MyStack;

public class MyClass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Structure();
	}

	private static void Structure() {

//		Scanner sc=new Scanner(System.in);
		System.out.println("****Select DatatStructure which you want****\n\n");
		System.out.println(
				"Enter 1 for Array\nEnter 2 for ArrayList\nEnter 3 for LinkedList\nEnter 4 for Queue\nEnter 5 for Stack\n");
		
		/*
		 * 1 for Array 2 for ArrayList 3 for LinkedList 4 for Queue 5 for Stack
		 */
		do {
			int Z = sc.nextInt();
			switch (Z) {
			case 1:
				toArrayDataStructure();
				break;
			case 2:
				toArrayListDataStructure();
				break;
			case 3:
				toLinkedListDataStructure();
				break;
			case 4:
				toQueueDataStructure();
				break;
			case 5:
				toStackDataStructure();
				break;
			default:
				System.out.println("give correct input");
				break;
				}
			}while(true);
	}

	private static void toArrayDataStructure() {
		System.out.println("You selected Array data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\nEnter6 for terminate programe");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int Z = sc.nextInt();
			System.out.println("Enter Array size:");
			int size = sc.nextInt();
			switch(Z) {
			case 1: {
				MyArray<Integer> arr=new MyArray<>(size);
				methodsInteger(arr);
				}
				break;
			case 2:{
				MyArray<Long> arr=new MyArray<>(size);
				methodsLong(arr);
			}
				break;
			case 3:{
				MyArray<Character> arr=new MyArray<>(size);
				methodsCharacter(arr);
			}
				break;
			case 4:{
				MyArray<String> arr=new MyArray<>(size);
				methodsString(arr);
			}
				break;
			case 5:{
				MyArray<Double> arr=new MyArray<>(size);
				methodsDouble(arr);
			}
				break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.exit(-1);
				}
				
			}break;
			default :
				System.out.println("choose correct datatype");
				break;
			}
			
		} while (true);
		
	}

	private static void methodsDouble(MyArray<Double> arr) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - pushAt()\n7 - toString()\n8 - push()");
		do {
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
				System.out.println("enter index");
				int x=sc.nextInt();
				System.out.println("enter element");
				double y=sc.nextDouble();
				arr.pushAt(x, y);
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
			case 8: {
				int i=0;
				while(i<arr.length())
				{
				System.out.println("enter element : ");
				double y=sc.nextDouble();
				arr.pushAt(i, y);
				i++;
				}
				System.out.println("Array is full");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated");
					System.exit(-1);
				}else
				{
					System.out.println("enter again method number");
				}
			}
				break;
			default:
				System.out.println("Enter correct method");
			}
		}while(true);


		
	}

	private static void methodsString(MyArray<String> arr) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - pushAt()\n7 - toString()\n8 - push()");
		do {
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
				System.out.println("enter index");
				int x=sc.nextInt();
				System.out.println("enter element");
				String y=sc.next();
				arr.pushAt(x, y);
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
			case 8: {
				int i=0;
				while(i<arr.length())
				{
				System.out.println("enter element : ");
				String y=sc.next();
				arr.pushAt(i, y);
				i++;
				}
				System.out.println("Array is full");
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
			default:
				System.out.println("Enter correct method");
			}
		}while(true);


		
	}

	private static void methodsCharacter(MyArray<Character> arr) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - pushAt()\n7 - toString()\n8 - push()");
		do {
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
				System.out.println("enter index");
				int x=sc.nextInt();
				System.out.println("enter element");
				char y=sc.next().charAt(0);
				arr.pushAt(x, y);
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
			case 8: {
				int i=0;
				while(i<arr.length())
				{
				System.out.println("enter element : ");
				char y=sc.next().charAt(0);
				arr.pushAt(i, y);
				i++;
				}
				System.out.println("Array is full");
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
			default:
				System.out.println("Enter correct method");
			}
		}while(true);

		
	}

	private static void methodsLong(MyArray<Long> arr) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - pushAt()\n7 - toString()\n8 - push()");
		do {
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
				System.out.println("enter index");
				int x=sc.nextInt();
				System.out.println("enter element");
				long y=sc.nextLong();
				arr.pushAt(x, y);
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
			case 8: {
				int i=0;
				while(i<arr.length())
				{
				System.out.println("enter element : ");
				long y=sc.nextLong();
				arr.pushAt(i, y);
				i++;
				}
				System.out.println("Array is full");
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
			default:
				System.out.println("Enter correct method");
			}
		}while(true);
		

		
	}

	private static void methodsInteger(MyArray<Integer> arr) {
		System.out.println("which operation you want to perform");
		System.out.println("1 - length()\n2 - sort()\n3 - contains()\n4 - get()\n5 - remove()\n6 - pushAt()\n7 - toString()\n8 - push()");
		do {
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
				System.out.println("enter index");
				int x=sc.nextInt();
				System.out.println("enter element");
				int y=sc.nextInt();
				arr.pushAt(x, y);
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
			case 8: {
				int i=0;
				while(i<arr.length())
				{
				System.out.println("enter element : ");
				int y=sc.nextInt();
				arr.pushAt(i, y);
				i++;
				}
				System.out.println("Array is full");
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
			default:
				System.out.println("Enter correct method");
			}
		}while(true);
		
	}

	private static void toArrayListDataStructure() {
		System.out.println("You selected ArrayList data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\n");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int z = sc.nextInt();
			switch (z) {
			case 1:{
				MyArrayList<Integer> list=new MyArrayList<>();
				IntegerList(list);
			}
				
				break;
			case 2:{
				MyArrayList<Long> list=new MyArrayList<>();
				LongList(list);
			}
				
				break;
			case 3:
				MyArrayList<Character> list=new MyArrayList<>();
				CharacterList(list);
				
				break;
			case 4:{
				MyArrayList<String> list1=new MyArrayList<>();
				StringList(list1);
			}
				
				break;
			case 5:{
				MyArrayList<Double> list1=new MyArrayList<>();
				DoubleList(list1);
			}
				
				break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.exit(-1);
				}}
				break;

			default:{
						System.out.println("choose correct datatype");
					}
				break;
			}
			
			
		} while (true);

	}

	private static void DoubleList(MyArrayList<Double> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

	}

	private static void StringList(MyArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void CharacterList(MyArrayList<Character> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void LongList(MyArrayList<Long> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
				long element=sc.nextLong();
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void IntegerList(MyArrayList<Integer> list) {
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				int y=sc.nextInt();
				list.add(y);
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
				int element=sc.nextInt();
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);
		
	}

	private static void toLinkedListDataStructure() {
		System.out.println("You selected LinkedList data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\n");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int z = sc.nextInt();
			switch (z) {
			case 1:{
				MyLinkedList<Integer> list=new MyLinkedList<>();
				IntegerLinkedList(list);
			}
				
				break;
			case 2:{
				MyLinkedList<Long> list=new MyLinkedList<>();
				LongLinkedList(list);
			}
				
				break;
			case 3:
				MyLinkedList<Character> list=new MyLinkedList<>();
				CharacterLinkedList(list);
				
				break;
			case 4:{
				MyLinkedList<String> list1=new MyLinkedList<>();
				StringLinkedList(list1);
			}
				
				break;
			case 5:{
				MyLinkedList<Double> list1=new MyLinkedList<>();
				DoubleLinkedList(list1);
			}
				
				break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.exit(-1);
				}}
				break;

			default:{
						System.out.println("choose correct datatype");
					}
				break;
			}
		}while(true);


	}

	private static void DoubleLinkedList(MyLinkedList<Double> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

	}

	private static void StringLinkedList(MyLinkedList<String> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void CharacterLinkedList(MyLinkedList<Character> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void LongLinkedList(MyLinkedList<Long> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
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
				long element=sc.nextLong();
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

	}

	private static void IntegerLinkedList(MyLinkedList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - add()\n2 - addAt()\n3 - get()\n4 - contains()\n5 - remove()\n6 - toString()\n7 - terminate the programe");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				int y=sc.nextInt();
				list.add(y);
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
				int element=sc.nextInt();
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
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
				
		} while (true);

		
	}

	private static void toQueueDataStructure() {
		System.out.println("You selected Queue data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\n");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int Z = sc.nextInt();
			System.out.println("Enter Queue size:");
			int size = sc.nextInt();
			switch(Z) {
			case 1: {
				MyQueue<Integer> queue=new MyQueue<>(size);
				IntegerQueue(queue);
				}
				break;
			case 2:{
				MyQueue<Long> queue=new MyQueue<>(size);
				LongQueue(queue);
			}
				break;
			case 3:{
				MyQueue<Character> queue=new MyQueue<>(size);
				CharacterQueue(queue);
			}
				break;
			case 4:{
				MyQueue<String> queue=new MyQueue<>(size);
				StringQueue(queue);
			}
				break;
			case 5:{
				MyQueue<Double> queue=new MyQueue<>(size);
				DoubleQueue(queue);
			}
				break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.exit(-1);
				}
			}break;
			default :
				System.out.println("choose correct datatype");
				break;
			}
			}while(true);
	}

	private static void DoubleQueue(MyQueue<Double> queue) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				double y=sc.nextDouble();
				queue.enqueue(y);
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
				System.out.println("removed element: "+queue.dequeue());
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
				System.out.println("All Queue element :\n");
				queue.display();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 4:{
				System.out.println("peek element : "+queue.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+queue.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		

		
	}

	private static void StringQueue(MyQueue<String> queue) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String y=sc.next();
				queue.enqueue(y);
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
				System.out.println("removed element: "+queue.dequeue());
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
				System.out.println("All Queue element :\n");
				queue.display();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 4:{
				System.out.println("peek element : "+queue.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+queue.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		

		
	}

	private static void CharacterQueue(MyQueue<Character> queue) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				char y=sc.next().charAt(0);
				queue.enqueue(y);
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
				System.out.println("removed element: "+queue.dequeue());
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
				System.out.println("All Queue element :\n");
				queue.display();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 4:{
				System.out.println("peek element : "+queue.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+queue.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		

		
	}

	private static void LongQueue(MyQueue<Long> queue) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				long y=sc.nextLong();
				queue.enqueue(y);
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
				System.out.println("removed element: "+queue.dequeue());
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
				System.out.println("All Queue element :\n");
				queue.display();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 4:{
				System.out.println("peek element : "+queue.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+queue.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		

		
	}

	private static void IntegerQueue(MyQueue<Integer> queue) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				int y=sc.nextInt();
				queue.enqueue(y);
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
				System.out.println("removed element: "+queue.dequeue());
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
				System.out.println("All Queue element :\n");
				queue.display();
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 4:{
				System.out.println("peek element : "+queue.peek());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+queue.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		
	}

	private static void toStackDataStructure() {
		System.out.println("You selected Stack data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\n");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int Z = sc.nextInt();
			System.out.println("Enter Stack size:");
			int size = sc.nextInt();
			switch(Z) {
			case 1: {
				MyStack<Integer> stack=new MyStack<>(size);
				IntegerStack(stack);
				}
				break;
			case 2:{
				MyStack<Long> stack=new MyStack<>(size);
				LongStack(stack);
			}
				break;
			case 3:{
				MyStack<Character> stack=new MyStack<>(size);
				CharacterStack(stack);
			}
				break;
			case 4:{
				MyStack<String> stack=new MyStack<>(size);
				StringStack(stack);
			}
				break;
			case 5:{
				MyStack<Double> stack=new MyStack<>(size);
				DoubleStack(stack);
			}
				break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.exit(-1);
				}
			}break;
			default :
				System.out.println("choose correct datatype");
				break;
			}
			}while(true);


	}

	private static void DoubleStack(MyStack<Double> stack) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
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
				System.out.println(stack.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

	}

	private static void StringStack(MyStack<String> stack) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String y=sc.next();
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
				System.out.println(stack.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

		
	}

	private static void CharacterStack(MyStack<Character> stack) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
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
				System.out.println(stack.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

		
	}

	private static void LongStack(MyStack<Long> stack) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				long y=sc.nextLong();
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
				System.out.println(stack.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

		
	}

	private static void IntegerStack(MyStack<Integer> stack) {
		// TODO Auto-generated method stub
		System.out.println("which operation you want to perform");
		System.out.println("1 - push()\n2 - pop()\n3 - print()\n4 - peek()\n5 - isFull()\n6 - isEmpty()\n7 - size()\n0 - terminate program");
		do {
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				int y=sc.nextInt();
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
				System.out.println(stack.isFull());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 6:{
				System.out.println(stack.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}

			}
				break;
			case 7:{
				System.out.println("Queue size is : "+stack.size());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
				break;
			case 8:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.exit(-1);
				}
			}
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
		

		
		
	}

}
