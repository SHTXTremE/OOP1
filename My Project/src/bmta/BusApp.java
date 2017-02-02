package bmta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusApp {

	List<Route> routes;

	static Scanner sc = new Scanner (System.in);

	public BusApp(){
		this.routes = new ArrayList<>();
	}

	void newRoute(){
		System.out.print("Enter route name : ");
		String name = sc.nextLine();
		String routeName = String.format("Route %d : %s",routes.size()+1,name);
		this.routes.add(new Route(routeName));
		show();
	}

	void show(){
		if(routes.size()==0){
			System.out.println("No route!!");
		}
		else{
			for(int i = 0 ; i<routes.size() ; i++){
				System.out.println(routes.get(i).name);
			}
		}
	}

	void choose(int routeNum){
		if(routes.size()==0){
			System.out.println("No route!!");
		}
		else if(routeNum-1>=routes.size()){
			System.out.println("Not Availble!!");
		}
		else{
			Route choose = this.routes.get(routeNum-1);
			boolean running = true;
			while(running){
				System.out.print("(a)dd bus , (p)rint , (r)un/stop , (m)ain menu : ");
				String option = sc.nextLine();
				switch(option){
				case "a":
					choose.add();
					break;
				case "p":
					choose.print();
					break;
				case "r":
					choose.changeStatus();
					choose.print();
					break;
				case "m":
					return;
				default:
					break;
				}
			}
		}
	}

	public static void main(String args[]){
		BusApp ba = new BusApp();
		boolean running = true;
		while(running){
			System.out.print("(n)ew Route , (s)how , (c)hoose , (q)uit : ");
			String command = sc.nextLine();
			switch(command){
			case "n":
				ba.newRoute();
				break;
			case "s":
				ba.show();
				break;
			case "c":
				System.out.print("Enter a route number : ");
				int routeNum = Integer.parseInt(sc.nextLine());
				ba.choose(routeNum);
				break;
			case "q":
				System.out.println("Bye!");
				running = false;
				break;
			default:
				break;
			}
		}
	}
}
