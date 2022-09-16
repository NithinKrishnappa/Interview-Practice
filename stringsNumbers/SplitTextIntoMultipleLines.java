package stringsNumbers;

public class SplitTextIntoMultipleLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Four score and seven years ago our "
				+ "fathers brought forth upon this continent a new nation, "
				+ "conceived in liberty and dedicated to the proposition that all men are created equal";
		
		split(s,13);

//		System.out.println(s.indexOf(" ",0));
//		
//		s.substring(0,13);
		
		
	}
	
	public static void split(String s,int n) {
		
		int i=0;
		int j=0;
		
		try {
		
		while(j<s.length()) {
			
			j=i+n;
			
			int end = i+s.substring(i,j).lastIndexOf(" ")+1;
			
			String s1 = s.substring(i,end);
			
			System.out.println(s1);
			
			i=i+s1.length();
			
		}
		
		}catch(Exception e){
			System.out.println(s.substring(i));
		}
		
		
		
	}

}
