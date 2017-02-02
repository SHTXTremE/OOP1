package object_intro1;

public class Car {
	
	private double gas;
	private double burningGasRate;
	
	public Car(){
		gas=0;
		burningGasRate=0;
	}
	
	public Car(double gas, double burningGasRate){
		this.gas = gas;
		this.burningGasRate = burningGasRate;
	}
	
	public void setGas(double gas){
		this.gas = gas;
	}
	
	public void setBurningGasRate(double burningGasRate){
		this.burningGasRate = burningGasRate;
	}
	
	public double getGas(){
		return gas;
	}
	
	public double getBurningGasRate(){
		return burningGasRate;
	}
	
	public double drive(double distance){
		gas = gas - (distance/burningGasRate);
		return gas;
	}
	
	public void fillGas(double newGas){
		gas = gas+newGas;
	}
	
	public String toString(){
		return "Gas: " + gas + ", Burning rate: " + burningGasRate;
	}
	
	public static void main (String[] args) {
		Car g = new Car(200,4);
		g.drive(50);
		g.fillGas(0);
		System.out.println(g.toString());
	}
}
