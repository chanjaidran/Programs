package Geeks;

public class negativeElementsToOneSide {

	public static void main(String[] args) 
	{
		
		int arr[]= {-1,3,4,-2,-3,-7,-8};
		int arr1[]= {-1,3,4,-2,-3,-7,-8};
		int j=0,temp;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<0) {
				
				if (i!=j) {
					 swap(arr,i,j);
					
				}
					j++;	
			}	
		}
		printArray(arr, arr.length);
		System.out.println();
		shiftall(arr1, 0, arr1.length-1);
		printArray(arr1, arr1.length);
		
		}
	 static void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    }
	 public static void swap( int[] arr, int pos1,  int pos2){
		     int temp = arr[pos1];
		    arr[pos1] = arr[pos2];
		    arr[pos2] = temp;
		}
	 
	 static void shiftall(int[] arr, int left, int right) 
	 {
		 
		 while (left<=right) {
			
			 if (arr[left]<0 && arr[right]<0) {
				
				 left++;
			}
			 
			 else if (arr[left]>0 && arr[right]<0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			 
			 else if (arr[left]>0 && arr[right]>0) {
				right--;
			}
			 else {
				left++;
				right--;
			}
			 
		}
		 
	 }

}
