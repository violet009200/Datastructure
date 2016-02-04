package DS_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
Check whether a number is a fascinating number or not.
Fascinating Number : When a number( 3 digit or more) is multiplied by 2 and 3 ,
and when both these products are concatenated with the original number all digits from 1 to 9 are present exactly once, 
regardless of the number of zeroes.

Input

First line contains number of test cases T. Then following T lines contains an integer N.

Output

Output "Fascinating" if given number is fascinating else "Not Fascinating" . 
And print "Number should be atleast three digits" when user enters digits less than three.

Input:
5
192
853
76
426
256

Output:
Fascinating
Not Fascinating
Number should be atleast three digits
Not Fascinating
 */
public class FascinatingNumber {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			
			String s = sc.next();
			int n = Integer.parseInt(s);
			char[] cArray = s.toCharArray();
			System.out.println("Array "+Arrays.toString(cArray));
			if(cArray.length < 3) {
				System.out.println("number should at least three digits");
				//break;
				}
			else{
				int twon = n*2;
				int threen = n*3;
				String firstS = Integer.toString(twon)+Integer.toString(n); 
				String secondS = Integer.toString(threen)+Integer.toString(n);
				char[] firstArray = firstS.toCharArray();
				char[] secondArray = secondS.toCharArray();
				boolean result1 = checkDuplicate(firstArray);
				boolean result2 = checkDuplicate(secondArray);
				
				if(result1 != false || result2 != false){
					System.out.println("dup Not fasinating");
					
				}
				else System.out.println("Fasinating");
			}
				
		}
	}

	public static boolean checkDuplicate(char[] cArray) {
		HashSet<Character> hset = new HashSet<Character>();
		boolean duplicate = false;
		
		for(int i=0; i<cArray.length;i++){
			if(cArray[i] == 0) i++;
			else if(hset.add(cArray[i])==false) duplicate = true;
			
		}
		
		return duplicate;
		/*if(duplicate == true){
			System.out.println("dup Not fasinating");
			
		}
		else System.out.println("Fasinating");*/
	}

}
