
/*
 * HackerRank problem
 * You are given a square matrix of size N×N. Can you calculate the absolute difference of the sums across the two main diagonals?
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayDS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int firstD = 0;
        int secondD = 0;
        int diff = 0;
        
        for(int i=0; i<n; i++){
            firstD += arr[i][i];
        }
        int j = 0;
        for(int i=n-1; i>=0; i--){
        	
        		secondD += arr[j][i];
        		System.out.println(arr[j][i]);
        	j++;
        }
        
        System.out.println(firstD +" "+secondD);
        diff = Math.abs(firstD-secondD);
        
        System.out.println(diff);
        
    }
}