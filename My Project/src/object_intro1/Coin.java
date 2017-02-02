package object_intro1;

public class Coin {

	public int value; 
	
	public Coin() {
		this.value = 0;
	}
	
	public Coin(int value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value + " Baht Coin"; 
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
