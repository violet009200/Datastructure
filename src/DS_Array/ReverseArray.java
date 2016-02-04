package DS_Array;

import java.util.Arrays;
import java.util.Scanner;
/*
Input
1		//test case
4		//number of elem in array
1 2 3 4	//array

Output:
4 3 2 1
 */

public class ReverseArray {

	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			//System.out.println(T);
			for(int i=0;i<T;i++){
			    int N = sc.nextInt();
			   // System.out.println(N);
			    int[] arr = new int[N];
			    for(int j=0; j<N;j++){
			        arr[j] = sc.nextInt();
			    }
			   //System.out.println(Arrays.toString(arr));
			    reverseArr(arr);
			}
		}
		
		public static void reverseArr(int[] arr){
		
		    int i = arr.length-1;
		    
		    for(int j=0; j<arr.length/2; j++){
		    	
		        int tmp = arr[j];
		        arr[j]= arr[i];
		        arr[i] = tmp;
		        i--;
		    }
		    
		    
		    //print array
		    for(int j=0; j<arr.length;j++){
		        System.out.print(arr[j]+" ");
		    }
		    System.out.println("");
		}

	
}
