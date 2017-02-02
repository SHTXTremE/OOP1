package object_intro3;

public class PointApp {
	
	public static void main(String[] args){
		Point p1 = new Point(20,100);
		Point p2 = new Point(-40,50);
		System.out.println(p1.isOnXaxis());
		System.out.println(p2.isOnYaxis());
		p1.translate(-60, -50);
		System.out.println(p1.equals(-40, 50));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
