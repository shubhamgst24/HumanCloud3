package menu_operations;
public class MenuItems {
	
	private int id;
	private String name;
	private MenuItems parent;

	public MenuItems() {
		super();
	}
	public MenuItems(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MenuItems getParent() {
		return parent;
	}
	public void setParent(MenuItems string) {
		this.parent = string;
	}
	public void displayMI() {
		System.out.println(id+" : "+name+" ");
	}
}
