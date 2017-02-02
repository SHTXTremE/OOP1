package bmta;

import java.util.ArrayList;
import java.util.List;

public class Route {

	List<Bus> bus;

	String name;

	public Route(String name){
		this.bus = new ArrayList<>(); 
		this.name = name;
	}

	public void add(){
		System.out.print("Bus code : ");
		String name = BusApp.sc.nextLine();
		bus.add(new Bus(name));
	}

	public void print(){
		System.out.println(this.name);
		if(bus.size()==0){
			System.out.println("No Bus!!");
		}
		else{
			for(int i = 0 ; i<bus.size() ; i++){
				System.out.printf("%d.%s\n",i+1,bus.get(i).toString());
			}
		}
	}

	public void changeStatus(){
		if(bus.size()==0){
			System.out.println("No Bus!!");
		}
		else{
			System.out.print("Bus Number? : ");
			int busNum = Integer.parseInt(BusApp.sc.nextLine());
			this.bus.get(busNum-1).run_stop();
		}
	}
}
