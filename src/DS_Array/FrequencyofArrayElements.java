package DS_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Given an unsorted array of N integers which can contain integers from 1 to N. 
Some elements can be repeated multiple times and some other elements can be absent from the array. 
Count frequency of all elements from 1 to N.

Input:
2
5
2 3 2 3 5
4
3 3 3 3

Output:
0 2 2 0 1
0 0 4 0
 */
public class FrequencyofArrayElements {
	
	public static void CountElem(int[] arr, int N){
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<N; i++){
			//System.out.println("key-> "+arr[i]);
			if(hmap.containsKey(arr[i]))	hmap.put(arr[i], hmap.get(arr[i])+1);
			else hmap.put(arr[i], 1);
		}
		//print out
		
		for(int i=1;i<=N;i++){
			if(hmap.containsKey(i)) System.out.print(hmap.get(i)+" ");
			else System.out.print("0 ");
		}

		System.out.println("");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int i =0; i<T; i++){
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int j=0; j<N; j++){
				arr[j] = sc.nextInt();
			}
			
			CountElem(arr,N);
		}
		
	}
}
