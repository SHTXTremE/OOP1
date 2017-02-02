package object_intro3;

public class Banknote {

	private int value;
	
	public Banknote() {
		this.value = 0;
	}
	
	public Banknote(int value) {
		this.value = value;
	}
	
	public String toString () {
		return this.value + " Baht Banknote";
	}
	
	public void setValue (int value) {
		this.value = value;
	}
	
	public int getValue () {
		return this.value;
	}
}
