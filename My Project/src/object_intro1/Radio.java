package object_intro1;

public class Radio {
	
	private String mode;
	private double frequency;
	private boolean a;
	private double y;
	
	public Radio(){
		mode = "FM";
		frequency = 87.5;
	}
	
	public void setMode(String mode){
		this.mode = mode;
		if(this.mode.equals("FM"))
			frequency = 87.5;
		else
			frequency = 150;
	}
	
	public void setFrequency(double frequency){
		if(mode.equals("FM")){
			if(frequency>=87.5&&frequency<=108)
				this.frequency = frequency;
		}
		else{
			if(frequency>=150&&frequency<=280)
				this.frequency = frequency;
		}
			
	}
	
	public String getMode(){
		return this.mode;
	}
	
	public double getFrequency(){
		return this.frequency;
	}
	
	public boolean adjustFrequency(double x){
		y = frequency+x;
		if(mode.equals("FM")){
			if(y>=87.5&&y<=108){
				frequency = frequency+x;
				a=true;
			}
			else
				a=false;
		}
		else{
			if(y>=150&&y<=280){
				frequency = frequency+x;
				a=true;
			}
			else
				a=false;
		}
		if(x==0)
			a=false;
		//System.out.println(a);
		return a;
	}
	
	public String toString(){
		if(mode.equals("FM"))
			return mode+" Radio: "+frequency+" MHz";
		else
			return mode+" Radio: "+frequency+" kHz";
	}
	
	public static void main (String[] args){
		Radio r = new Radio();
		r.setMode("FM");
		r.setFrequency(105.5);
		r.adjustFrequency(3);
		System.out.println(r.toString());
	}
}
