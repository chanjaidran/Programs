
public class NoOfOccuers {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,1,3,1};
		System.out.println(count(arr, 6, 1));
		System.out.println(arr.length);

	}
	
	static int count(int[] arr, int n, int x) {
		int c=0;
		for (int i = 0; i < n; i++) {
			if (x==arr[i]) {
				c++;
			}
		}
		
			return c;
	        // code here
	    
	}
}
