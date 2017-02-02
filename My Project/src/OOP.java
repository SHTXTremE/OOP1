import java.util.Scanner;

public class OOP {
	
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		System.out.println("Wait for some seconds " + "just hit enter: ");
		Scanner s = new Scanner (System.in);
		s.nextLine();
		long stop = System.currentTimeMillis();
		long duration = (stop-start)/1000;
		System.out.println("You have waited for " +duration +" seconds");
	}
}
