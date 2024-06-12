package lab;

import java.util.HashMap;
import java.util.Map;

public class mapq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Map<String, Integer> emp=new HashMap<String, Integer>();
		
		emp.put("Avi", 101);
		emp.put("Gole", 102);
		emp.put("Shruti", 103);
		emp.put("Pratham", 104);
		emp.put("Shubham", 105);
		
		System.out.println(emp);
		
		// iterating over the elements of the tree map
		for (String key : emp.keySet()) 
		{
			System.out.println("Key: " + key + ", Value: " + emp.get(key));
			}
		
		//Access keys of the map
		System.out.println("Keys:" + emp.keySet());
		
		//Access the values of map
		System.out.println("Values:" + emp.values());
		
		//access the entries of map
		System.out.println("Entries:"+ emp.entrySet());
	}
	}


