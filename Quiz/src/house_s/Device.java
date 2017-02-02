package house_s;

public class Device {
	String name;
	int watt;
	boolean isOn;
	int alltime;
	
	public Device(String name,int watt){
		this.name = name;
		this.watt = watt;
		this.isOn = false;
	}
	
	public void turn(){
		isOn = !isOn;
	}
	
	public String isOn(){
		if(isOn)
			return "On";
		else
			return "Off";
	}
	
}
