package HCPrograme;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacterInString {

	public static void main(String[] args) {

		String s1="abcdabcdabd";
		
//		Map<String, Long> result = Arrays.stream(s1.split(""))
//				.map(String::toLowerCase)
//				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
//		System.out.println(result);
		
		Map<String, Long> m1=Arrays.stream(s1.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()));
		
		
	}

}
