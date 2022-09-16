package stringsNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringsofSizeThreewithDistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		System.out.println(countGoodSubstrings(s));
		
	}
	
	public static int countGoodSubstrings(String s) {
		
		List<String> list = new ArrayList<String>();
		
		for(int i =0;i<s.length()-2;i++) {
			if(mapSum(s.substring(i,i+3))) {
				list.add(s.substring(i,i+3));
			}
		}
		
		return (int) list.stream().count();
		
		/*
		 * for(int i=0;i<s.length()-2;i++) {
		 * if(s.substring(i+1,i+3).contains(s.substring(i,i+1))||s.substring(i,i+3).
		 * contains(s.substring(i+1,i+2))) {
		 * 
		 * }else { count++; } }
		 */
		
    }
	
	public static boolean mapSum(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), 0);
		}
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		
		for(char c:map.keySet()) {
			
			if(map.get(c)>1) {
				return false;
			}
		}
		
		return true;
	}

}
