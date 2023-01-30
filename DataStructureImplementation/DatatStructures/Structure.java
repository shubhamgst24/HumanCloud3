package DatatStructures;

import java.util.Scanner;

public class Structure {
	Scanner sc=new Scanner(System.in);

	public  void structure() {
		System.out.println("****Select DatatStructure which you want****\n\n");
		System.out.println("Enter 1 for Array\nEnter 2 for ArrayList\nEnter 3 for LinkedList\nEnter 4 for Queue\nEnter 5 for Stack\n");

		/*
		 * 1 for Array 2 for ArrayList 3 for LinkedList 4 for Queue 5 for Stack
		 */
		do {
			int Z = sc.nextInt();
			switch (Z) {
			case 1:{
				ToArrayDataStructure ads=new ToArrayDataStructure();
				ads.toArrayDataStructure();
				}
				break;
			case 2:{
				ToArrayListDataStructure ald=new ToArrayListDataStructure();
				ald.toArrayListDataStructure();
			}
			break;
			case 3:{
				ToLinkedListDataStructure lds=new ToLinkedListDataStructure();
				lds.toLinkedListDataStructure();
			}
			break;
			case 4:{
				ToQueueDataStructure qd=new ToQueueDataStructure();
				qd.toQueueDataStructure();
			}
			break;
			case 5:{
				toSatckData sd=new toSatckData();
				sd.toStackDataStructure();
			}
			break;
			default:
				System.out.println("give correct input");
				break;
			}
		}while(true);
	}





}
