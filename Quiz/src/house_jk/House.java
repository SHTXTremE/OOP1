package house_jk;

import java.util.ArrayList;
import java.util.List;

public class House {
	String name;
	List<Device> devices;

	public House(String name) {
		this.name = name;
		this.devices = new ArrayList<>();
	}

	public void add() {
		System.out.print("Device name: ");
		String name = HeadQuater.sc.nextLine();
		System.out.print("How many watts? : ");
		int watt = Integer.parseInt(HeadQuater.sc.nextLine());
		this.devices.add(new Device(name, watt));
	}

	public void show() {
		System.out.println(this.name);
		for (int i = 0; i < this.devices.size(); i++) {
			System.out.printf("%d.%s\n", i + 1, devices.get(i).toString());
		}
		System.out.printf("Total Cost (Baht) = %.1f\n", getTotalCost());
	}

	public double getTotalCost() {
		double total = 0;
		for (int i = 0; i < devices.size(); i++) {
			total += devices.get(i).getCost();
		}
		return total;
	}

	public void on_off() {
		System.out.print("Device number?: ");
		int num = Integer.parseInt(HeadQuater.sc.nextLine());
		this.devices.get(num-1).turn();
		this.show();
	}

	public void printBill() {
		System.out.println(this.name);
		System.out.printf("Total Cost (Baht) = %.1f\n", this.getTotalCost());
	}
}
