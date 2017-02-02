package my_pocket;

class Point{
	
	private double x;
	private double y;
	public Point(double x ,double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public boolean isOnXAxis(){
		return (y==0);
	}
	
	public boolean isOnYAxis(){
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

public class Main {
	public static void main (String[] args){
		Point n = new Point(0,1);
		System.out.println(n.getX());
		System.out.println(n.getY());
		System.out.println(n.isOnXAxis());
		System.out.println(n.isOnYAxis());
		n.translate(1,1);
		System.out.println(n.toString());
	}
}
