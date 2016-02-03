package others;
import java.util.Scanner;

/*
 * input:
5
aaabbb
ab
abc
mnop
xyyx

 */
public class Solution2 {
	
	public static int compareString(String s){
		String left="";
        String right="";
		int numChange = 0;
		int lengthS = s.length();
	
		if(lengthS % 2 != 0) return -1;
		else{
			int half = lengthS/2;
			left = s.substring(0,half);
			right = s.substring(half);
			numChange = 0;
			for(int i=0; i<half; i++){
				char c = left.charAt(i);
				if(right.indexOf(c)<0) numChange++;
			}
			return numChange;
		}//else
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String input[] = new String[T];
	
		String s=sc.nextLine();
		for(int i = 0; i<T; i++){
			input[i] = sc.nextLine();

			int ans = compareString(input[i]);
			System.out.println(ans);
		}
	}

}
