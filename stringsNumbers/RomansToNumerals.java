package stringsNumbers;

import java.util.HashMap;

public class RomansToNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int num =map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--) {
        	if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
        		num = num + map.get(s.charAt(i));
        	}
        	if(map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
        		num = num - map.get(s.charAt(i));
        	}
        }
        
        return num;
    }

}
