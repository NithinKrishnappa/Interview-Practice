package stringsNumbers;

public class FindNumberswithEvenNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 12, 345, 2, 6, 7896 };
		
//		System.out.println(countDigits(nums[0]));
		
//		System.out.println(countDigits(345));
		
		System.out.println(findNumbers(nums));

	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (countDigits(nums[i]) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int countDigits(int n) {
		int count = 0;
		while (n >0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
