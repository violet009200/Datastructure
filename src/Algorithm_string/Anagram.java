package Algorithm_string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void DoAnagram(char[] ch){
        char[] right = new char[ch.length/2];
        char[] left = new char[ch.length/2];
        
        for(int i=0; i<ch.length/2; i++)    left[i] = ch[i];
        int k=0;
        for(int i=ch.length/2; i<ch.length; i++){
            right[k] = ch[i];
            k++;
        } 
        
        Arrays.sort(right);
        Arrays.sort(left);
        
        int count = 0;
        int i = 0;
        int j = 0;
        
        while(true){
            if(j == right.length || i == left.length )  break;
            if(left[i] == right[j]){
                i++;
                j++;
            }
/*            else if(left[i]<right[j]){
            	i++;
            	count++;
            }
            else {
                j++;
                count++;
            }*/
            else{
            	i++;
            	count++;
            }
              
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0; i<testcase; i++){
            String s = sc.next();
            char[] ch = s.toCharArray();
            //System.out.println(Arrays.toString(ch));
            if(ch.length%2 != 0) System.out.println(-1);
            else{
                DoAnagram(ch);
            }
        }
    }
}
