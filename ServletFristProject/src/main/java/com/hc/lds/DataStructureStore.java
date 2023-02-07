package com.hc.lds;

import com.hc.lds.dataStructures.MyArray;
import com.hc.lds.dataStructures.MyLinkedList;
import com.hc.lds.dataStructures.MyQueue;
import com.hc.lds.dataStructures.MyStack;

public class DataStructureStore {

	public static final DataStructureStore INSTANCE = new DataStructureStore();
	
	private final static MyStack stack = new MyStack();
	private final static MyArray array = new MyArray();
	private final static MyQueue queue = new MyQueue();
	private final static MyLinkedList<Integer> linkedlist = new MyLinkedList<>();
	
	private DataStructureStore() {
		
	}

	public static MyStack getStack() {
		return stack;
	}

	public static MyArray getArray() {
		return array;
	}

	public static MyQueue getQueue() {
		return queue;
	}

	public static MyLinkedList<Integer> getLinkedlist() {
		return linkedlist;
	}
}
