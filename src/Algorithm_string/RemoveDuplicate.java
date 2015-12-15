package Algorithm_string;
import java.util.Scanner;

/*
5
AAAA	
BBBBB
ABABABAB
BABABA
AAABBB
*/

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++){
			String s = sc.next();
			System.out.println(s);
			int n = delete(s);
			System.out.println(n);
		}
	}
	
	public static int delete(String s){
		int deleteNum = 0;
		
		for(int i=0; i<s.length()-1;i++)
		{
			if(s.charAt(i) == s.charAt(i+1)) deleteNum++;
			
		}
		return deleteNum;
	}

}
