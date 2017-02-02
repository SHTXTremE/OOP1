package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static String demand (String in){
		return in;
	}
	
//	public static String aray (int ar[][]){
//		
//	}
	
	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		int ar[][] = new int [20][2];
		int i=0;
		String in = "";
			while(!demand(in).equals("e")){
				int j=0;
				System.out.printf("Enter x%d : ",i+1);
				ar[i][j] = input.nextInt();
				j++;
				System.out.printf("Enter y%d : ",i+1);
				int y1 = input.nextInt();
				i++;
				System.out.print("(m)ore, (e)nd :");
				in = input.next();
			}
		if(demand(in).equals("e")){
			do{
				System.out.print("(s)how points, (q)uit :");
				in = input.next();
				if(demand(in).equals("s"))
				{
					for(int a=0;a<20;a++)
					{
						int j=0;
						System.out.printf("Point %d = (%d,%d)\n",i+1,ar[a][j],ar[a][j+1]);
					}
				}
			}while(!demand(in).equals("q"));
		}
	}
}
