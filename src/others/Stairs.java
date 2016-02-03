package others;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n-1;
        
        for(int i=0; i<n; i++){
            for(int j = 0; j<k; j++){
                System.out.print(" ");
                
            }
            
            for(int a = k; a<n; a++){
                System.out.print("#");
            }
            k--;
            System.out.println(""); //enter
        }
    }
    
}