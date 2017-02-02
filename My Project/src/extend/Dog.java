package extend;

class Dog extends Animal{
	boolean hasHair = true;
	public Dog(){
		super(4);
	}
	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println(d.hasEye+" "+d.leg+" "+d.hasHair);
		d.setSound();
	}
}
