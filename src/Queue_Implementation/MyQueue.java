package Queue_Implementation;

public class MyQueue<T> {
	
	
	private Object[] arr;    // array to store queue elements
    private int front;       // front points to the front element in the queue
    private int rear;        // rear points to the last element in the queue
    private int capacity;    // maximum capacity of the queue
    private int count;       // current size of the queue
 
    // Constructor to initialize a queue
	public MyQueue(int size) {
		
		arr=new Object[size];
		front=0;
		rear=-1;
		capacity=size;
		count=0;
	}
	
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return (size() == 0);
	}
	public boolean isFull()
	{
		return (size() == capacity);
	}
	public T peek()
	{
		return (T)(arr[front]);
	}
	public void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		for(i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void enqueue(T data)
	{
		if(isFull())
		{
			System.out.println("Queue is OverFlow");
			return;
		}
		System.out.println("Inserting " + data);
		rear =(rear+1)%capacity;
		arr[rear]=data;
		count++;
	}
	public T dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is UnderFlow");
			return (T)new MyQueue<>(0);
		}
		T x=(T)arr[front];
        //System.out.println("Removing " + x);
        front=(front+1)%capacity;
        count--;
        return x;

	}
	
	
	
	

}
