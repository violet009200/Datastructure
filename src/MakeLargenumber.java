import java.util.ArrayList;
import java.util.Scanner;

/*
 * Given a number whose digits are unique, 
 * find the next larger number that can be formed with those digits.
 * ex. input: 167893 result: 167938
 */

public class MakeLargenumber {
	
	

	public static void main(String[] args) {
		
		/*read input from user*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		System.out.println("ex, 534976 right result:536479");
		String input = scan.nextLine();
		
		/*save each digits of number into arraylist*/
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		for(int i=0; i<input.length(); i++){
			int digit = Integer.parseInt(input.substring(i,i+1)); //split digits
			
			if(digits.contains(digit)){	//check digits already has the number
				System.out.println("Every digit of the number must be unique");
				return;
			}
			else
				digits.add(digit);
		}//for
		
		/*System.out.println("print arrayList: "+digits);*/
		findNextNumber(digits, digits.size());
	}
	
	/*compare two digits*/
	private static void findNextNumber (ArrayList<Integer> digits, int n){
		int i,j;
		
		for(i= n-1; i>0; i--){
			if(digits.get(i)>digits.get(i-1))
				break;
			
		}
		
		if(i==0){
			System.out.println("NOT POSSIBLE");
			return;
		}
		
		int x= digits.get(i-1);
		int smallest = i;
		
		for(j=i+1; j<n; j++){
			if(digits.get(j)>x && digits.get(j)<digits.get(smallest))
					smallest= j;
		}
		
		digits= swap(digits, smallest, i-1);
		
		digits = sort(digits, i-1, digits.size()-1);
		
		/* convert arrayList to String */
		String result = "";
		
		for(Integer s: digits){
			result+=s;
		}
		System.out.println("next number is : "+result);
		return;
	}
	
	private static ArrayList sort(ArrayList<Integer> digits, int i, int j){
		
		for(i=i+1;i<j;i++){
			for(int a= i+1; a<=j;a++){
				if(digits.get(i)>digits.get(a)){
					swap(digits, i, a);
				}
			
			}
			
		}
		return digits;
	}
	
	/*swap digits[i] and digits[j]*/
	private static ArrayList swap(ArrayList<Integer> digits, int i, int j){
		int temp;
		temp = digits.get(i);
		digits.set(i, digits.get(j));
		digits.set(j, temp);
		
		return digits;
	}
	
	

}
