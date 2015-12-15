package Algorithm_string;
import java.util.Scanner;

/*
 * Pangram: sentences constructed by using every letter of the alphabet at least once.
 * Input: We promptly judged antique ivory buckles for the next prize    -> pangram
 * input: We promptly judged antique ivory buckles for the prize  -> not pangram
 */

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.length()<26){
			System.out.println("not pangram");
			return;
		}
		
		char c;
		String sNew = s.toUpperCase();
		
		for(c = 'A'; c<'Z'; c++){
			//char cLower = Character.toLowerCase(c);
			if(sNew.indexOf(c)<0){
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("pangram");
		return;
	}

}
