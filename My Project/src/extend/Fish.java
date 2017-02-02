package extend;
class Animal{
	boolean hasEye = true;
	int leg;
	Animal(int leg){
		this.leg = leg;
	}
	
	void setSound(){
		System.out.println("Hooooo");
	}
}

//class Dog extends Animal{
//	boolean hasHair = true;
//	public Dog(){
//		super(4);
//	}
//	public static void main(String[] args){
//		Dog d = new Dog();
//		System.out.println(d.hasEye+" "+d.leg+" "+d.hasHair);
//		d.setSound();
//	}
//}

class Fish extends Animal{
	boolean hasHair = false;
	public Fish(){
		super(0);
	}
	@Override
	void setSound(){
		System.out.println("possible?");
	}
	public static void main(String[] args){
		Fish f = new Fish();
		System.out.println(f.hasEye+"  "+f.leg+" "+f.hasHair);
		f.setSound();
	}
}
