package DatatStructures;

import java.util.Scanner;

import AllDSAMethods.LinkedListMethods;
import LinkedList_Implementation.MyLinkedList;

public class ToLinkedListDataStructure {
	Scanner sc=new Scanner(System.in);
	Structure st=new Structure();
	public  void toLinkedListDataStructure() {
		System.out.println("You selected LinkedList data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\nEnter 6 - terminate programe\nEnter 7 - back");
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
				LinkedListMethods llm=new LinkedListMethods();
				llm.IntegerLinkedList(list);
			}

			break;
			case 2:{
				MyLinkedList<Long> list=new MyLinkedList<>();
				LinkedListMethods llm=new LinkedListMethods();
				llm.LongLinkedList(list);
			}

			break;
			case 3:
				MyLinkedList<Character> list=new MyLinkedList<>();
				LinkedListMethods llm=new LinkedListMethods();
				llm.CharacterLinkedList(list);

				break;
			case 4:{
				MyLinkedList<String> list1=new MyLinkedList<>();
				LinkedListMethods llm1=new LinkedListMethods();
				llm1.StringLinkedList(list1);
			}

			break;
			case 5:{
				MyLinkedList<Double> list1=new MyLinkedList<>();
				LinkedListMethods llm1=new LinkedListMethods();
				llm1.DoubleLinkedList(list1);
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
			case 7:{
				st.structure();
			}break;
			default:{
				System.out.println("choose correct datatype");
			}
			break;
			}
		}while(true);


	}


}
