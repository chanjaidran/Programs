package leetcode;

import java.util.Arrays;

/*34. Find First and Last Position of Element in Sorted Array
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]*/

public class Qno34 {

	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10,};
		int target= 7;
	
		int arr[]=searchRange(nums, target);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}
	
public  static int[] searchRange(int nums[], int target) {
	int ans[]= {-1,-1};
	ans[0]=search(nums, target, true);
	ans[1]=search(nums, target, false);
	return ans;
        
    }


public static int search(int arr[],int target,boolean fisrtStartIndex)
{
	int ans=-1;
	int start=0;
	int end=arr.length-1;
	
	while (start<=end) {
		
		int mid=start+(end-start)/2;
		
		if (target<arr[mid]) {
			
			end=mid-1;
		}
			
		
		else if (target>arr[mid]) {
			
			start=mid+1;
		}
		else {
			ans=mid;
			if (fisrtStartIndex) {
				end=mid-1;
				
			}
			else {
				start=mid+1;
			}
			
		}
		
		
		
	}
	
	
	
	
	return ans;
	
}

}
