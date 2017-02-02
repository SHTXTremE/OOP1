package object_intro2;

public class Circle {

	private double x;
	private double y;
	private double radius;
	public Circle(){
		x=0;
		y=0;
		radius=0;
	}
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void setCenterX(double x){
		this.x = x;
	}
	
	public void setCenterY(double y){
		this.y = y;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getCenterX(){
		return x;
	}
	
	public double getCenterY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getPerimeter(){
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public double getArea(){
		double area = Math.PI*radius*radius;
		return area;
	}
	
	public String toString(){
		return "Center: ("+x+", "+y+"), Radius: "+radius;
	}
	
	public static void main(String[] args){
		Circle c = new Circle(4,4,2);
		System.out.println(c.toString());
	}
}
