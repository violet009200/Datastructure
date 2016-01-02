package Algorithm_Sorting;

import java.util.Arrays;

public class quickSort {

	public static void quickSort(int arr[], int left, int right){
		int i = left;
		int j = right;
		int tmp;
		int pivot = arr[(left+right)/2];
		
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				//swap elems
				tmp = arr[j];
				arr[j]=arr[i];
				arr[i] = tmp;
				i++;
				j--;
			}
		}
		
		//call quicksort recursively
		if(left<j){
			quickSort(arr,left, j);
		}
		if(i<right){
			quickSort(arr,i,right);
		}
		
	}
	
	public static void main(String[] args) {
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		quickSort(input, 0, input.length-1);
		System.out.println(Arrays.toString(input));
	}

}
