package stringsNumbers;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String str = "Let's go for a walk";
		
		System.out.println(str);
		
		System.out.println(reverseWords(str));
	}

	public static String reverseWords(String str) {
		String[] arr = str.split("\s");
		
		String str1 = "";
		
		for (int i=0;i<arr.length;i++) {
			
			str1 = str1 + reverse(arr[i]) +" ";
			
		}
		return str1;
	}
	
	public static String reverse(String s) {
		
		String s1="";
		
		for(int i =s.length()-1; i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		
		return s1;
	}

}
