package house;

public class Device{
	private String name;
	private int watt;
	private boolean isOn;
	private long start; //when the device is set to "On"
	private long stop; //when the device is set to "Off"
	private long upTime; //time of the current turning-on status
	private int allTime;//when the device is off,sum duration
	private double usage;
	private final double rate = 10.0;
	
	Device(String name,int watt,boolean isOn){
		this.name = name;
		this.watt = watt;
		this.isOn = isOn;
		this.upTime = 0;
		this.allTime = 0;
		this.usage = 0;
	}
	
	void setUsage(int usage){
		this.usage = usage;
	}
	
	double getUsage(){
		return this.usage;
	}
	
	public double getRate(){
		return this.rate;
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
