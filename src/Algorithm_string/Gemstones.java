package Algorithm_string;
/*
 * find number of char which occur in rocks only once.
 
 input
3
abcdde
baccd
eeabg

output
2

only a and b occur once in each line
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
	
	static int num;
	
	public static void count(String[] sArr){
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer> ();
		int countChar = 0;
		int[] alphabet = new int[26];
	
		
		
		for(int i=0; i<num; i++){
			//System.out.println("line");
			char[] chArr = new char[sArr[i].length()];
			chArr = sArr[i].toCharArray();
		
			
			for(int j=0; j<chArr.length;j++){
				char charAt = chArr[j];
			
				if(!hm.containsKey(charAt)) {
					hm.put(charAt, 1);
					
				}
				else hm.put(charAt, hm.get(charAt)+1);
				
			}
			System.out.println(hm);
			for(int j=0; j<chArr.length;j++){
				char charAt = chArr[j];
				int a = 0;
				if(hm.get(charAt) == 1){
					a = (int)charAt-97;
					alphabet[a]++;
				}
				//System.out.println(charAt+"->"+alphabet[a]);
			}
			
			//System.out.println(Arrays.toString(alphabet));
			
			hm.clear();
			
		}
		
		for(int i=0; i<alphabet.length;i++){
			if(alphabet[i] ==num) countChar++;
		}
		
		System.out.println(countChar);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	
		String[] sArr = new String[num];
		
		for(int i=0; i<num ;i++){
			sArr[i] = sc.next();
		}
		
		count(sArr);
		
	}

	

}
