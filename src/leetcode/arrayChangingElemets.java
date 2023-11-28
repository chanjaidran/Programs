package leetcode;

public class arrayChangingElemets {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,2,4,5,5,1,3,6,1};
	

		int k=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=0) {
				
			
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					k++;
					arr[j]=0;
					break;
				}
				
			}
			}
		}
		
		System.out.println(k);
	}

}
