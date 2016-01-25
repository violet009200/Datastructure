package Algorithm_string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String f = sc.next();
		String s = sc.next();
		
		char[] first = f.toCharArray();
		char[] second = s.toCharArray();
		
		int deletion = 0;
		
		Arrays.sort(first);
		Arrays.sort(second);
		int i=0;
		int j=0;
		
		
		while(true){
			if(i == first.length){
				deletion+=second.length-j;
				break;
			}
			if(j == second.length){
				deletion+=first.length-i;
				break;
			}
			
			if(first[i] == second[j]){
				i++;
				j++;
			}
			else if(first[i]<second[j]){
				deletion++;
				i++;
			}
			else{
				deletion++;
				j++;
			}
		}
		System.out.println(deletion);
	}

}
