import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class findIndexOfarray {
	
	public static void main(String[] args)
	{
		
		int arr[]= {1,2,3,4,5};
		int n=2;
		System.out.println(Arrays.binarySearch(arr, 2));
		System.out.println(findIndex(arr, n));
		System.out.println(findIndexUsingLinearSearch(arr, n));
		
		List<Integer> indexList= new  ArrayList<>();
		for(int i:arr)
		{
			indexList.add(i);
		}
		
		
		System.out.println(indexList.contains(n));
		
		System.out.println(findIndexUsingArrayList(arr, n));
		
	LinkedList<Integer> linkedList=	indexList.stream().map(x->x).collect(Collectors.toCollection(LinkedList::new));
	//linkedList.sort(Comparator.comparing(Integer::valueOf));
linkedList.sort(Comparator.reverseOrder());
System.out.println(linkedList);
		
		
	}
	
	public static int findIndexUsingArrayList(int arr[],int n)
	{
		List<Integer> indexList= new  ArrayList<>();
		for(int i:arr)
		{
			indexList.add(i);
		}
		
		if(indexList.contains(n))
				{
			return indexList.indexOf(n);
				}
		return -1;
		
	}
	
	public static int findIndex(int arr[],int n)
	{
		int index=Arrays.binarySearch(arr, n);
		if (index<0) {
			return -1;
		}
		else {
			return index;
		}
		
	}
	
	public static int findIndexUsingLinearSearch(int arr[],int n)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]==n) {
			
				return i;
			}
			
		}
		return -1;
		
	}
}
