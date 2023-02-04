package menu_operations;
public class MenuDriver {
	public static void main(String[] args) {
		structure();
	}
	public static void structure(){
		Menu mainMenu = new Menu(0, "Data Structures");
		
		Menu ArrayMenu = new Menu(4, "Array");
		Menu qMenu = new Menu(2, "Queue");
		Menu ListMenu = new Menu(3, "LinkedList");
		Menu stackMenu = new Menu(1, "Stack");
		
		mainMenu.addMenuItems(stackMenu);
		mainMenu.addMenuItems(qMenu);
		mainMenu.addMenuItems(ListMenu);
		mainMenu.addMenuItems(ArrayMenu);

		stackMenu.addMenuItems(new MenuItems(1, "push()"));
		stackMenu.addMenuItems(new MenuItems(2, "pop()"));
		stackMenu.addMenuItems(new MenuItems(3, "print()"));
		stackMenu.addMenuItems(new MenuItems(4, "peek()"));
		stackMenu.addMenuItems(new MenuItems(5, "isEmpty()"));
		stackMenu.addMenuItems(new MenuItems(6, "size()"));
		stackMenu.addMenuItems(new MenuItems(7, "Back)"));
		stackMenu.setParent(stackMenu);
		
		
		qMenu.addMenuItems(new MenuItems(1, "enqueue()"));
		qMenu.addMenuItems(new MenuItems(2, "dequeue()"));
		qMenu.addMenuItems(new MenuItems(3, "display()"));
		qMenu.addMenuItems(new MenuItems(4, "peek()"));
		qMenu.addMenuItems(new MenuItems(5, "isEmpty()"));
		qMenu.addMenuItems(new MenuItems(6, "size()"));
		qMenu.addMenuItems(new MenuItems(7, "Back"));
		qMenu.setParent(qMenu);
		
		
		ListMenu.addMenuItems(new MenuItems(1, "add()"));
		ListMenu.addMenuItems(new MenuItems(2, "toString()"));
		ListMenu.addMenuItems(new MenuItems(3, "addAt()"));
		ListMenu.addMenuItems(new MenuItems(4, "remove()"));
		ListMenu.addMenuItems(new MenuItems(5, "get()"));
		ListMenu.addMenuItems(new MenuItems(6, "back"));
		ListMenu.setParent(ListMenu);
		
		ArrayMenu.addMenuItems(new MenuItems(1, "length()"));
		ArrayMenu.addMenuItems(new MenuItems(2, "sort()"));
		ArrayMenu.addMenuItems(new MenuItems(3, "get()"));
		ArrayMenu.addMenuItems(new MenuItems(4, "remove()"));
		ArrayMenu.addMenuItems(new MenuItems(5, "insertElements()"));
		ArrayMenu.addMenuItems(new MenuItems(6, "toString()"));
		ArrayMenu.addMenuItems(new MenuItems(7, "Back()"));
		ArrayMenu.setParent(ArrayMenu);
		
		mainMenu.display();	
	}
}
