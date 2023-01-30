package DatatStructures;

import java.util.Scanner;

import AllDSAMethods.StackMethods;
import Stack_Implementation.MyStack;

public class toSatckData {
	
	Scanner sc=new Scanner(System.in);
	Structure st=new Structure();
	public void toStackDataStructure() {
		System.out.println("You selected Stack data structure");
		System.out.println("Which datatype you store\nEnter 1 for Integer\nEnter 2 for Long\nEnter 3 for Character\nEnter 4 for String\nEnter 5 for Double\nEnter 6 - terminate programe\nEnter 7 - back");
		/*
		 * 1 for Integer 
		 * 2 for Long 
		 * 3 for Character
		 * 4 for String 
		 * 5 for Double
		 */
		do {
			int Z = sc.nextInt();
			//			System.out.println("Enter Stack size:");
			//			int size = sc.nextInt();
			switch(Z) {
			case 1: {
				MyStack<Integer> stack=new MyStack<>();
				StackMethods objStack=new StackMethods();
				objStack.IntegerStack(stack);
			}
			break;
			case 2:{
				MyStack<Long> stack=new MyStack<>();
				StackMethods objStack=new StackMethods();
				objStack.LongStack(stack);
			}
			break;
			case 3:{
				MyStack<Character> stack=new MyStack<>();
				StackMethods objStack=new StackMethods();
				objStack.CharacterStack(stack);
			}
			break;
			case 4:{
				MyStack<String> stack=new MyStack<>();
				StackMethods objStack=new StackMethods();
				objStack.StringStack(stack);
			}
			break;
			case 5:{
				MyStack<Double> stack=new MyStack<>();
				StackMethods objStack=new StackMethods();
				objStack.DoubleStack(stack);
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
			case 7:{
				st.structure();
			}break;
			default :
				System.out.println("choose correct datatype");
				break;
			}
		}while(true);
	}


}
