package stringsNumbers;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,8,7,3,1,6};
		
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		mergeSort(arr,0,arr.length-1);
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
