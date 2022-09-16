package stringsNumbers;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse(1534236469));
		
		

	}
	
	public static int reverse(int x) {
		
		if(x<=Integer.MIN_VALUE || x>=Integer.MAX_VALUE){
            return 0;
        }
		
        int num =0;
        while(x!=0){
            int rem =x%10;
            x=x/10;
        
        if(num<Integer.MIN_VALUE/10 || num==Integer.MIN_VALUE/10 && rem <-8){
            return 0;
        }
        if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && rem >7){
            return 0;
        }
        
        num=num*10+rem;
        
        }
        return num;
    }

}
