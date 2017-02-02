package house_jk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeadQuater {
	public static Scanner sc = new Scanner(System.in);
	List<House> houses;

	public HeadQuater() {
		this.houses = new ArrayList<>();
	}

	public static void main(String[] args) {
		HeadQuater hq = new HeadQuater();
		boolean running = true;
		while (running) {
			System.out.print("(n)ew house, (c)hoose house, (p)rint bill, (q)uit: ");
			String option = sc.nextLine();
			switch (option) {
			case "p":
				hq.printBill();
				break;
			case "n":
				hq.createNewHouse();
				break;
			case "c":
				System.out.print("Enter a house number: ");
				int houseNum = Integer.parseInt(sc.nextLine());
				hq.chosedHouse(houseNum);
				break;
			case "q":
				System.out.println("BYE.");
				running = false;
			default:
				break;
			}
		}

	}

	public void chosedHouse(int houseNum) {
		House chosenHouse = this.houses.get(houseNum - 1);
		while (true) {
			System.out.print("(a)dd, (s)how, (o)n/off, (m)ain menu: ");
			String option = sc.nextLine();
			switch (option) {
			case "a":
				chosenHouse.add();
				break;
			case "s":
				chosenHouse.show();
				break;
			case "o":
				chosenHouse.on_off();
				break;
			case "m":
				return;
			default:
				break;
			}
		}
	}

	public void createNewHouse() {
		System.out.print("Enter a house name: ");
		String name = sc.nextLine();
		String houseName = String.format("House %d : %s", houses.size() + 1, name);
		this.houses.add(new House(houseName));
		printHouseNames();
	}

	public void printHouseNames() {
		for (int i = 0; i < houses.size(); i++) {
			System.out.println(houses.get(i).name);
		}
	}

	public void printBill() {
		if (this.houses.isEmpty()) {
			System.out.println("No house!");
			return;
		}
		for (int i = 0; i < houses.size(); i++) {
			houses.get(i).printBill();
		}
	}
}
