package others;
import java.util.Scanner;

/*
 * You are given an integer N. 
 * Find the digits in this number that exactly divide N (division that leaves 0 as remainder) 
 * and display their count. For N=24, there are 2 digits (2 & 4). 
 * Both of these digits exactly divide 24. So our answer is 2.
 */

public class DivideDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int T = sc.nextInt();
		int arr[] = new int[T];
		for(int i= 0; i<T; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<T; i++){
			int a, b;
			//a = arr[i]/10;
			a = arr[i];
			b = a%10;
			
			while(a>0){
//				System.out.println("a is: "+a);
				if(b!=0 && arr[i]%b == 0){
//					System.out.println("b is: "+b);
					count++;
				}
				a = a/10;
				b = a%10;
			}
			System.out.println(count);
			count = 0;
		}
		

	}

}
