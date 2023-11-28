import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hasmap {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,6,6};
		Map<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (map.get(arr[i])==null) 
			{
				System.out.println(arr[i]);
				
					map.put(arr[i], true);
				
				
			}
			
		}
		
		//for(Map.Entry<Integer, Integer> m2:map.entrySet())
		//{
			//System.out.println(m2.getKey()+" "+m2.getValue());
	//	}

	}

}
