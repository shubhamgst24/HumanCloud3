package HCPrograme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {


		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		List<Integer> list2=new ArrayList<>();
		list2.add(6);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		
		//using java8
		List<Integer> list3=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println("using java8\n"+list3);
		
		//using iterator
		
		List<Integer> list4=new ArrayList<>();
		
		Iterator i=list1.iterator();
		 while(i.hasNext())
		 {
			 list4.add((int)i.next());
		 }
		 i=list2.iterator();
		 while(i.hasNext())
		 {
			 list4.add((int)i.next());
		 }
		 System.out.println("using iterator\n"+list4);
		 
		 // using loop
		 List<Integer> list5=new ArrayList<Integer>();
		 for(int j:list1)
		 {
			 list5.add(j);
		 }
		 for(int j:list2)
		 {
			 list5.add(j);
		 }
		 System.out.println("using loop\n"+list5);
		 
		// using predefine method
		 
		 List<Integer> list6=new ArrayList<Integer>();
		 list6.addAll(list1);
		 list6.addAll(list2);
		 System.out.println("using predefine method\n"+list6);
		 
		 //
		
		
		
		
	}

}
