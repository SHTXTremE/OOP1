package one;

import java.util.Scanner;

public class One {
	
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		String in = "";
		int max = 0 ,min=0;
		do{	
			System.out.print("How many elements? : ");
			int num = input.nextInt();
			int ele [] = new int [num];
			for(int i=0 ;i<num;i++)
			{
				System.out.printf("Enter element %d : ",i+1);
				ele[i] = input.nextInt();
				min = Math.min(ele[i], min);
				max = Math.max(ele[i], max);
				if(i==0)
					min = ele[i];
				if(i==0)
					max = ele[i];
			}
			do{	
				System.out.print("Select menu:\nma(x), (m)in, (n)ew, (q)uit:");
				in = input.next();
				if(in.matches("x"))
					System.out.println("Max is "+max);
				else if(in.matches("m"))
					System.out.println("Min is "+min);
			}while(in.matches("x")||in.matches("m"));
		}while(in.matches("x")||in.matches("m")||in.matches("n"));
		System.out.print("Bye");
	}
}
