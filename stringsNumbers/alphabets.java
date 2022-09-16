package stringsNumbers;

import java.util.Scanner;

public class alphabets {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String input = sc.next().toLowerCase();
		
		char[] ch = input.toCharArray();
		
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		
		String output="";
		
		for(int i=0;i<ch.length;i++) {
//			output = output + String.valueOf(alphabets.indexOf(ch[i])+1);
			output = output + Integer.toString(alphabets.indexOf(ch[i])+1);
		}
		
		System.out.println(output);
		sc.close();
		
	}
	
//	LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
//	
//		map.put('a',1);
//		map.put('b',2);
//		
		

}
