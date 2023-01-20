package Stack_Implementation;

public class MyStack<T> {
	
	private Object arr[];
	private int top;
	private int capacity;
	
	public MyStack(int size)
	{
		arr=new Object[size];
		top=-1;
		capacity=size;
	}
	
	public int size()
	{
		return top+1;
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == capacity-1);
	}
	@SuppressWarnings("unchecked")
	public T peek()
	{
		if(!isEmpty()) {
		return (T)(arr[top]);}
		else
		{
			return(T)((Integer)(-1));
		}
		//return (T)((Integer)(-1));
	}
	public void push (T data)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			return;
		}
		
		System.out.println("Inserting "+data);
		arr[++top]=data;
	}
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return (T)((Integer)(-1));
		}
		
		System.out.println("Removing "+peek());
		return (T)(arr[top--]);
	}
	public void print()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.print(" "+arr[i]);
		}
	}
	

}
