package Queue_Implementation;

public class QueueImplementation<T>
{

	Object[]queue;
	int rear;
	int front;
	int size;
	
	public QueueImplementation()
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
	public boolean enqueue(int element)
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

	public void print() {
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+queue[i]);
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
