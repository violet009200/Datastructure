package Algorithm_Sorting;

import java.util.Arrays;

public class selectionSort {
	public static void main(String[] args){
		int[] arr = {64, 25, 12, 22, 11};
		
		for(int i =0; i<arr.length-1; i++){
			int minIndex = i;
			
			for(int j = i+1; j<arr.length; j++){
				if(arr[j]<arr[minIndex]) minIndex = j;
			}
			
			//swap
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("after selectionSort: ");
		System.out.println(Arrays.toString(arr));
	}
}
