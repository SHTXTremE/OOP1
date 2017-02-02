package my_pocket;
//elab-source: TestCode.java

import java.util.Scanner;

public class TestCode {
	
	public static int getTeddyFloor(String TeddyRoom){
		int floor = 0;
		if(TeddyRoom.equals("Lobby")){
			floor=1;
		}
		else if(TeddyRoom.equals("Emergency Room")){
			floor=2;
		}
		else if(TeddyRoom.equals("ICU")){
			floor=3;
		}
		else if(TeddyRoom.equals("Pharmacy")){
			floor=4;
		}
		else if(TeddyRoom.equals("Ward")){
			floor=5;
		}
		else if(TeddyRoom.equals("Office")){
			floor=6;
		}
		return floor;
	}
	
//	public static int getNextFloor(String floorList, int i){
//		
//	}
//
//	public static boolean isTeddyHere (int teddyFloor,int currentFloor){
//		
//	}
//	
//	public static boolean isFloorValid (int currentFloor){
//		
//	}
	
	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		System.out.print("Please input room where Teddy is: ");
		String Teddyroom = input.nextLine();
		System.out.print("Please input list of searching floors: ");
		String in = input.nextLine();
		String ar[] = new String [in.length()];
		for(int a=0;a<in.length();a++)
		{
			ar[a] = in.substring(a, a+1);
		}
}
	}
