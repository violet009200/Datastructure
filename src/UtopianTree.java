/*
 * The Utopian Tree goes through 2 cycles of growth every year.
   The first growth cycle occurs during the spring, when it doubles in height. 
   The second growth cycle occurs during the summer, when its height increases by 1 meter.

   Now, a new Utopian Tree sapling is planted at the onset of spring. Its height is 1 meter. 
   Can you find the height of the tree after N growth cycles?
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int init[] = new int[T];
        int result[] = new int[T];
       
        for(int i=0; i<T; i++){
            init[i] = sc.nextInt();
            result[i] = 1;
        }
        
        for(int i=0; i<T; i++){
            System.out.println(cycle(init[i]));
        }
    }
    
    public static int cycle(int cycle){
        int grow = 1;
        
        if(cycle == 0) return grow;
        
        else if((cycle%2) != 0){ //cycle is even
            grow = cycle(cycle-1)*2;
           // System.out.println("grow even: "+grow);
        }
        
        else{
            grow = cycle(cycle-1)+1;
           // System.out.println("grow odd: "+grow);
        }
        
        return grow;
    }
}
