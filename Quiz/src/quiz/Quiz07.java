package quiz;

import java.util.Scanner;

//class Appliance {
//
//	private String deviceName="";
//	private boolean isOn=false;
//	
//	public Appliance(String deviceName,boolean isOn){
//		this.deviceName = deviceName;
//		this.isOn=isOn;
//	}
//	
//	public String getDeviceName(){
//		return deviceName;
//	}
//	
//	public boolean getIsOn(){
//		return isOn;
//	}
//	
//	public String showStatus(){
//		if(getIsOn()==true)
//			System.out.println(getDeviceName() + " is On.");
//		else
//			System.out.println(getDeviceName() + " is Off.");
//		return "";
//	}	
//}
//
//public class Quiz07 {
//	
//public static Scanner input = new Scanner (System.in);
//	
//	public static void main (String args[]){
//		Appliance [] a = new Appliance[5]; 
//		String command = "";
//		int i = -1;
//		boolean isOn = false;
//		do{
//			System.out.print("(a)dd , (s)how, (q)uit :");
//			command = input.next();
//			if(!command.equals("q")){
//				if(command.equals("a")){
//					i++;
//					System.out.print("Device name :");
//					input.nextLine();
//					String device = input.nextLine();
//					a[i] = new Appliance(device,isOn);
//				}
//			}
//			if(command.equals("s"))
//			{
//				if(i>-1){
//					for(int j = 0 ; j<=i ; j++){
//					System.out.print(a[j].showStatus());
//					}
//				}
//				else{
//					System.out.println("No Device!");
//				}
//			}
//		}while(!command.equals("q"));
//		System.out.println("Bye!");
//	}
//}








//class Appliance {
//
//	private String deviceName="";
//	private boolean isOn=false;
//	
//	public Appliance(boolean isOn){
//		this.isOn = isOn;
//	}
//	
//	public Appliance(String deviceName,boolean isOn){
//		this.deviceName = deviceName;
//		this.isOn=isOn;
//	}
//	
//	public String getDeviceName(){
//		return deviceName;
//	}
//	
//	public boolean getIsOn(){
//		return isOn;
//	}
//	
//	public String showStatus(){
//		if(getIsOn()==true)
//			System.out.println(getDeviceName() + " is On.");
//		else
//			System.out.println(getDeviceName() + " is Off.");
//		return "";
//	}	
//}
//
//public class Quiz07 {
//	
//public static Scanner input = new Scanner (System.in);
//	
//	public static void main (String args[]){
//		Appliance [] a = new Appliance[5];
//		String [] b = new String [5];
//		String command = "";
//		int i = -1;
//		boolean isOn = false;
//		do{
//			System.out.print("(a)dd , (s)how, (o)n/off, (q)uit :");
//			command = input.next();
//			if(!command.equals("q")){
//				if(command.equals("a")){
//					i++;
//					System.out.print("Device name :");
//					input.nextLine();
//					String device = input.nextLine();
//					b[i] = device;
//					a[i] = new Appliance(device,isOn);
//				}
//			}
//			if(command.equals("o")){
//				if(i>-1){
//					System.out.print("Device number? :");
//					int k = input.nextInt();
//					if(a[k-1].getIsOn()==true)
//						a[k-1] = new Appliance(b[k-1],false);
//					else
//						a[k-1] = new Appliance(b[k-1],true);
//					for(int j = 0 ; j<=i ; j++){
//						System.out.print(j+1+".");
//						System.out.print(a[j].showStatus());
//						}
//					
//				}
//				else{
//					System.out.println("No Device!");
//				}
//			}
//			if(command.equals("s"))
//			{
//				if(i>-1){
//					for(int j = 0 ; j<=i ; j++){
//						System.out.print(j+1+".");
//						System.out.print(a[j].showStatus());
//					}
//				}
//				else{
//					System.out.println("No Device!");
//				}
//			}
//		}while(!command.equals("q"));
//		System.out.println("Bye!");
//	}
//}








class Appliance {

	private String deviceName="";
	private boolean isOn=false;
	private long start,stop,duration;
	
	public Appliance(){
		
	}
	
	public Appliance(String deviceName,boolean isOn){
		this.deviceName = deviceName;
		this.isOn=isOn;
	}
	
	public String getDeviceName(){
		return deviceName;
	}
	
	public boolean getIsOn(){
		return isOn;
	}
	
	public String showStatus(){
		if(getIsOn()==true)
			System.out.println(getDeviceName() + " is On sec)");
		else
			System.out.println(getDeviceName() + " is Off sec)");
		return "";
	}
}

public class Quiz07 {
	
public static Scanner input = new Scanner (System.in);
	
	public static void main (String args[]){
		Appliance [] a = new Appliance[5];
		String [] b = new String [5];
		Appliance c = new Appliance();
		String command = "";
		int i = -1;
		boolean isOn = false;
		do{
			System.out.print("(a)dd , (s)how, (o)n/off, (q)uit :");
			command = input.next();
			if(!command.equals("q")){
				if(command.equals("a")){
					i++;
					System.out.print("Device name :");
					input.nextLine();
					String device = input.nextLine();
					b[i] = device;
					a[i] = new Appliance(device,isOn);
				}
			}
			if(command.equals("o")){
				if(i>-1){
					System.out.print("Device number? :");
					int k = input.nextInt();
					if(a[k-1].getIsOn()==true){
						a[k-1] = new Appliance(b[k-1],false);
						
					}
					else{
						a[k-1] = new Appliance(b[k-1],true);
						
					}
					
					for(int j = 0 ; j<=i ; j++){
						System.out.print(j+1+".");
						System.out.print(a[j].showStatus());
						}
					
				}
				else{
					System.out.println("No Device!");
				}
			}
			if(command.equals("s"))
			{
				if(i>-1){
					for(int j = 0 ; j<=i ; j++){
						System.out.print(j+1+".");
						System.out.print(a[j].showStatus());
					}
				}
				else{
					System.out.println("No Device!");
				}
			}
		}while(!command.equals("q"));
		System.out.println("Bye!");
	}
}


