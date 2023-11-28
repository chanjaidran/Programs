
public class PrimeCheck {

	public static void main(String[] args) {
		
		int number=13;
		boolean checkPrime=true;
		
		for (int i = 2; i <=number/2; i++) 
		{
			if (number%i==0) {
				
				checkPrime=false;
				break;
			}
			
			
		}
		if (checkPrime) {
			System.out.println("Prime number" +" "+number);
		}
		else {
			System.out.println("Not prime"+" "+number);
		}

	}

}
