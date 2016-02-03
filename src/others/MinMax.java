package others;
/*
 * Given an array of integers, 
 * find the maximum and minimum of the array.
 * (using divide-and-conquer)
 */

public class MinMax {
	
	static int max ;
	static int min;
	

	private static void findminmax(int[] arr, int start, int end){
		int tempMin, tempMax, mid;

		
		if(start == end) 	{
			
			min = max = arr[start];	//array has 1 elem
		
		}
		
		else if(start == end-1){//array has 2 elem
	
				min = Math.min(arr[start], arr[end]);
				max = Math.max(arr[start], arr[end]);
		
		}
			
		else{
			mid = (start+end)/2;
			
		
			findminmax(arr, start,mid);	//left side
			tempMin = min;
			tempMax = max;
			
			findminmax(arr, mid+1, end); //right side
			min = Math.min(tempMin, min);
			max = Math.max(tempMax, max);
		

		}

		
	}
	
	public static void main(String[] args){
		int[] arr = {2,17,63,4,1,6,5,9,10,23,76,43,32,0};
		/*int[] arr = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11, 12};*/
		findminmax(arr, 0, arr.length-1);
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
	}

}
