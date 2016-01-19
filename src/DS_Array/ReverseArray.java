package DS_Array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int j = arr.length-1;
		for(int i = 0; i<arr.length/2; i++){
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
