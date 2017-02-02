package house;

import java.util.Scanner;

public class HouseApp {
	static int num = 0;
	static int number = 0;
	static House h[] = new House[10];
	static DeviceApp d = new DeviceApp();
	static Scanner s = new Scanner(System.in);
	
	static int readInt(String in){
		System.out.print(in);
		return s.nextInt();
	}
	
	static String readString(String in){
		System.out.print(in);
		return s.next();
	}
	
	static boolean hasHouse(){
		return (num!=0);
	}
	
	static void addHouse(){
		String name = readString("Enter a house name: ");
		h[num] = new House(name);
		num++;
	}
	
	static void showHouse(){
		if(!hasHouse()){
			System.out.println("No house!");
		}
		else{
			for(int i=0;i<num;i++){
				System.out.println("House "+(i+1)+" : "+h[i].getName());
			}
		}
	}
	
	static void chooseHouse(){
		number = readInt("Enter a house number : ");
		h[number-1].getObject(d.getClass());
	}

	public static void main(String args[]){
		boolean running = true;
		while(running){
			String command = readString("(n)ew house, (c)hoose house, (p)rint bill, (q)uit: ");
			switch(command){
			case "n":
				addHouse();
				showHouse();
				break;
			case "c":
				chooseHouse();
				DeviceApp.main(args);
				break;
			case "p":
				showHouse();
				break;
			case "q":
				running = false;
				break;
			default:
				break;
			}
		}
		System.out.print("Bye!");
	}
}
