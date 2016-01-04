package DS_Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Majority Element: A majority element in an array A[] of size n 
//is an element that appears more than n/2 times (and hence there is at most one such element).

public class MajorityElem {
	
	public static void useHashMap(int[] arr){
		int size = arr.length;
		int n = size/2;
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

		for(int i = 0; i<size; i++){
			if(hmap.containsKey(arr[i])){
				
				hmap.put(arr[i], (hmap.get(arr[i]))+1);
			
			}
			else{
				hmap.put(arr[i],1);
			}
		}
		
		//System.out.println(hmap.toString());
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			Map.Entry<Integer, Integer> mt = (Map.Entry)iter.next();
			if(mt.getValue() > n){
				System.out.println(mt.getKey());
				return;
			}
		}
		System.out.println("NONE");
	}
	
	public static void main(String[] args){
		int[] arr = {3,3,4,2,4,4,2,4,4};
		int[] arr2 = {1,2,3,2,1,4,2,5,4};
		
		useHashMap(arr);
		useHashMap(arr2);
		
		
		
	}
}
