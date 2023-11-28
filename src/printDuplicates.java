import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class printDuplicates {

	public static void main(String[] args) {
		int arr[]= {2,3,1,2,3,6,9,0,9};
		int n=5;
		
		System.out.println(duplicates(arr, n));

	}

	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		
		
		
		int k=0;
		boolean flag=false;
		ArrayList<Integer> aList=new ArrayList<Integer>();
		Set<Integer> duList=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					flag =true;
					duList.add(arr[i]);
				}
			}
		}
		
		aList.addAll(duList);
		 
		
		return aList;
		
		
		
		

    }
}


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
         ArrayList<Integer> list=new  ArrayList<Integer>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                set.add(arr[i]);
            }
           
        }
        list.addAll(set);
        if(list.size()==0)
        {
            list.add(-1);
        
        }
        else
        {
            Collections.sort(list);
        }
        return list;
    }
    
}