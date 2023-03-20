package HCPrograme;

public class DeadLockPrograme {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		Thread1 t1=new Thread1(a,b);
		Thread2 t2=new Thread2(a,b);
		
		t1.start();
		t2.start();
	}

}
class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Inside A's d1() method");
		try {
			Thread.sleep(5000);
		}catch (Exception e) {}
		System.out.println("Thread 1 is waiting for B's lock");
		b.lastMethod();
	}
	public synchronized void lastMethod()
	{
		System.out.println("A's lastMethod() executed");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Inside B's d2() method");
		try {
			Thread.sleep(5000);
		}catch (Exception e) {}
		System.out.println("Thread 2 is waiting for A's lock");
		a.lastMethod();
	}
	public synchronized void lastMethod()
	{
		System.out.println("B's lastMethod() executed");
	}
}
class Thread1 extends Thread
{
	A a;
	B b;
	public Thread1(A a, B b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		a.d1(b);
	}
}
class Thread2 extends Thread
{
	A a;
	B b;
	public Thread2(A a, B b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		b.d2(a);
	}
}

