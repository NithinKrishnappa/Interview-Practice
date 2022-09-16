package stringsNumbers;

public class EvenElementsAlternateArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\s");
		}
		
		System.out.println();
		
		int[] arr1 = alternateArray(arr,(arr.length/2));
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + "\s");
		}
	}
	
	public static int[] alternateArray(int[] arr,int n) {
		
		int[] arr1 = new int[arr.length];
		
			int j=0;
		for(int i=0;i<n;i++) {
			arr1[j]=arr[i];
			j+=2;
		}
			
			j=1;
		for(int i=n;i<arr.length;i++) {
			arr1[j]=arr[i];
			j+=2;
		}
		
		return arr1;
		
	}

}
