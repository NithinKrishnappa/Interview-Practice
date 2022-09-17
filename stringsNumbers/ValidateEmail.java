package stringsNumbers;

public class ValidateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ajsuy";
		System.out.println(s.indexOf("@"));

	}
	
	public static boolean validateEmail(String s) {
		
		String tailEnd = s.substring(s.length()-4);
		
		if(tailEnd.equals(".com")||tailEnd.equals(".org")||tailEnd.equals(".net")) {
			
			if(s.substring(0,s.indexOf("@")).matches("^[a-z0-9]+#+$+!+&")) {
				return true;
			}
			
		}
		
		return false;
	}

}
