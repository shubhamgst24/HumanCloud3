package com.hc.lds;

import com.hc.lds.DataClass.Menu;
import com.hc.lds.DataClass.MenuItems;

public class MenuStore {
	public static final MenuStore INSTANCE = new MenuStore();

	private final Menu mainMenu;
	private final Menu stackMenu;
	private final Menu queueMenu;
	private final Menu ArrayMenu;
	private final Menu ListMenu;


	public Menu getMainMenu() {
		return mainMenu;
	}

	public Menu getStackMenu() {
		return stackMenu;
	}

	public Menu getQueueMenu() {
		return queueMenu;
	}

	public Menu getArrayMenu() {
		return ArrayMenu;
	}

	public Menu getLinkedlistMenu() {
		return ListMenu;
	}

	private MenuStore() {
		mainMenu = new Menu(0, "Data Structures");

		ArrayMenu = new Menu(4, "Array");
		queueMenu = new Menu(2, "Queue");
		ListMenu = new Menu(3, "LinkedList");
		stackMenu = new Menu(1, "Stack");

		mainMenu.addMenuItems(stackMenu);
		mainMenu.addMenuItems(queueMenu);
		mainMenu.addMenuItems(ListMenu);
		mainMenu.addMenuItems(ArrayMenu);

		stackMenu.addMenuItems(new MenuItems(1, "push()"));
		stackMenu.addMenuItems(new MenuItems(2, "pop()"));
		stackMenu.addMenuItems(new MenuItems(3, "print()"));
		stackMenu.addMenuItems(new MenuItems(4, "peek()"));
		stackMenu.addMenuItems(new MenuItems(5, "isEmpty()"));
		stackMenu.addMenuItems(new MenuItems(6, "size()"));
	


		queueMenu.addMenuItems(new MenuItems(1, "enqueue()"));
		queueMenu.addMenuItems(new MenuItems(2, "dequeue()"));
		queueMenu.addMenuItems(new MenuItems(3, "display()"));
		queueMenu.addMenuItems(new MenuItems(4, "peek()"));
		queueMenu.addMenuItems(new MenuItems(5, "isEmpty()"));
		queueMenu.addMenuItems(new MenuItems(6, "size()"));
	


		ListMenu.addMenuItems(new MenuItems(1, "add()"));
		ListMenu.addMenuItems(new MenuItems(2, "toString()"));
		ListMenu.addMenuItems(new MenuItems(3, "addAt()"));
		ListMenu.addMenuItems(new MenuItems(4, "remove()"));
		ListMenu.addMenuItems(new MenuItems(5, "get()"));


		ArrayMenu.addMenuItems(new MenuItems(1, "length()"));
		ArrayMenu.addMenuItems(new MenuItems(2, "sort()"));
		ArrayMenu.addMenuItems(new MenuItems(3, "get()"));
		ArrayMenu.addMenuItems(new MenuItems(4, "remove()"));
		ArrayMenu.addMenuItems(new MenuItems(5, "insertElements()"));
	

	}


}
