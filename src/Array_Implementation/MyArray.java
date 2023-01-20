package Array_Implementation;

public class MyArray<T> {

	 Object[] arr;
	// int size;
	public MyArray(int s)
	{
		this.arr=new Object[s];
		p();
	}
	
	private void p() {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=0;
		}
		
	}
	public String toString()
	{
		String s="[";
		for(int i=0;i<arr.length;i++)
		{
			if(i<arr.length-1)
			{
				s+=arr[i]+", ";
			}
			else
			{
				s+=arr[i];
			}
		}
		s+="]";
		
		return s;
	}
	public void pushAt(int ind,T element)
	{
		if(ind>arr.length || ind<0)
		{
			System.out.println("*********Array index Out of bound***********\nprogram terminate");
			return;
		}
		int i=0;
		while(i<arr.length)
		{
			if(i==ind)
			{
				arr[i]=element;
				System.out.println("you inserted element : "+arr[i]);
			}
				
			i++;
		}
			
	}
	public void remove(int ind) {
		if(ind>arr.length || ind<0)
		{
			System.out.println("*********Array index Out of bound***********\nprogram terminate");
			return;
		}
		int i=0;
		while(i<arr.length)
		{
			if(i==ind)
			{
				arr[i]=0;
				break;
			}
			i++;
		}
	
	}

//	public  Object[] clone() {
//		Object[]a=new Object[arr.length];
//		int i=0;
//		while(i<arr.length)
//		{
//			a[i]=arr[i];
//			i++;
//		}
//		return a;
//	}
	

	public  T get(int ind) {
		if(ind>arr.length || ind<0)
		{
			System.out.println("*********Array index Out of bound***********\nprogram terminate");
			return (T)new MyArray<>(0);
		}
		return (T)arr[ind];
	}

//	public  boolean equals(Object[] arr1) {
//		if(arr.length!=arr1.length)
//		{
//			return false;
//		}
//		int i=0;
//		while(i<arr.length)
//		{
//			if(arr[i]==arr1[i])
//			{
//				
//			}
//			else
//				return false;
//			i++;	
//		}
//		return true;
//		
//	}

	public  boolean contains(T element) {
		
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==element)
				return true;
			i++;
		}
		return false;
	}

	public  Object[] sort() {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(compareTo(arr[j],arr[j+1])>0)
				{
					T t=(T)arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		return arr;
	}

	private int compareTo(Object ss1, Object ss2) {
		String s2=ss1.toString();
		String s3=ss2.toString();
		for(int i=0;i<s2.length() && i<s3.length();i++)
		{
			if(s2.charAt(i)!=s3.charAt(i))
			{
				return (s2.charAt(i)-s3.charAt(i));
			}
		}
		return (s2.length()-s3.length());
	}

	public  int length() {
		Object temp;
		int count=0;
		try {
			while(true)
			{
				temp=arr[count];
				count++;
			}
		}
		catch(Exception e)
		{
			return count;
		}
		
	}

}


