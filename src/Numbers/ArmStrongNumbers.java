package Numbers;

public class ArmStrongNumbers {

	//cube of numbers equals to original number
	public static void main(String[] args) {
		
		int n=153;
		System.out.println(armStrongNumber(n));
	}
	
	public static boolean armStrongNumber(int n)
	{
		int temp=n;
		int sum=0;
		while (n!=0) {
			int number=n%10;
			sum=(int)(sum+(Math.pow(number, 3))); //27+125+1
			n=n/10;			
		}
		
		if (temp==sum) {
			return true;
		}
		
		return false;
	}

}
