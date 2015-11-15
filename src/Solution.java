import java.util.Scanner;
/*
 5
 3
 1 2 3
 3
 2 1 3
 6
 3 2 1 5 4 6
 4
 1 3 4 2
 5
 3 4 5 1 2
 */

public class Solution {
	
	public static boolean isPreOrder(int[] list, int start, int end){
		
		if( end<=start) {
			//System.out.println("YES");
			return true;
		}
		
		int root = list[start];
		int i = start+1;
		
		while(i<=end && list[i] < root) i++;
		int right = i;
		
		while(i<=end && list[i]>root) i++;
		if(i!=end +1){
			//System.out.println("NO");
			return false;
		}
		
		return isPreOrder(list,start+1,right-1) && isPreOrder(list, right, end);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++){
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int j = 0; j<N; j++){
				arr[j] = sc.nextInt();
			}
			
			boolean ans = isPreOrder(arr, 0, arr.length-1);
			if(ans == true) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
