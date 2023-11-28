import java.util.Arrays;
import java.util.List;

public class hackerank {

	public static void main(String[] args) {
		
		//int arr[]= {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int arr[]= {1, 1, 3, 1, 2, 1, 3 ,3 ,3, 3};
		
		int count=0;
	
		for (int i = 0; i<arr.length; i++) {
			
			if (arr[i]!=0) {
				
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					count++;
					
					arr[j]=0;
					break;
					
				}
				
				
			}
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println(count+"count");
		

	}
	
public static int sockMerchant(List<Integer> ar) {
    

	Integer[] arr = ar.toArray(new Integer[0]);
	int count=0;
	boolean flag=false;
	for (int i = 0; i<arr.length; i++) {
		
		for (int j = i+1; j < arr.length; j++) {
			
			if (arr[i]==arr[j]) {
				count++;
				flag=true;
				
			}
			
			
		}
		if (flag) {
			break;
		}
	}
	return count;
        

    }   

    

}
