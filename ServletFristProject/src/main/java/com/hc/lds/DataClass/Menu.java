package com.hc.lds.DataClass;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hc.lds.dataStructures.MyArray;
import com.hc.lds.dataStructures.MyLinkedList;
import com.hc.lds.dataStructures.MyQueue;
import com.hc.lds.dataStructures.MyStack;
public class Menu extends MenuItems{
	//public boolean isLevelOne=true;
	@JsonManagedReference
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
	public void setList(Map<Integer, MenuItems> items) {
		this.listmap=items;
	}
	
	
	
	
	
}