package ArrayList_Implementation;

@SuppressWarnings("unchecked")
public class MyArrayList<T>
{
	Object[] a=new Object[5];
	int index=0;
	
	public void add(T data)
	{
		if(a.length==index)
		{
			grow();
		}
		a[index++] = data;
		
	}
	private void grow() 
	{
		
		Object[] b= new Object[a.length*2];
		
		for(int i=0;i<index;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	public void addAt(int ind, T data)
	{
		if(ind > index || ind<0)
		{
			System.out.println("ArrayIndexOutOfBound Exception");
			return;
		}
		if(ind > a.length)
		{
			grow();
		}
		for(int i=index;i>ind;i--)
		{
			a[i]=a[i-1];
		}
		a[ind]=data;
		index++;
	}
	
	public Object get(int ind)
	{
		if(ind > index || ind<0)
		{
			System.out.println("ArrayIndexOutOfBound Exception");
			return -1;
		}
		return a[ind];
	}
	
	public boolean contains(T s)
	{
		for(int i=0;i<index;i++)
		{
			if(a[i]==s)
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		MyArrayList obj=new MyArrayList();
		for(int i=0;i<index;i++)
		{
			obj.add((T)a[i]);
		}
		return obj;
	}
	public int size()
	{
		return index;
	}
	public void set(int ind,T data)
	{
		if(ind >index || ind<0)
		{
			System.out.println("ArrayIndexOutOfBound Exception");
			return;
		}
		a[ind]=data;
	}
	public int indexOf(T data)
	{
		for(int i=0;i<index;i++)
		{
			if(a[i]==data)
			{
				return i;
			}
		}
		return -1;
	}
	public Object[] clear()
	{
		while(index!=0)
		{
			index--;
		}
		return a;
	}
	public boolean equals(MyArrayList l1)
	{
		if(index!=l1.size())
		{
			return false;
		}
		int i=0;
		while(i<index)
		{
			if(a[i]!=l1.get(i))
			{
				return false;
			}
			i++;
		}
		return true;
	}
	public void remove(int ind)
	{
		if(ind > index || ind < 0) {
			System.out.println("indexOutOfBoundException");
			return;
			//throw new ArrayIndexOutOfBoundsException();
		}
		for(;ind<index-1;ind++)
		{
			a[ind]=a[ind+1];
		}
		index--;
	}
	
	public String toString()
	{
		String s="[";
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
			{
				s+=a[i]+", ";
			}
			else
			{
				s+=a[i];
			}
		}
		s+="]";
		return s;
		
	}
}

