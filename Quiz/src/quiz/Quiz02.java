package quiz;
//elab-source: Quiz02.java

import java.util.Scanner;

public class Quiz02 
{
	public static void main (String args [])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("(R)egular (T)eacher or (S)tudent?: ");
		String type = input.nextLine();
		System.out.print("How many hours?: ");
		double hour = input.nextDouble();
		double result = Math.ceil(hour);
		double fee=0;
		double total=0;
		if(result <= 1)
			fee = 0;
		else if(result == 2)
			fee = 20;
		else if(result == 3)
			fee = 30+20;
		else
		{
			if(type.equals("R"))
				total = ((result-3)*10)+30+20;
			else if(type.equals("T"))
				total = ((result-3)*(10*0.75))+30+20;
			else if(type.equals("S"))
				total = ((result-3)*(10*0.5))+30+20;
		}
		System.out.printf("Total parking fee is %.2f Baht",total+fee);
	}
}
