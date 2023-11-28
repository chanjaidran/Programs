
public class findGivenElement {

	public static void main(String[] args) {
		
		int arr[]= {2,3,1,6,10,4};
		int n=4;
		boolean value=false;
		
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==n)
			{
				value=true;
				break;
			}
			else {
				continue;
			}
		}
		
		if(value)
		{
			System.out.println("Element found");
		}
		else {
			System.out.println("not found");
		}
	}
}
