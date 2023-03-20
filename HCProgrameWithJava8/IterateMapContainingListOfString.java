package HCPrograme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateMapContainingListOfString {

	public static void main(String[] args) {

		
		Map<Integer, List<String>> m1=new HashMap<Integer, List<String>>();
		
		m1.put(1, List.of("abc","cds","vgf","jgl"));
		m1.put(2, List.of("abc","cds","vgf","jgl"));
		m1.put(3, List.of("abc","cds","vgf","jgl"));
		m1.put(4, List.of("abc","cds","vgf","jgl"));
		
		System.out.println("normal way\n"+m1);
		
		m1.entrySet().stream().iterator().forEachRemaining(e->System.out.println(e.getKey()+" => "+e.getValue()));
		m1.entrySet().stream().spliterator().forEachRemaining(e-> System.out.println(e.getKey()+" --> "+e.getValue()));
	}

}
