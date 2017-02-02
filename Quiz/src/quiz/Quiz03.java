package quiz;

import java.util.Scanner;
import java.util.Random;

public class Quiz03 {
	public static void main(String arg[]){
		Scanner input = new Scanner (System.in);
		
		int x = 0,tries;
		String demand = "";
		
		do{
			Random rand = new Random();
			int n = rand.nextInt(999)+0;//Random a number between 999-0
			tries=0;
			do{
				
				tries++;
				System.out.println("Note:the random number is "+n);
				System.out.print("Guess a number (0-999):");
				x = input.nextInt();
				if(x<n)
					System.out.println("Less than "+"(Tries:"+tries+")");
				else if(x>n)
					System.out.println("More than "+"(Tries:"+tries+")");
			}while(x!=n);
		
			System.out.println("Correct! Well done!");
			System.out.println("Total tries = "+tries);
			System.out.print("----------\n(P)lay again, (Q)uit:");
			demand = input.next();
		}while(demand.equals("P"));
		System.out.print("Bye Bye");
	}
}
