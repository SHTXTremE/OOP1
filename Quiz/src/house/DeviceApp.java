package house;

import java.util.Scanner;

public class DeviceApp {
	static int num = 0;
	static int number;
	static Device [] a = new Device[10];
	static Scanner s = new Scanner (System.in);
	static String readString(String prompt){
		System.out.print(prompt);
		return s.next();
	}

	static int readInt(String prompt){
		System.out.print(prompt);
		return s.nextInt();
	}

	static boolean hasDevice(){
		return (num!=0);
	}

	static void showDevice(){

		if(!hasDevice()){
			System.out.println("No Device!");
		}
		else{
			for(int i=0;i<num;i++){
				if(a[i].getIsOn())
					a[i].setUpTime();
				else
					a[i].resetUpTime();
				System.out.println((i+1)+"."+a[i].getName()+" "+a[i].getWatt()+" watts is "+a[i].getOnOff()+" (Current "+a[i].getUpTime()+" hours / All "+a[i].getAllTime()+" hours)");

			}
			System.out.printf("Total cost (Baht) = %.1f\n",cost());
		}

	}

	static double cost(){
		double cost=0;
		for(int i=0;i<num;i++){
			cost += (a[i].getWatt()*a[i].getAllTime()/1000)*a[i].getRate();
		}
		return cost;
	}

	static void setOnOff(){
		number = readInt("Device number? :");
		a[number-1].setIsOn(!a[number-1].getIsOn());
		if(a[number-1].getIsOn()){
			a[number-1].setStart();

		}
		else{
			a[number-1].setStop();
			a[number-1].sumAllTime();
		}
	}

	static void addDevice(){
		String name = readString("Device :");
		int watt = readInt("How many watts? :");
		a[num] = new Device(name,watt,false);
		num++;
	}

	public static void main (String args[]){
		String menu = "";
		boolean running = true;
		while(running){
			System.out.print("(a)dd , (s)how, (o)n/off, (m)ain menu :");
			menu = s.next();
			switch(menu){
			case "a":
				addDevice();
				break;
			case "s":
				showDevice();
				break;
			case "o":
				setOnOff();
				showDevice();
				break;
			case "m":
				running = false;
				break;
			default:
				break;
			}
		}
		
	}
}
