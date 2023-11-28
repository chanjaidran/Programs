package STrings;

import java.util.Stack;

public class stringRevUsingStack {

	public static void main(String[] args) 
	{
		
			String name="Jaichandran";
			name=rev(name.toCharArray());
			System.out.println(name);

	}

	private static String rev(char[] str) {
		
		Stack<Character> characters=new Stack<Character>();
		for (int i = 0; i < str.length; i++) 
		{
			characters.push(str[i]);
			
		}
		
		for (int i = 0; i < str.length; i++) 
		{
			str[i]=characters.peek();
			
			characters.pop();
			
		}
		
		
		return String.valueOf(str);
	}
	
	

}
