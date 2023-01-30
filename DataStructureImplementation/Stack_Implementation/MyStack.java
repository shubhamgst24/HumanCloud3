package Stack_Implementation;

public class MyStack<T> {
	
	 Object arr[]=new Object[1];
	 int top=-1;
	 int capacity=arr.length;
	
	
	
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
//			if(top == capacity)
//			{
//				grow();
//				return false;
//			}
		return false;
	}
	private void grow() {

		Object[] ar1=new Object[capacity*2];
		for(int i=0;i<arr.length;i++)
		{
			ar1[i]=arr[i];
			
		}
		arr=ar1;
		capacity*=2;
		
		
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
		
		if(top == capacity-1)
		{
			grow();
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
		System.out.print("[");
		for(int i=top;i>-1;i--)
		{
			if(i>0)
			System.out.print(" "+arr[i]+",");
			else
				System.out.print(" "+arr[i]);
			
		}
		System.out.println("]");

	}
	

}
