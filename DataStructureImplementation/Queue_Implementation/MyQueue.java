package Queue_Implementation;

public class MyQueue<T> {
	
	Object[]queue;
	int rear;
	int front;
	int size;
	
	public MyQueue()
	{
		queue=new Object[2];
		rear=-1;
		front=-1;
		size=0;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	public boolean enqueue(T element)
	{
		if(rear==queue.length-1)
		{
			Object[] q1=new Object[queue.length*2];
			for(int i=0;i<queue.length;i++)
			{
				q1[i]=queue[i];
			}
			queue=q1;
		}
		queue[++rear]=element;
		size++;
		
		return true;
	}
	public T dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty...");
			return (T)((Integer)(-1));
		}
		front=0;
		T t=(T)queue[front];
		for(int i=front;i<size-1;i++)
			queue[i]=queue[i+1];
		size--;
		return t;
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			return (T)((Integer)(-1));
		}
		return (T)queue[front];
	}
	public int getSize()
	{
		return size;
	}

	public void display() {
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+queue[i]);
		}
		System.out.println();
		
	}
	
	
	

}
