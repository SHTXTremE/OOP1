
public class OverTime {

	double otRate;
	int hour;
	
	public OverTime(){
		this.otRate = 100;
		this.hour = 1;
	}
	
	public OverTime(double otRate) {
		this.otRate = otRate;
		this.hour = 1;
	}

	public OverTime(double otRate,int hour){
		this.otRate = otRate;
		this.hour = hour;
	}
	
	public OverTime(OverTime t) {
		this.otRate = t.otRate;
		this.hour = t.hour;
	}

	double calOT(){
		return otRate * hour;
	}
	
	public static void main(String[] args){
		OverTime o1 = new OverTime();
		System.out.println(o1.calOT());
		
		OverTime o2 = new OverTime(230.50);
		System.out.println(o2.calOT());
		
		OverTime o3 = new OverTime(200,3);
		System.out.println(o3.calOT());
		
		OverTime o4 = new OverTime(150,2);
		OverTime o5 = new OverTime(o4);
		System.out.println(o5.calOT());
	}
}
