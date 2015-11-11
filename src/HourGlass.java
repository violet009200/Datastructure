import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class HourGlass {

    public static void main(String[] args) {
        
        int n = 6;
        int bigArr[][] = new int[n][n];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bigArr[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;
        int maxSum = -100;
        
        for(int i=0; i<4; i++){
        	for(int j=0; j<4; j++){
        		sum = bigArr[i][j]+bigArr[i][j+1]+bigArr[i][j+2]+bigArr[i+1][j+1]+bigArr[i+2][j]+bigArr[i+2][j+1]+bigArr[i+2][j+2];
        		
        		if(sum > maxSum) maxSum = sum;
        	}
        }
        
        
        
        System.out.println(maxSum);
        
        
    }
}
