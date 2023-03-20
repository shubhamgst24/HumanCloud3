package HCPrograme;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {

		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "shubham");
		map.put(2, "shivam");
		map.put(3, "sampada");
		map.put(4, "digvijay");
		map.put(5, "laxman");
		map.put(6, "kiran");
		
		
		Map<Integer, String> sorted = map
		        .entrySet()
		        .stream()
		        .sorted(Map.Entry.comparingByValue())
		        .collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1, LinkedHashMap::new));
		System.out.println(sorted);
		
		Map<Integer, String> sorted1 = map
		        .entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .collect(Collectors.
		            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
		                LinkedHashMap::new));
		System.out.println(sorted1);
		
		Map<Integer, String> sortedByValu =map
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, String>comparingByValue())
				.collect(Collectors.
					toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)-> e1,
						LinkedHashMap::new));
		System.out.println(sortedByValu);
		
		Map<Integer, String> sorted4=new LinkedHashMap<>();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEachOrdered(x-> sorted4.put(x.getKey(), x.getValue()));
		System.out.println(sorted4);
		
		//sortedByKey
		
		Map<Integer, String> sortedByKey=map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(sortedByKey);
		
		


					}

}
