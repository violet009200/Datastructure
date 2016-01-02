package Algorithm_Sorting;

import java.util.Arrays;

public class mergeSort {

	
	//recursively divided in two halves till the array size become 1)	
	public static void mergeSort(int[] arr){
		
		int size = arr.length;
		if(size<2) return; //stop recursive
		int mid = size/2;
		
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for(int i=0; i<mid; i++){
			left[i] = arr[i];
		}
	
		for(int i=0; i<right.length; i++){
			right[i] = arr[i+mid];
		}
		
		mergeSort(left);
		mergeSort(right);
				
		merge(left, right, arr);
	}
	
	public static void merge(int[] left, int[] right, int[] arr){
		
		int nL = left.length;
		int nR = right.length;
		
		int i=0; //left
		int j= 0; //right
		int k=0; //arr
		
		//copy elements
		while(i<nL && j<nR){
			if(left[i]<=right[j]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements
	
		System.arraycopy(left, i, arr, k, nL - i);
	    System.arraycopy(right, j, arr, k, nR - j);

	}
	

	public static void main(String[] args) {
		//int[] arr = {1, 4, 45, 6, 10, -8};
		int[] arr = {7,6,5,4,3,2};
		mergeSort(arr);
		System.out.println("Merge Sort result: ");
		System.out.println(Arrays.toString(arr));
	

	}

}
