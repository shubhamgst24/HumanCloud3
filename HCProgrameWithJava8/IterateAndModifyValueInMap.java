package HCPrograme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IterateAndModifyValueInMap {

	public static void main(String[] args) {

		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		
		m.put(1, "shiv");
		m.put(2, "shiva");
		m.put(3, "shivam");
		m.put(4, "shubh");
		
		Map<Integer,String> m1 =  m.entrySet().stream()
			    .filter(map -> map.getKey().intValue() %2 == 0)
			    .collect(Collectors.toMap(
			        map -> map.getKey(),map -> map.getValue()));
			            Map<Integer,String> m3 = m1.entrySet().stream()
			                .filter(m2 -> {
			                    if(m2.getValue().equalsIgnoreCase("shiv")){
			                        m2.getValue().replace("shiv","PQR1");
			                    } else if(m2.getValue().equalsIgnoreCase("shivam")) {
			                        m2.getValue().replace("shivam", "RST1");
			                    }
			                    return true;
			                }).collect(Collectors.toMap(m2 -> m2.getKey(), m2 -> m2.getValue()));

			            
	Map<Integer, String> m11=m.entrySet().stream().map(m2-> {
		if(m2.getValue().equalsIgnoreCase("shiv"))
		{
			m2.setValue("sam");
		}
		return m2;
	}).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
	
	
	 Map<Integer,String> m10 = m1.entrySet().stream().map(m2 -> {
	        if(m2.getValue().equalsIgnoreCase("shiv")){
	            m2.setValue("PQR1");
	        }else if(m2.getValue().equalsIgnoreCase("shivam")) {
	            m2.setValue("RST1");
	        }
	        return m2;
	    }).collect(Collectors.toMap(m2 -> m2.getKey(), m2 -> m2.getValue()));
	 
	 System.out.println(m1+"\n"+m11+"\n"+m10);
		
	 
	}

}
