package stringsNumbers;

import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		String output="";
		
		while(num>0) {
			
			int rem = num%2;
			
			num = num/2;
			
			output = Integer.toString(rem)+output;
			
		}
		
		System.out.println(Integer.parseInt(output));
		
		
	}

}
