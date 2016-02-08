package DS_Array;

import java.util.Scanner;

//Given an integer N, find sum of all digits of N.

/*
Input
2
123
45

Output
6
9
 */
public class SumOfDigits {

	public static void findSum(int num){
		int tmp = num;
		int sum = 0;
		
		while(tmp>0){
			sum += tmp%10;
			tmp = tmp/10;
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i =0; i<T; i++){
			int num = sc.nextInt();
			
			findSum(num);
		}

	}

}
