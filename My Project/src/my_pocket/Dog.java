package my_pocket;

public class Dog {
	private String name;
	private String color;
	//constructor
	public Dog(){
		this.name = "No Name";
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setName (String name){
		this.name = name;
	}
	public String getColor(){
		return color;
	}
	public String getName(){
		return name;
	}
	public void PrintProp(){
		System.out.println(name);
		System.out.println(color);
	}
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.setName("Dang");
		d1.setColor("Red");
		d1.PrintProp();
		
		Dog d2 = new Dog();
		d2.setName("Dum");
		d2.setColor("Black");
		d2.PrintProp();
	}
}

