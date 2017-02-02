package my_pocket;

import java.util.Scanner;

public class Teddy {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		System.out.print("Please input room where Teddy is: ");
		String TeddyRoom = sc.nextLine();
		System.out.print("Please input list of searching floors: ");
		String floorList = sc.nextLine();
		int TeddyFloor = getTeddyFloor(TeddyRoom);
		int currentFloor = getNextFloor(floorList, i);
		for (int j = 0; j < floorList.length(); j++) {
			currentFloor = getNextFloor(floorList, i);
			if (isFloorValid(currentFloor) == true) {
				if (isTeddyHere(TeddyFloor, currentFloor) == false) {
					System.out.printf("Currently, you are on floor %d. Teddy is not here.\n",
							getNextFloor(floorList, i));
			
				} else if (isTeddyHere(TeddyFloor, currentFloor) == true) {
					System.out.printf("Congrats! Teddy is found on floor %d.\n", getNextFloor(floorList, i));
					System.exit(0);
				}
			} else if (isFloorValid(currentFloor) == false) {
				System.out.printf("Invalid floor %d!\n", getNextFloor(floorList, i));
			}
			i++;
		}
		System.out.printf("Teddy is on floor %d. Sorry, you miss him.",TeddyFloor);
	}

	public static int getTeddyFloor(String TeddyRoom) {
		int floor = 0;
		if (TeddyRoom.equals("Lobby")) {
			floor = 1;
		} else if (TeddyRoom.equals("Emergency Room")) {
			floor = 2;
		} else if (TeddyRoom.equals("ICU")) {
			floor = 3;
		} else if (TeddyRoom.equals("Pharmacy")) {
			floor = 4;
		} else if (TeddyRoom.equals("Ward")) {
			floor = 5;
		} else if (TeddyRoom.equals("Office")) {
			floor = 6;
		}
		return floor;
	}

	public static int getNextFloor(String floorList, int i) {
		
		i = floorList.charAt(i) - '0';
		return i;
	}

	public static boolean isTeddyHere(int TeddyFloor, int currentFloor) {
		if (TeddyFloor == currentFloor) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isFloorValid(int currentFloor) {
		if (currentFloor <= 6 && currentFloor >= 1) {
			return true;
		} else {
			return false;
		}
	}
}
