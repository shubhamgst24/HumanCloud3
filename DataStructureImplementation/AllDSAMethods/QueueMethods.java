package AllDSAMethods;

import java.util.Scanner;

import DatatStructures.ToQueueDataStructure;
import Queue_Implementation.MyQueue;

public class QueueMethods {
	Scanner sc=new Scanner(System.in);
	ToQueueDataStructure qd=new ToQueueDataStructure();
	public  void DoubleQueue(MyQueue<Double> queue) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+queue.getSize());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 8:{
				qd.toQueueDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);



	}

	public  void StringQueue(MyQueue<String> queue) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");			int z=sc.nextInt();
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+queue.getSize());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 8:{
				qd.toQueueDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);



	}

	public  void CharacterQueue(MyQueue<Character> queue) {
		// TODO Auto-generated method stub
		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");	
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+queue.getSize());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 8:{
				qd.toQueueDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);



	}

	public  void LongQueue(MyQueue<Long> queue) {
		// TODO Auto-generated method stub

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+queue.getSize());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 8:{
				qd.toQueueDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);
	}
	
	public  void checkInputLong(String s1,MyQueue<Long> queue) {
		int cnt=0;
		if(s1.length()>19)
		{
			System.out.println("Please enter correct input");
			LongQueue(queue);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			long y=Long.parseLong(s1);
			queue.enqueue(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			LongQueue(queue);
		}
	}

	public  void IntegerQueue(MyQueue<Integer> queue) {
		

		do {
			System.out.println("which operation you want to perform");
			System.out.println("1 - enqueue()\n2 - dequeue()\n3 - display()\n4 - peek()\n5 - isEmpty()\n6 - size()\n7 - terminate program\n8 - back");
			int z=sc.nextInt();
			switch(z) {
			case 1:{
				System.out.println("Enter the element : ");
				String s1=sc.next();
				checkInput(s1,queue);
				System.out.println("element is added sucessfully");
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
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
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 5:{
				System.out.println(queue.isEmpty());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}

			}
			break;
			case 6:{
				System.out.println("Queue size is : "+queue.getSize());
				System.out.println("you want to continue operations \nyes-0\nno-1");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}
			break;
			case 7:{
				System.out.println("you want to terminate the program");
				int te=sc.nextInt();
				if(te==1)
				{
					System.out.println("programe terminated.....");
					System.exit(-1);
				}
			}break;
			case 8:{
				qd.toQueueDataStructure();
			}break;
			default :
				System.out.println("choose correct method ");
				break;
			}
		}while(true);

	}
	public  void checkInput(String s1,MyQueue<Integer> queue) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			IntegerQueue(queue);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			queue.enqueue(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			IntegerQueue(queue);
		}
	}

}
