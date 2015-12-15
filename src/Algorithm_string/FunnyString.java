package Algorithm_string;
import java.util.Scanner;
/*
 * 
2
acxz
bcxz

 */
public class FunnyString {
	
	public static boolean checkFunny(String s){
		String sr = new StringBuilder(s).reverse().toString();
		
		int l = s.length();
		//System.out.println(x);
		for(int i=0; i<l-1; i++){
			int val1 = Math.abs(s.charAt(i) - s.charAt(i+1));
			int val2 = Math.abs(sr.charAt(i) - sr.charAt(i+1));
			//System.out.println(val1+" "+val2);
			if(val1 != val2) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numLine = sc.nextInt();
		
		for(int i = 0; i<numLine; i++){
			String s = sc.next();
			
			boolean result = checkFunny(s);
			
			if(result == false) System.out.println("not funny");
			else System.out.println("funny");
		}
	}

}
