package Programes;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sort_Map_by_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm=new HashMap<>();
		hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        
        
        /* creating LinkedList and store the hashmap in that list
         * because colletion have predefined method that is collections.sort()
        */
        List<Map.Entry<String, Integer>>list=new LinkedList<>(hm.entrySet());
        
        /*
         * we use Collections.sort() method with two parameter
         * 1 parameter is list &
         * 2 is lambda expression for comparision for two object with using 
         * comparTo method
         */
        Collections.sort(list, (l1,l2)-> l1.getValue().compareTo(l2.getValue()));
        
        //create new LinkedHashMap and store the list into map
        
        Map<String, Integer> t=new LinkedHashMap<String, Integer>();
        
        for(Map.Entry<String, Integer> s:list)
        {
        	t.put(s.getKey(), s.getValue());
        }
        
        for(Map.Entry<String, Integer> en : t.entrySet())
        {
        	System.out.println(en.getKey()+"  "+en.getValue());
        }
	}

}
