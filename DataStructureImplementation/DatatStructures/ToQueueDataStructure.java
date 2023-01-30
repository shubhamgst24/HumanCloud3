package DatatStructures;

import java.util.Scanner;

import AllDSAMethods.QueueMethods;
import Queue_Implementation.MyQueue;

public class ToQueueDataStructure {
	Scanner sc=new Scanner(System.in);
	Structure structure=new Structure();
	public  void toQueueDataStructure() {
		System.out.println("You selected Queue data structure");
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
			switch(Z) {
			case 1: {
				MyQueue<Integer> queue=new MyQueue<>();
				QueueMethods qm=new QueueMethods();
				qm.IntegerQueue(queue);
			}
			break;
			case 2:{
				MyQueue<Long> queue=new MyQueue<>();
				QueueMethods qm=new QueueMethods();
				qm.LongQueue(queue);
			}
			break;
			case 3:{
				MyQueue<Character> queue=new MyQueue<>();
				QueueMethods qm=new QueueMethods();
				qm.CharacterQueue(queue);
			}
			break;
			case 4:{
				MyQueue<String> queue=new MyQueue<>();
				QueueMethods qm=new QueueMethods();
				qm.StringQueue(queue);
			}
			break;
			case 5:{
				MyQueue<Double> queue=new MyQueue<>();
				QueueMethods qm=new QueueMethods();
				qm.DoubleQueue(queue);
			}
			break;
			case 6:{
				System.out.println("if you want to terminate programe yes-1  no-2");
				int a=sc.nextInt();
				if(a==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 7: {
				structure.structure();
			}break;
			default :
				System.out.println("choose correct datatype");
				break;
			}
		}while(true);
	}

}
