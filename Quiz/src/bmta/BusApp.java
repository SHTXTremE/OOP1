package bmta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusApp {

	public static Scanner sc = new Scanner(System.in);
	List<Route> routes;

	public BusApp() {
		this.routes = new ArrayList<>();
	}

	public void newRoute(){
		System.out.print("Enter route name : ");
		String name = sc.nextLine();
		String routeName = String.format("Route %d : %s",routes.size()+1,name);
		this.routes.add(new Route(routeName));
		printRoute();
	}
	
	public void printRoute(){
		for(int i = 0 ; i<routes.size() ; i++){
			System.out.println(routes.get(i).name);
		}
	}
	
	public static void main(String[] args) {
		BusApp ba = new BusApp();
		boolean running = true;
		while (running) {
			System.out.print("(n)ew Route ,(s)how, (c)hoose, (q)uit : ");
			String option = sc.nextLine();
			switch (option) {
			case "n":
				ba.newRoute();
				break;
			case "s":
				ba.printRoute();
				break;
			case "c":
				System.out.print("Enter a route number: ");
				int routeNum = Integer.parseInt(sc.nextLine());
				ba.chosedRoute(routeNum);
				break;
			case "q":
				System.out.println("BYE.");
				running = false;
			default:
				break;
			}
		}

	}

	public void chosedRoute(int routeNum) {
		Route chosenRoute = this.routes.get(routeNum - 1);
		while (true) {
			System.out.print("(a)dd bus, (p)rint, (r)un/stop, (m)ain menu: ");
			String option = sc.nextLine();
			switch (option) {
			case "a":
				chosenRoute.add();
				break;
			case "p":
				chosenRoute.show();
				break;
			case "r":
				chosenRoute.run_stop();
				break;
			case "m":
				return;
			default:
				break;
			}
		}
	}
}
