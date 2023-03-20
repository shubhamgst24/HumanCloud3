package HCPrograme;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FindFacotrialOfNthNumber {

	public static void main(String[] args) {


		int n=5;
		
		// normal way
		long t=1;
		for(int i=2;i<=n;i++)
		{
			t*=i;
		}
		System.out.println(t);
		
		//using java8
		long fact=LongStream.rangeClosed(2, n).reduce(1, (long t1,long t2)-> t1*t2);
		System.out.println(fact);
		
		int fact1=IntStream.rangeClosed(2, n).reduce(1, (int t1, int t2)->t1*t2);
		System.out.println(fact1);
	}

}
