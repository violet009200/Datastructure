package Algorithm_string;

import java.util.Arrays;
import java.util.Scanner;

/*
changes all the words in the letter into palindromes.

input
4
abc
abcba
abcd
cba

output
2
0
4
2
 */
public class LoveLetter {
	 static int times = 0;
	
	public static void changePalindromes(String s){
		StringBuffer sbuffer = new StringBuffer(s);
		int length = s.length();
	
	
			char[] charArr = new char[length];
			charArr = s.toCharArray();


			int i = 0; 
			int last = length-1;
	
			
			while(!(s.equals(sbuffer.reverse().toString())) && (i<=last)){
				
				
				if(charArr[i]==charArr[last] ){
					
					i++;
					last--;
					
					if(!(s.equals(sbuffer.reverse().toString())) && (i<=last)) continue;
					
				
				}
				
				else if((int)charArr[i] > (int)charArr[last]){
					int val = (int)charArr[i]-1;
					charArr[i] = (char)val;
					times++;
					s = new String(charArr);
					System.out.println(s);
										
				}
				
				else{
					int val = (int)charArr[last]-1;
					charArr[last] = (char)val;
					times++;
					s = new String(charArr);
					System.out.println(s);
				}
				
			
			}//while
			
			System.out.println(times);
			times = 0; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num;i++){
			String s = sc.next();
			changePalindromes(s);
			
		}
	}

}
