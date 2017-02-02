//package house_s;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class HouseApp {
//	List<House> houses;
//	static Scanner sc = new Scanner(System.in);
//	
//	void newHouse(){
//		System.out.print("Enter a house name: ");
//		String name = sc.nextLine();
//		String houseName = String.format("House %d : %s", houses.size(),name);
//		this.houses.add(new House(houseName));
//		printHouseName();
//	}
//	
//	void printHouseName(){
//		for(int i=0;i<houses.size();i++){
//			System.out.println("House "+(i+1)+" : "+houses.get(i).name);
//		}
//	}
//	
//	void printBill()
//	public static void main(String args[]){
//		HouseApp ha = new HouseApp();
//		boolean running = true;
//		while(running){
//			System.out.print("(n)ew house, (c)hoose house, (p)rint bill, (q)uit: ");
//			String command = sc.next();
//			switch(command){
//			case "n":
//				ha.newHouse();
//				break;
//			case "c":
//				break;
//			case "p":
//				ha.printBill();
//				break;
//			case "q":
//				running = false;
//				break;
//			default:
//				break;
//			}
//		}
//	}
//}
