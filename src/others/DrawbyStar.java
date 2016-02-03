package others;

//draw a rectangle by stars and numbers as shown   below 1 12 123 1234 12345 * ** *** **** ***** ****** 

public class DrawbyStar {
	
	
	public static void main(String[] args){
	for(int i=1;i<5; i++){
		for(int j=1; j<5; j++){
			if(i==j)
				for(int k = 0;k<j; k++)
					System.out.print("*");
			//else
				//System.out.print(" ");
		}
		System.out.println("");
	}
	}
}
