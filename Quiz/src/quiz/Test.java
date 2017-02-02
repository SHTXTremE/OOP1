package quiz;

import java.util.Scanner;

public class Test {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long start = System.currentTimeMillis();
		String a = input.nextLine();
		long stop = System.currentTimeMillis();
		long duration = (stop-start)/1000;
		System.out.print(duration);
	}
}
