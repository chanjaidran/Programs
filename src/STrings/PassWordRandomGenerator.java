package STrings;

import java.util.Random;

public class PassWordRandomGenerator {
	public static void main(String[] args) {
		
		Random random=new Random();
		
		String arr[]= {"r","p","s"};
        
        String compute=arr[random.nextInt(arr.length)];
        System.out.println(compute);
        System.out.println(RequiredString(5));
        System.out.println(random.nextInt(10));
       
	}

	static String RequiredString(int n)
	{
	
	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXY" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
	// create StringBuffer size of AlphaNumericString
	System.out.println(AlphaNumericString.length());
	System.out.println((int)Math.random());
	StringBuilder s = new StringBuilder(n);
	int y;
	for ( y = 0; y < n; y++) {
	// generating a random number
	int index = (int)(AlphaNumericString.length()* Math.random());
	// add Character one by one in end of s
	
	s.append(AlphaNumericString.charAt(index));
	}
	return s.toString();
	}
}
