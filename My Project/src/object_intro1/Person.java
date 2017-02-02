package object_intro1;
//elab-source: Person.java

public class Person {
	
	String ID;
	String name;
	String lastname;
	String gender;
	int age;
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString () {
		return this.ID + ", " + this.name + " " + this.lastname + ", " + this.gender + ", " + this.age;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Person(String ID,String name,String lastname,String gender,int age) {
		this.ID = ID;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	
	public Person(){
		ID = "101";
		name = "John";
		lastname = "Smith";
		gender = "M";
		age = 18;
	}
	
	public static void main (String[] args) {
		Person p2 = new Person("102", "Mary", "Davis", "F", 20);
		Person p = new Person();
	}
}
