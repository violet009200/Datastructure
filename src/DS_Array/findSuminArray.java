package DS_Array;

/*
 Given an array A[] and a number x, check for pair in A[] with sum as x
 */

public class findSuminArray {
	
	public static void useSorting(int[] arr, int x){
		quickSort(arr, 0, arr.length-1);
		
		int l = 0;
		int r = arr.length-1;
		
		while(l<r){
			if(arr[l] + arr[r] == x){
				System.out.println("TRUE");
				return;
			}
			else if(arr[l]+arr[r] > x){
				r--;
			}
			else l++;
		}
		System.out.println("FALSE");
		return;
	}
	
	
	public static void quickSort(int[] arr, int left, int right){
		int i = left;
		int j = right;
		int tmp;
		int pivot = arr[(left+right)/2];
		
		while(i<=j){
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;
			
			if(i<=j){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j]= tmp;
				
				i++;
				j--;
			}
		}
		
		if(left<j){ quickSort(arr,left,j);}
		if(i<right){ quickSort(arr,i,right);}
	}
	
	public static void main(String[] args){
		int[] arr = {1, 4, 45, 6, 10, -8};
		useSorting(arr,16);
		useSorting(arr,10);
		useSorting(arr,0);
		
	}
}
