package DatatStructures;

import java.util.Scanner;

import AllDSAMethods.ArrayMethods;
import Array_Implementation.MyArray;

public class ToArrayDataStructure {
	
	Scanner sc=new Scanner(System.in);
	Structure st=new Structure();
	
	public  void toArrayDataStructure() {
		System.out.println("You selected Array data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\nEnter 6 for Back"
				+ "\nEnter7 for terminate programe");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int Z = sc.nextInt();
			switch(Z) {
			case 1: {
				MyArray<Integer> arr= new MyArray<>();
				ArrayMethods arraymethod=new ArrayMethods();
				arraymethod.IntegerArray(arr);
			}
			break;
			case 2:{
				MyArray<Long> arr=new MyArray<>();
				ArrayMethods arraymethod=new ArrayMethods();
				arraymethod.LongArray(arr);
			}
			break;
			case 3:{
				MyArray<Character> arr=new MyArray<>();
				ArrayMethods arraymethod=new ArrayMethods();
				arraymethod.CharacterArray(arr);
			}
			break;
			case 4:{
				MyArray<String> arr=new MyArray<>();
				ArrayMethods arraymethod=new ArrayMethods();
				arraymethod.StringArray(arr);
			}
			break;
			case 5:{
				MyArray<Double> arr=new MyArray<>();
				ArrayMethods arraymethod=new ArrayMethods();
				arraymethod.DoubleArray(arr);
			}
			break;

			case 6:{
				st.structure();
			}break;
			case 7:{
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


}
