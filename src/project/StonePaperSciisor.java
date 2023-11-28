package project;

import java.util.Random;
import java.util.Scanner;

public class StonePaperSciisor {

	public static void main(String[] args) {


		Random random=new Random();
         
//         for (int i = 0; i < 10; i++) {
//        	 int ran1=random.nextInt(100);
//        	 System.out.println(ran1);
//		}
//    
//         System.out.println(Math.random());
//         System.out.println(Math.random());
		 Scanner scanner=new Scanner(System.in); 
		
		 while(true)
		 {
		 
         String arr[]= {"r","p","s"};
         
         String compute=arr[random.nextInt(arr.length)];
        
        // System.out.println(compute);
		  System.out.println("Enter the \"R\" or \"P\" or \"S\" ");
		  String playerMove;
		  while(true)
		  {
		  playerMove=scanner.nextLine();
		  
		  if (playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s"))
		  {
			  break;
			  
		  }
		    System.out.println(playerMove +" is not valid ");  
		  }
		  
		  System.out.println(" compute is played " + compute );
		  
		  if (playerMove.equals(compute))
		  {
			 System.out.println("Game is Tied");
		  }
		  
		  else if (playerMove.equals("r")) {
			if (compute.equals("p")) {
				System.out.println("you lose");
			}
			else if (compute.equals("s")) {
				System.out.println("you win");
			}
		}
		  
		  else if (playerMove.equals("p")) {
				if (compute.equals("s")) {
					System.out.println("you lose");
				}
				else if (compute.equals("r")) {
					System.out.println("you win");
				}
			}
		  
		  else if (playerMove.equals("s")) {
				if (compute.equals("r")) {
					System.out.println("you lose");
				}
				else if (compute.equals("p")) {
					System.out.println("you win");
				}
			}
		  
		  System.out.println("Do you wanna! play again(y/n)");
		  String again=scanner.nextLine();
		  if(!again.equals("y"))
              break;
		 }
	}

}
