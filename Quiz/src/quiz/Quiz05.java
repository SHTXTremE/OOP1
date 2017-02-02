package quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Room 1\n");
		System.out.println("How many students?");
		int stu = input.nextInt();
		double scr[] = new double [stu];
		String name[] = new String [stu];
		double sum = 0,y=0;
		for(int i = 0 ; i<stu ; i++)
		{
			System.out.println("Enter student "+(i+1)+" name :");
			name [i] = input.next();
			System.out.println("Enter student "+(i+1)+" score :");
			scr[i] = input.nextInt();
			sum = sum + scr[i];
			y++;
		}

		for(int i = 0 ; i<stu ; i++)
		{
			System.out.printf("%s, score = %.0f, ",name[i],scr[i]);
			if(scr[i]>=80)
				System.out.println("grade = A");
			else if(scr[i]>=70)
				System.out.println("grade = B");
			else if(scr[i]>=60)
				System.out.println("grade = C");
			else if(scr[i]<60)
				System.out.println("grade = F");
		}
		System.out.printf("Sum of Room 1 = %.0f\n",sum);
		double mean = sum/y;
		System.out.printf("Mean score of Room 1 = %.2f",mean);
	}
}
