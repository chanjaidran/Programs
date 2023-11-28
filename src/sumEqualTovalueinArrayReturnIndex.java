
public class sumEqualTovalueinArrayReturnIndex {

	public static void main(String[] args) {
		
		int arr[]= {10,20,5,30,40,50};
		int element=50;
		
		int j=0;
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int k = 1; k < arr.length; k++) {
				
                        if (arr[i]+arr[k]==element) {
					
					System.out.println(arr[i]+" "+arr[k]);
					System.out.println(i+" "+k);
				}
			}
				
		}
		
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		
		
		int sum=5;
		System.out.println("------------------------------");
		System.out.println(countPairs(arr1, arr2, sum));
	}
	
	static int countPairs(int arr1[],int arr2[],int sum)
	{
		int count =0;
		for (int i = 0; i < arr1.length; i++)
		{
			for (int k = 0; k < arr2.length; k++) {
				
                        if (arr1[i]+arr2[k]==sum) {
                        	count++;
					
				}
			}
				
		}
		
		
		return count;
		
	}

}
