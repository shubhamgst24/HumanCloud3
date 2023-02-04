package menu_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import allDataSructures.MyArray;
import allDataSructures.MyLinkedList;
import allDataSructures.MyQueue;
import allDataSructures.MyStack;

public class Menu extends MenuItems{
	
	public boolean isLevelOne=true;
	
	Map<Integer, MenuItems> listmap=new TreeMap<>();
	
	Scanner sc=new Scanner(System.in);
	static MyStack me=new MyStack();
	static MyQueue q=new MyQueue();
	static MyLinkedList<Integer> linkedlist=new MyLinkedList<>();
	static MyArray arr=new MyArray();

	public Menu() {
		super();
	}

	public Menu(int i,String string) {
		super(i,string);
	}
	public Map<Integer, MenuItems> getList() {
		return listmap;
	}
	public void addMenuItems(MenuItems items) {
		items.setParent(this);
		int t=items.getId();
		listmap.put(t, items);
	}
	public void back(MenuItems m)
	{
		if(m.getParent()!=null)
		{
			display();
		}
		else {
			System.exit(0);
		}
	}
	public void display() {
		if(isLevelOne) {
			isLevelOne=false;
			listmap.values().forEach(e->e.displayMI());
			isLevelOne=true;
			System.out.println("Enter Your choice : ###");
			if(sc.hasNextInt())
			{
			int choice = sc.nextInt();
			if(choice==0) {
				System.out.println("Enter Valid Number");
				display();
			}
			else 
			{
				Menu mi=(Menu) listmap.get(choice);
				if(mi==null) {
					System.out.println("Invalid choice");
					display();
				}else if(mi instanceof Menu) {
					//((Menu) mi).getList().forEach(e -> e.displayMI());
					select(mi);
				}
			}}
			else {
				MenuDriver.structure();
			}
		}
		else {
			display();
		}
	}
	@SuppressWarnings("unchecked")
	private void select(Menu mi) {
		mi.getList().entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue().getName()));
		String op=mi.getName();
		//System.out.println(op);
		String ds=mi.getParent().getName();
		//System.out.println(ds);
		switch(ds) {

		case "Stack":
			stackMethod(me, mi);
			break;

		case "Queue":
			QueueMethods(q,mi);
			break;

		case "LinkedList" : 
			linkedListMethods(linkedlist,mi);
			break;
		case "Array" : 
			arrayMethods(arr,mi);
			break;
		}

	}
	//################################ Stack Method ##################################

	public void stackMethod(MyStack stack,Menu mi) {
		int z=sc.nextInt();
		switch(z) {
		case 1:{
			System.out.println("Enter element ");
			String s1=sc.next();
			checkInput(s1,stack,mi);
			select(mi);
		}
		break;
		case 2:{
			System.out.println("removed element: "+stack.pop());
			select(mi);
		}
		break;
		case 3:{
			System.out.println("All Stack element :\n");
			stack.print();
			select(mi);
		}
		break;
		case 4:{
			System.out.println("peek element : "+stack.peek());
			select(mi);
		}break;
		case 5:{
			System.out.println(stack.isEmpty());
			select(mi);
		}
		break;
		case 6:{
			System.out.println("Queue size is : "+stack.size());
			select(mi);
		}
		break;
		case 7:{
			MenuDriver.structure();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}
	}
	public  void checkInput(String s1,MyStack stack,Menu mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			stackMethod(stack,mi);
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
			System.out.println("Element added successfully...\n");
		}
		else
		{
			System.out.println("Please enter correct input");
			stackMethod(stack,mi);
		}
	}

	//################################### Queue Methods ######################################


	public  void QueueMethods(MyQueue queue,Menu mi) {

		int z=sc.nextInt();
		switch(z) {
		case 1:{
			System.out.println("Enter the element : ");
			String s1=sc.next();
			checkInput(s1,queue,mi);
			System.out.println("element is added sucessfully\n");
			select(mi);

		}
		break;
		case 2:{
			System.out.println("removed element: "+queue.dequeue());
			System.out.println("remove successfully...");
			select(mi);

		}
		break;
		case 3:{
			System.out.println("All Queue element :\n");
			queue.display();
			System.out.println();
			select(mi);

		}
		break;
		case 4:{
			System.out.println("peek element : "+queue.peek());
			select(mi);

		}break;
		case 5:{
			System.out.println(queue.isEmpty());
			select(mi);

		}
		break;
		case 6:{
			System.out.println("Queue size is : "+queue.getSize());
			select(mi);
		}
		break;
		case 7:{
			MenuDriver.structure();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}

	}
	public  void checkInput(String s1,MyQueue queue,Menu mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			QueueMethods(queue,mi);
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
			QueueMethods(queue,mi);
		}
	}

	//######################################## linkedListMethods #################################

	private void linkedListMethods(MyLinkedList<Integer> linkedlist2, Menu mi) {

		int z=sc.nextInt();
		switch(z) {
		case 1:{
			System.out.println("Enter the element : ");
			String s1=sc.next();
			checkInputAdd(s1,linkedlist2,mi);
			System.out.println("element is added sucessfully");
			select(mi);
		}
		break;
		case 3:{
			System.out.println("Enter the index");
			int ind=sc.nextInt();
			System.out.println("Enter the element");
			String s1=sc.next();
			checkcheckInputAddAt(ind,s1,linkedlist2,mi);
			System.out.println("element is added sucessfully");
			select(mi);
		}
		break;
		case 5:{
			System.out.println("Enter the index");
			int ind=sc.nextInt();
			System.out.println("Object at index "+ind+"is : "+linkedlist2.get(ind));
			select(mi);
		}
		break;
		case 4:{
			System.out.println("Enter the index of object which you want to remove");
			int ind=sc.nextInt();
			linkedlist2.remove(ind);
			System.out.println("remove successfully...");
			select(mi);

		}
		break;
		case 2:{
			System.out.println("All ListList:\n"+linkedlist2.toString());	
			select(mi);
		}
		break;
		case 6:{
			MenuDriver.structure();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}
	}
	public  void checkInputAdd(String s1,MyLinkedList<Integer> linkedlist2, Menu mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			linkedListMethods(linkedlist2,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			linkedlist2.add(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			linkedListMethods(linkedlist2,mi);
		}
	}
	public void checkcheckInputAddAt(int ind1, String s11, MyLinkedList<Integer> linkedlist2,Menu mi) {


		int cnt=0;
		if(s11.length()>10)
		{
			System.out.println("Please enter correct input");
			linkedListMethods(linkedlist2,mi);
		}
		for(int i=0;i<s11.length();i++)
		{
			if(s11.charAt(i)>='0' || s11.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s11.length())
		{
			int y=Integer.parseInt(s11);
			linkedlist2.addAt(ind1, y);
		}
		else
		{
			System.out.println("Please enter correct input");
			linkedListMethods(linkedlist2,mi);
		}
	}

	// ####################################### Array Method ##############################

	private void arrayMethods(MyArray arr, Menu mi) {

		int z=sc.nextInt();
		switch(z) {
		case 1: {
			System.out.println("Array length is : "+arr.length());
			select(mi);
		}
		break;
		case 2: {
			int[] b=arr.sort();
			for(Object i:b)
				System.out.print(i+" ");
			select(mi);
		}

		break;
		case 3: {
			System.out.println("enter index number");
			int x=sc.nextInt();
			System.out.println(arr.get(x));
			select(mi);
		}
		break;
		case 4:{
			System.out.println("enter element index ");
			int x=sc.nextInt();
			boolean ss=arr.remove(x);
			if(ss)
			System.out.println("Removed Successfully...\n");
			else
			System.out.println("element not removed");
			select(mi);
		}
		break;
		case 5:
		{
			System.out.println("enter element");
			String s1=sc.next();
			checkInputAdd(s1,arr,mi);
			select(mi);
		}
		break;
		case 6: {
			System.out.println(arr.toString());
			select(mi);
		}
		break;
		case 7:{
			MenuDriver.structure();
		}break;
		default:
			System.out.println("Enter correct method....\n");
			select(mi);
			break;
		}

	}
	public  void checkInputAdd(String s1,MyArray arr,Menu mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			arrayMethods(arr,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			arr.ensertElement(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			arrayMethods(arr,mi);
		}
	}





}