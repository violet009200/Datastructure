package DS_Array;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of size n, rotate it by d elements. 

Input: The first line of the input contains T denoting the number of testcases. 
First line of test case is the number of elements 'n' and elements 'd' to be rotated. Second line of test case will be the array elements.
Output: Rotated array is displayed to the user.

Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6
 */

public class RotateArray {
	
	public static void RotateArray(int[] arr, int d, int n){
		int[] newArr = new int[n];
		
		int k = d;
		for(int i=0; i<n-d; i++){
			newArr[i] = arr[k];
			k++;
		}

		int j=n-d;
		for(int i=0; i<d; i++){
			//System.out.println(arr[j]);
			newArr[j] = arr[i];
			j++;
		}
		
		printArray(newArr);
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			int d = sc.nextInt();
			int[] arr = new int[n];
			
			for(int j=0; j<n;j++){
				arr[j] = sc.nextInt();
			}
			RotateArray(arr, d, n);
		}
		
		
	}
}
