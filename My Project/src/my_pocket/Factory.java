package my_pocket;

public class Factory {
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.setName("Jonh");
		e1.setDept("Sales");
		e1.setSalary(30000);
		System.out.println(e1.getName() + e1.getDept() + e1.getSalary());
		
		Employee e2 = new Employee();
		System.out.println(e2.getName() + e2.getDept() + e2.getSalary());
	}
}
class Employee{
	private String name;
	private String dept;
	private int salary;
	public Employee(){
		this.name = "No name";
		this.dept = "Undefined";
		this.salary = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public String getName(){
		return name;
	}
	public String getDept(){
		return dept;
	}
	public int getSalary(){
		return salary;
	}

}

