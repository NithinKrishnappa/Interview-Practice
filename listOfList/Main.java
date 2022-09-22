package listOfList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NameEmail n = new NameEmail("Nithin","knithin5555@gmail.com");
		
		NameEmail c = new NameEmail("Chetan","chetankrishnappa786@gmail.com");
		
		
		List<NameEmail> ne = new ArrayList<NameEmail>();
		
		ne.add(n);
		ne.add(c); 
		
		List<EmailSubject> es = new ArrayList<EmailSubject>();
		
		EmailSubject c1 = new EmailSubject("chetankrishnappa786@gmail.com","something");
		
		EmailSubject n1 = new EmailSubject("knithin5555@gmail.com","do something");
		
		es.add(c1);
		es.add(n1);
		
		for(EmailSubject e :es) {
			for(NameEmail i :ne) {
				
				if(e.getEmail().equals(i.getEmail())){
					System.out.println(i.getName()+" "+e.getSubject());
				}
			}
			
		}
		

	}

}
