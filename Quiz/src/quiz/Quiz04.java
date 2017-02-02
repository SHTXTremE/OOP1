package quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("How many inputs: ");
		int in = input.nextInt();
		int ar[] = new int [in];
		int sum = 0;
		for(int i=0;i<in;i++)
		{
			System.out.printf("Enter input%d: ",i+1);
			ar[i] = input.nextInt();
			sum = sum+ar[i];
		}
		System.out.print("Your inputs  are ");
		for(int i=in-1;i>=0;i--)
		{
			System.out.printf("%d ",ar[i]);
		}
		System.out.print("\nSum of your inputs = "+sum);
	}
}
