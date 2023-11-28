package leetcode;

public class Qno27 {

	public static void main(String[] args) {
	int arr[]	= {0,1,2,2,3,0,4,2};
	System.out.println(removeElement(arr, 2));
	}

public static int removeElement(int[] nums, int val){
	
	int k=0;
	for (int i = 0; i < nums.length; i++) {
		if (val==nums[i]) {
			continue;
		}
		else {
			nums[k]=nums[i];
			System.out.println(nums[k]+"s");
			k++;
		}
		
		

	}
	
		
	return k;
        
    }
}








