package quiz;

import java.util.Scanner;

class House{
	private double usage;
	private final double rate = 10.0;
	House(){
		this.usage = 0;
	}
	
	void setUsage(int usage){
		this.usage = usage;
	}
	
	double getUsage(){
		return this.usage;
	}
	
	double getRate(){
		return this.rate;
	}
}

class Device extends House{
	private String name;
	private int watt;
	private boolean isOn;
	private long start; //when the device is set to "On"
	private long stop; //when the device is set to "Off"
	private long upTime; //time of the current turning-on status
	private int allTime;//when the device is off,sum duration

	Device(String name,int watt,boolean isOn){
		this.name = name;
		this.watt = watt;
		this.isOn = isOn;
		this.upTime = 0;
		this.allTime = 0;
	}

	public String getName(){
		return this.name;
	}

	public int getWatt(){
		return this.watt;
	}

	boolean getIsOn(){
		return this.isOn;
	}

	public void setIsOn(boolean isOn){
		this.isOn = isOn;
	}

	void setStart(){
		this.start = System.currentTimeMillis();
	}

	void setStop(){
		this.stop = System.currentTimeMillis();
	}

	void sumAllTime(){
		this.allTime += (this.stop - this.start)/1000;
	}

	int getAllTime(){
		return this.allTime;
	}

	long getStart(){
		return this.start;
	}

	long getStop(){
		return this.stop;
	}

	void setUpTime(){
		this.upTime = (System.currentTimeMillis()-this.start)/1000;
	}

	long getUpTime(){
		return this.upTime;
	}

	void resetUpTime(){
		this.upTime = 0;
	}

	public String getOnOff(){
		if(isOn){
			return "On";
		}
		return "Off";
	}
}


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
				System.out.println((i+1)+"."+a[i].getName()+" "+a[i].getWatt()+" watts is "+a[i].getOnOff()+" (Current "+a[i].getUpTime()+" seconds / All "+a[i].getAllTime()+" second)");
				
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
			System.out.print("(a)dd , (s)how, (o)n/off, (q)uit :");
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
