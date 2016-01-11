package Algorithm_Sorting;

import java.util.Arrays;

public class BubbleSort {

	
	public static void main(String[] args){
		BubbleSort b = new BubbleSort();
		
		int[] arr = {8,3,2,5,4,6,10};
		boolean swap;
		
		for(int i = 0; i<arr.length-1; i++){
			swap= false;
			
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){ 
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					swap = true;
				}				
				System.out.println(Arrays.toString(arr));
			}
			if(swap == false) break;
		}
		
		System.out.println("after sorting: " + Arrays.toString(arr));
	}
}
