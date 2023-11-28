package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Qno26 {

	public static void main(String[] args) {
		
		int[] arr= {0,0,1,1,1,2};
		System.out.println(removeDuplicates(arr));
	}

	
	
	
	    public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }

	        int k = 1; // Initialize the count of unique elements to 1
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[k - 1]) {          
	            	
	                nums[k] = nums[i]; // Overwrite the next unique element
	            	
	                k++;
	            }
	        }
	        
	     
	        
	        return k;
	    }
	    
	    public static int removeDuplicate(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }

	        int k = 0; // Initialize the count of unique elements to 1
	        for (int i = 0; i < nums.length; i++) {
	            if (i<nums.length-1 && nums[i] == nums[i+1]) {          
	            	continue;
	                
	            }
	            else {
					nums[k]=nums[i];
					k++;
				}
	        }
	        
	     
	        
	        return k;
	    }
	}

/*static int removeDuplicates(int[] arr)

{
	
	Set<Integer> set=new HashSet<Integer>();
	
	boolean flag=false;
	for (int i = 0; i < arr.length; i++) {
		
		
		for (int j = i; j < arr.length; j++) {
			
			if (arr[i]==arr[j]) {
				flag=true;
				
				break;
				
			}
			
		}
		set.add(arr[i]);
	}
	return set.size();
	
	
}*/
