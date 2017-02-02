//package quiz;
//
//import java.util.Scanner;
////public class Appliance {
////
////	private String deviceName="";
////	private int watt=0;
////	private boolean isOn=true;
////	
////	public Appliance(S
////tring deviceName,int watt,boolean isOn){
////		this.deviceName = deviceName;
////		this.watt = watt;
////		this.isOn=isOn;
////	}
////	
////	public String getDeviceName(){
////		return deviceName;
////	}
////	
////	public int getWatt(){
////		return watt;
////	}
////	
////	public boolean getIsOn(){
////		return isOn;
////	}
////	
////	public String showStatus(){
////		if(getIsOn()==true)
////			System.out.println(getDeviceName() + " " + getWatt() + " Watts is On.");
////		else
////			System.out.println(getDeviceName() + " " + getWatt() + " Watts is Off.");
////		return "";
////	}
////	
////	
////	public static void main (String args[]){
////		Appliance a1 = new Appliance("Fan",200,true);
////		a1.showStatus();
////		Appliance a2 = new Appliance("TV",300,false);
////		a2.showStatus();
////	}
////}
//
//public class Appliance {
//
//	private String deviceName="";
//	private int watt=0;
//	private boolean isOn=true;
//	
//	public Appliance(String deviceName,int watt,boolean isOn){
//		this.deviceName = deviceName;
//		this.watt = watt;
//		this.isOn=isOn;
//	}
//	
//	public String getDeviceName(){
//		return deviceName;
//	}
//	
//	public int getWatt(){
//		return watt;
//	}
//	
//	public boolean getIsOn(){
//		return isOn;
//	}
//	
//	public String showStatus(){
//		if(getIsOn()==true)
//			System.out.println(getDeviceName() + " " + getWatt() + " Watts is On.");
//		else
//			System.out.println(getDeviceName() + " " + getWatt() + " Watts is Off.");
//		return "";
//	}
//	
//	public static Scanner input = new Scanner (System.in);
//	
//	public static void main (String args[]){
//		Appliance [] a = new Appliance[5]; 
//		String command = "";
//		int i = -1;
//		boolean isOn = true;
//		do{
//			System.out.println("(a)dd device, (s)how device , (q)uit");
//			command = input.next();
//			if(!command.equals("q")){
//				if(command.equals("a")){
//					i++;
//					System.out.print("Device name : ");
//					input.nextLine();
//					String device = input.nextLine();
//					System.out.print("Watt : ");
//					int watt = Integer.parseInt(input.nextLine());
//					System.out.print("On or Off? : ");
//					String onoroff = input.next();
//					if(onoroff.equals("On"))
//						isOn =true;
//					else
//						isOn = false;
//					a[i] = new Appliance(device,watt,isOn);
//				}
//			}
//			if(command.equals("s"))
//			{
//				for(int j = 0 ; j<=i ; j++){
//					System.out.print(a[j].showStatus());
//				}
//					
//			}
//		}while(!command.equals("q"));
//		System.out.println("bye");
//	}
//}
