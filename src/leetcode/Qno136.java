package leetcode;

import java.util.HashMap;
import java.util.Map;

import hackRank.staircase;

public class Qno136 {

	public static void main(String[] args) {
		
		int nums[]= {1,2,2,3,3};
		System.out.println(singleNumber(nums));
		
	}


	public static int singleNumber(int arr[])
	{
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int x=0;
		for(Map.Entry<Integer,Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				x=m.getKey();
			}
				
		}
		return x;
	}
	
 }
