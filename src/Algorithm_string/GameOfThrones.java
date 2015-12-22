package Algorithm_string;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


/*
 * check input string's anagram can be palindrome string
 */

public class GameOfThrones {
	/*
	 * if s.length is even, each alphabet should even
	 * s.length is odd, only one alphabet is odd
	 */
	public static String getPalindrom(String s){
		int numOdd = 0;
		int numEven = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i< s.length(); i++){
			char charat = s.charAt(i);
			
			if(!map.containsKey(charat))	map.put(charat,1);
			else map.put(charat, map.get(charat)+1);
		}
		
		
		Set<Character> keyset = map.keySet();
		
		for(Character c:keyset){
			int num = map.get(c);
			//System.out.println(num);
			if(num%2 == 0)	numEven++;
			else 	numOdd++;
		}
		
		
		if(numOdd != 1)	return "NO";
		else return "YES";
		
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan= new Scanner(System.in);
		String inputString = myScan.nextLine();
		String ans;
		ans = getPalindrom(inputString);
		
		System.out.println(ans);
		myScan.close();
	}

}
