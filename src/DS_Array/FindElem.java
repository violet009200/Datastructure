package DS_Array;

import java.util.Scanner;

/*
84 
86 77 15 93 35 86 92 49 21 62 27 90 59 63 26 40 26 72 36 11 68 67 29 82 30 62 23 67 35 29 2 22 58 69 67 93 56 11 42 29 73 21 19 84 37 98 24 15 70 13 26 91 80 56 73 62 70 96 81 5 25 84 27 36 5 46 29 13 57 24 95 82 45 14 67 34 64 43 50 87 8 76 78 88  
25

output = 60
 */
public class FindElem {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//int testcase = sc.nextInt();
		int size = sc.nextInt();
	    int[] arr = new int[size];
	    
	    for(int i=0; i<size;i++)    arr[i] = sc.nextInt();
	    
	   // int[] t = new int[testcase];
	   // for(int i=0; i<testcase;i++) t[i] = sc.nextInt();
	   int t = sc.nextInt();
	    
	    //for(int j=0; j<testcase;j++){
	        boolean flag = false;
	        for(int i=0;i<size;i++){
	            if(arr[i] == t){
	                System.out.println(i);
	                flag = true;
	            } 
	        }
	        if(flag ==false) System.out.println(-1);
	    //}
	}

}
