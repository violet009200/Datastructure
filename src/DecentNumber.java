/*
 * A Decent Number has the following properties:

	3, 5, or both as its digits. No other digit is allowed.
	Number of times 3 appears is divisible by 5.
	Number of times 5 appears is divisible by 3.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DecentNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = "";
        
        while(k>0){
            //s = "";
            int n = sc.nextInt();
            
            int c = (n*2)%3*5;
            if(c>n) System.out.print("-1");
            else{
                for(int i=0; i<n-c; i++){
                    //s= s+"5";
                    System.out.print("5");
                }
                for(int i=0; i<c;i++){
                    System.out.print("3");
                }
            }
            System.out.println("");
            k--;
        }
        
    }
}