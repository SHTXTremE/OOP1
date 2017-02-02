package bmta;

import java.util.ArrayList;
import java.util.List;

public class Route {
	
	String name;
	List<Bus> bus;

	public Route(String name) {
		this.name = name;
		this.bus = new ArrayList<>();
	}

	public void add() {
		System.out.print("Bus code: ");
		String name = BusApp.sc.nextLine();
		this.bus.add(new Bus(name));
	}

	public void show() {
		System.out.println(this.name);
		for (int i = 0; i < this.bus.size(); i++) {
			System.out.printf("%d.%s\n", i + 1, bus.get(i).toString());
		}
	}

	public void run_stop() {
		System.out.print("Bus Number?: ");
		int num = Integer.parseInt(BusApp.sc.nextLine());
		this.bus.get(num-1).turn();
		this.show();
	}
}
