package DS_Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindNumofOdd {
	
	public static void useHashMap(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< arr.length; i++){
			if(arr[i] %2 !=0){
				if(map.containsKey(arr[i])){
					map.put(arr[i], map.get(arr[i])+1);
				}
				else map.put(arr[i],1);
			}
		}
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			Map.Entry<Integer, Integer> me = (Map.Entry)iter.next();
			
			System.out.println("Number "+ me.getKey()+ " is in array "+me.getValue()+" times");
		}
	}
	

	
	public static void main(String[] args){
		int[] arr = {1,2,3,2,3,1,3};
		useHashMap(arr);
		
		
	}
}
