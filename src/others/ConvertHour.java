package others;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConvertHour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String resultTime="";
        String noHour = time.substring(2, 8);
        String hour = time.substring(0,2);
        String min = time.substring(3,5);
        String sec = time.substring(6,8);
        String ampm = time.substring(8);
        
        int hourInt = Integer.parseInt(hour);
       /* 
        if(hour.equals("12") && min.equals("00") && sec.equals("00")){
        	resultTime = time;
        	System.out.println(resultTime);
        	return;
        }
        */
        if(ampm.equals("PM"))    {
        	
        	hourInt = hourInt+12;
        	
        	if(hour.equals("12")){
        		hourInt = 12;
        	}
        	
        }
        
        else if(hour.equals("12")){
        	hourInt = 0;
        }
        
        if(hourInt >10){
        	 hour = Integer.toString(hourInt);
        }
        else{
        	hour = 0+Integer.toString(hourInt);
        }
        
        resultTime = hour+noHour;
        
       
        
        System.out.println(resultTime);
    }
}