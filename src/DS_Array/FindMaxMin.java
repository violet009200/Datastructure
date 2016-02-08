package DS_Array;

import java.util.Scanner;

/*
Find Min and Max in Array
Input:
2
4
5 4 2 1
1
8

Output:
5 1
8 8
 */
public class FindMaxMin {
	
	public static void findMinMaxinArray(int[] arr, int N){
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<N;i++){
			
			if(arr[i] <= min) min = arr[i];
			else if(arr[i]>= max) max = arr[i];
		}
		
		System.out.println(max+" "+min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int j=0; j<N; j++){
				arr[j] = sc.nextInt();
			}
			
			findMinMaxinArray(arr, N);
		}
	}

}
