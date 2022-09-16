package stringsNumbers;

import java.util.Arrays;

public class MaxProductDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,2,7,4};
		System.out.println(maxProductDiff(arr));

	}
	
	public static int maxProductDiff(int[] arr) {
		mergeSort(arr,0,arr.length-1);
		return arr[arr.length-1]*arr[arr.length-2]-arr[0]*arr[1];
	}
	
	public static void mergeSort(int[] arr,int beg,int end) {
		if(beg<end) {
			int mid =(beg+end)/2;
			mergeSort(arr,beg,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
	}

	public static void merge(int[] arr, int beg, int mid, int end) {
		int i,j,k;
		int n1 = mid-beg+1;
		int n2 = end-mid;
		
		int [] leftarr = new int[n1];
		int [] rightarr = new int[n2];
		
		for(i=0;i<n1;i++) {
			leftarr[i]=arr[beg+i];
		}
		
		for(j=0;j<n2;j++) {
			rightarr[j]=arr[mid+1+j];
		}
		
		i=0;
		j=0;
		k=beg;
		
		while(i<n1 && j<n2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}else {
				arr[k]=rightarr[j];
				j++;
			}
			
			k++;
		}
		
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
	}

}
