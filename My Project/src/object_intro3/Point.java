package object_intro3;

public class Point {

	private double x;
	private double y;
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point other){
		
	}
	
	public boolean equals(double x,double y){
		return (this.x==x && this.y==y);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public boolean isOnXaxis(){
		return (y==0);
	}
	
	public boolean isOnYaxis(){
		return (x==0);
	}
	
	public void translate(double distX, double distY){
		x = x+distX;
		y = y+distY;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}
