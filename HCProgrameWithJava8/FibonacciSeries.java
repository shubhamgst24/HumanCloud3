package HCPrograme;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n=10;
		
		//using normal way
//		int a=0;
//		int b=1;
//		int cnt=2;
//		System.out.println(a+"\n"+b);
//		while(cnt<n)
//		{
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//			cnt++;
//		}
		
		//******************** using java8 ***********************
		
//		Stream.iterate(new int[] {0,1}, t-> new int[] {t[1], t[0]+t[1]})
//		.limit(n)
//		.map(t->t[0])
//		//.forEach(e-> System.out.println(e));
//		.forEach(System.out::println);
		
	//************* using recursion **************
		for(int i=0;i<n;i++)
		{
		System.out.println(fiboloop(i));
		}
		
	}

	private static int fiboloop(int n) {

		if(n<=1)
			return n;
		return fiboloop(n-1)+fiboloop(n-2);
	}

}
