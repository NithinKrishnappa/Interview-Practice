package stringsNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameEmailSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> ne = List.of(List.of("Himanshu","himanshunutanahuja@gmail.com"),
			List.of("Nithin","knithin5555@gmail.com"),List.of("Chetan","chetakrishnappa586@gmail.com"));
		
		List<List<String>> es = List.of(List.of("knithin5555@gmail.com", "Java"),List.of("himanshunutanahuja@gmail.com", "Spring"),
				List.of("chetakrishnappa586@gmail.com", "My SQL"));
		
		
		Map<String,String> map = new HashMap<String,String>();
		
		for(int i=0;i<es.size();i++) {
			map.put(es.get(i).get(0), "|"+ es.get(i).get(1));
		}
		
		for(String k:map.keySet()) {
			for(int j=0;j<ne.size();j++) {
				if(k==ne.get(j).get(1)) {
					map.put(k, ne.get(j).get(0) + map.get(k));
				}
			}
		}
		
		for(int k=0;k<es.size();k++) {
			System.out.println(map.get(es.get(k).get(0)));
		}
		
		
		
		
		
		
		
		
		/*
		 * Map<String,String> ne = new HashMap<String,String>();
		 * 
		 * 
		 * ne.put("himanshunutanahuja@gmail.com","Himanshu");
		 * ne.put("chetakrishnappa586@gmail.com","Chetan");
		 * ne.put("knithin5555@gmail.com","Nithin");
		 * 
		 * 
		 * Map<String,String> es = new HashMap<String,String>();
		 * 
		 * es.put("knithin5555@gmail.com", "Java");
		 * es.put("himanshunutanahuja@gmail.com", "Spring");
		 * es.put("chetakrishnappa586@gmail.com", "My SQL");
		 * 
		 * List<Map<String,String>> ls = new ArrayList<Map<String,String>>();
		 * ls.add(ne); ls.add(es);
		 * 
		 * 
		 * for(String k: ls.get(1).keySet()) {
		 * System.out.println("Name: "+ls.get(0).get(k) + "|" +
		 * "Subject: "+ls.get(1).get(k));
		 * 
		 * }
		 */
		 
	
		

		
	}

}
