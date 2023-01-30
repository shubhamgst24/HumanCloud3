package DatatStructures;

import java.util.Scanner;

import AllDSAMethods.ArrayListMethods;
import ArrayList_Implementation.MyArrayList;

public class ToArrayListDataStructure {
	
	Scanner sc=new Scanner(System.in);
	Structure st=new Structure();

	public  void toArrayListDataStructure() {
		System.out.println("You selected ArrayList data structure");
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
				MyArrayList<Integer> list=new MyArrayList<>();
				ArrayListMethods alm=new ArrayListMethods();
				alm.IntegerList(list);
			}

			break;
			case 2:{
				MyArrayList<Long> list=new MyArrayList<>();
				ArrayListMethods alm=new ArrayListMethods();
				alm.LongList(list);
			}

			break;
			case 3:
				MyArrayList<Character> list=new MyArrayList<>();
				ArrayListMethods alm=new ArrayListMethods();
				alm.CharacterList(list);

				break;
			case 4:{
				MyArrayList<String> list1=new MyArrayList<>();
				ArrayListMethods alm1=new ArrayListMethods();
				alm1.StringList(list1);
			}

			break;
			case 5:{
				MyArrayList<Double> list1=new MyArrayList<>();
				ArrayListMethods alm1=new ArrayListMethods();
				alm1.DoubleList(list1);
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
			case 7: {
				st.structure();
			}break;
			default:{
				System.out.println("choose correct datatype");
			}
			break;
			}


		} while (true);

	}


}
