import java.util.Scanner;

/*
 * Given an integer find the immediate larger integer that that which is a palindrome, 
 * example 1234212 -> 1234321, 345676 -> 346643.
 */

public class NextPalindrome {
	
	public static int inputInt=0;

	public static void main(String[] args) {
		
		//Get user input
		System.out.println("Please enter number");
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		inputInt = Integer.parseInt(input);
		
		int middle= 0;
		String left = "";
		String right = "";
		char mid = 0;
		
		String result = "";
		
		//Check the length of input is odd or even
		boolean isOdd = false;
		
		if(input.length()%2 != 0) //isOdd
		{
			isOdd = true;
		}
		
		middle = input.length()/2;

		if(isOdd){
			left = input.substring(0,middle);
			right = input.substring(middle+1);
			mid = input.charAt(middle);
			result = compareOdd(left,right,mid);
		}
		else{ //isEven
			left = input.substring(0,middle);
			right = input.substring(middle);
			result=compareEven(left,right);
		}
		
		
		System.out.println("result is "+result);
	} 
	
	public static String compareOdd(String left, String right, char mid){
		String reverseLeft = new StringBuffer(left).reverse().toString();
		int reverseLeftInt = Integer.parseInt(reverseLeft);
		int leftInt = Integer.parseInt(left);
		int rightInt = Integer.parseInt(right);
		String result = "";
		int resultInt = 0;
		String newLeft= left+mid;
		int newLeftInt = Integer.parseInt(newLeft);
		
		while(resultInt<inputInt){
			
			if(reverseLeftInt > rightInt){
				result = newLeft+reverseLeft;
				resultInt = Integer.parseInt(result);
		
			}
			else{
				int a = newLeftInt +1;
				String aString = Integer.toString(a);
				result = aString+reverseLeft;
				resultInt = Integer.parseInt(result);
			}
			
		}
		
		return result;
	}
	
	public static String compareEven(String left, String right){
		String reverseLeft = new StringBuffer(left).reverse().toString();
		int reverseLeftInt = Integer.parseInt(reverseLeft);
		int leftInt = Integer.parseInt(left);
		int rightInt = Integer.parseInt(right);
		String result = "";
		
		
		while(reverseLeftInt <= rightInt){
			leftInt = leftInt+1;
			left = Integer.toString(leftInt);
			reverseLeft = new StringBuffer(left).reverse().toString();
			reverseLeftInt = Integer.parseInt(reverseLeft);
			
			int resultInt = Integer.parseInt(left+reverseLeft);
			
			
			if(inputInt < resultInt) break;
			
		}
		
		result = left+reverseLeft;
		
		return result;
	}

}
