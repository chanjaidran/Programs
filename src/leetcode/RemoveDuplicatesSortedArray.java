package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,3,3,4,5,5};
		
		printDuplicates(arr, arr.length);

	}
	
	private static void printDuplicates(int[] arr, int n) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
         
        for(Entry<Integer,Integer> entry : map.entrySet())
        {
            // if frequency is more than 1
            // print the element
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+ " " +entry.getValue());
                dup = true;
            }
            System.out.println();
        }
        // no duplicates present
        if(!dup){
            System.out.println("-1");
        }
    }
	
	public static void RemoveDuplicates(int arr[])
	{
	
		int k=1;
		for (int i = 1; i < arr.length; i++) 
		{
			
			if (arr[i]!=arr[k-1]) 
			{
				arr[k]=arr[i];
				k++;
				
			}
			
		}
			
		for (k = 1; k < arr.length; k++) {
			System.out.println(arr[k]);
		}	
	}

}
