package Algorithm_Sorting;

import java.util.Scanner;

/*
 Sample Input:
5
2 4 6 8 3

show every step of sorting
 */


public class InsertionSort {
	   public static void insertIntoSorted(int[] ar, int s) {
	        // Fill up this function  
	        
	        int val = ar[s-1];
	        int index = s-1;
	        
	        while(index>=1 && ar[index-1]>val){
	        	ar[index] = ar[index-1];
	        	index--;
	        	printArray(ar);
	        }
	       
	        ar[index] = val;
	        printArray(ar);
	     
	    }
	    
	   
	   public static void insertionSortPart2(int[] ar, int s)
	    {       
		   int temp;
		   
	           for(int i = 1 ; i<s; i++){
	        	   for(int j= i; j>0; j--){
	        		   if(ar[j-1]>ar[j]){
	        			   temp = ar[j];
	        			   ar[j] = ar[j-1];
	        			   ar[j-1]= temp;
	        		   }
	        		   
	        	   }
	        	   printArray(ar);
	           }
	          
	    }  
	    
	/* Tail starts here */
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         //insertIntoSorted(ar,s);
	         insertionSortPart2(ar, s); 
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    

}
