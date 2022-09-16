package stringsNumbers;

public class RunningSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\s");
		}
		
		System.out.println();
		sumArray(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\s");
		}
	
		

	}
	
	public static int[] sumArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=sum;
		}
		
		return arr;
	}

}
