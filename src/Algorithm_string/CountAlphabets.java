package Algorithm_string;

import java.util.*;
import java.lang.*;
import java.io.*;
/*
2
adjfjh23
njnfn_+-jf
*/


class CountAlphabets {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String[] sArray = new String[num];
		
		for(int i=0 ; i<num ; i++){
			if(sc.hasNextLine())
				sArray[i]= sc.next();
		}
		
		
		
		//sc.close();
		int i=0;
		int count =0;
		while(true){
		    if(num == 0) break;
		    
		    
		    char[] ch = new char[sArray[i].length()];
		    ch = sArray[i].toCharArray();
		    //System.out.println(Arrays.toString(ch));
		    
		    for(int j=0; j<sArray[i].length();j++){
		        
		        if((ch[j]>= 'a' &&ch[j]<='z') || (ch[j]>='A'&&ch[j]<='Z'))
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		    i++;
		    num--;
		    count = 0;
		}
	}
}