import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromArray {
	
	public static void main(String[] args) 
	{
					int arr[] = {1,5,4,1,7,4,9,6};
					Set<Integer> storeSet=new HashSet<Integer>();
					
					boolean isDuplicate=false;
					
					for(int i=0;i<arr.length;i++)
					{
						if (storeSet.contains(arr[i])) {
							isDuplicate=true;
							System.out.println(arr[i]);
						}
						
						else {
							storeSet.add(arr[i]);
							System.out.println(arr[i]+" set");
						}
					}
					
					
	}

}
