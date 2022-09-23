package stringsNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameEmailSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> ne = new HashMap<String,String>();
		
		
		ne.put("himanshunutanahuja@gmail.com","Himanshu");
		ne.put("chetakrishnappa586@gmail.com","Chetan");
		ne.put("knithin5555@gmail.com","Nithin");

		
		Map<String,String> es = new HashMap<String,String>();
		
		es.put("knithin5555@gmail.com", "Java");
		es.put("himanshunutanahuja@gmail.com", "Spring");
		es.put("chetakrishnappa586@gmail.com", "My SQL");

		List<Map<String,String>> ls = new ArrayList<Map<String,String>>();
		ls.add(ne);
		ls.add(es);
		
		
			for(String k: ls.get(1).keySet()) {
				System.out.println("Name: "+ls.get(0).get(k) + "|" + "Subject: "+ls.get(1).get(k));
				
			}
		
	
		

		
	}

}
