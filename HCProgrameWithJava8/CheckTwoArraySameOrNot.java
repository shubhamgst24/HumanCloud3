package HCPrograme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckTwoArraySameOrNot {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5};
//		Integer[] a1=new Integer[] {1,2,3};
//		Integer[] a2=a1;
//		System.out.println(Arrays.equals(a1, a2));
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(a.equals(b));
		System.out.print("a and b array are ");
		System.out.println(Arrays.equals(a, b)?"same\n":"not same\n");
		
		/*****************OR***********************/
		
		int[]c= {1,2,3,4,5};
		int[]d= {1,2,3,4,6};
		List<Integer> l1=new ArrayList<Integer>(Arrays.stream(c).boxed().sorted().collect(Collectors.toList()));
		List<Integer> l2=new ArrayList<Integer>(Arrays.stream(d).boxed().sorted().collect(Collectors.toList()));
		System.out.print("two list l1 and l2 are ");
		System.out.println(l1.equals(l2)?"same":"not same");
		
		
		
	}

}
