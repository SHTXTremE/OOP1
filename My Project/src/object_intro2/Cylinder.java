package object_intro2;

public class Cylinder {

	/* Attributes or Class Variable */

	private double radius;
	private double height;


	/* Constructor */

	public Cylinder(double radius,double height) {
		this.radius = radius;
		this.height = height;
	}


	/* getRadius() */

	public double getRadius() {
		return radius;
	}


	/* getHeight() */

	public double getHeight() {
		return height;
	}


	/* setRadius() */

	public void setRadius(double newRadius) {
		radius = newRadius;
	}


	/* setHeight() */

	public void setHeight (double newHeight) {
		height = newHeight;
	}


	/* getBaseArea() */

	public double getBaseArea(){
		double baseArea = Math.PI*radius*radius;
		return baseArea;
	}


	/* getVolume() */

	public double getVolume(){
		double volume = getBaseArea()*height;
		return volume;
	}


	/* toString() */

	public String toString (){
		String outputformat = "Radius: %.3f, Height: %.3f";
		return String.format(outputformat, radius,height);
	}


	public static void main (String[] args) { 
		Cylinder c = new Cylinder(4.123,2);
		System.out.println(c.toString());
	}
}
