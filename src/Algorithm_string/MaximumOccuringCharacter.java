package Algorithm_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Input:
2
testsample
geeksforgeeks

Output:
e
e
 */
public class MaximumOccuringCharacter {
	
	public static void findMaxChar(String s){
		char[] arr = s.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for(int i=0; i<arr.length;i++){
			if(hmap.containsKey(arr[i])) 	hmap.put(arr[i], hmap.get(arr[i])+1);
			else	hmap.put(arr[i],1);
		}
		
		int max = 0;
		char maxchar = 0;
		
		Set set = hmap.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			Map.Entry mentry = (Map.Entry) iter.next();
			
			if((int)mentry.getValue()>max){
				max = (int) mentry.getValue();
				maxchar = (char) mentry.getKey();
			}
			else if((int)mentry.getValue() == max){
				if(maxchar>(char)mentry.getKey())	maxchar = (char)mentry.getKey();
			}
		}
		System.out.println(maxchar);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			String s = sc.next();
		
			findMaxChar(s);
		}

	}

}
