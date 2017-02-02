package object_intro3;

import java.util.Scanner;

public class LineApp {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		double x,x1,x2,y,y1,y2,xv;
		System.out.print("Enter x1 : ");
		x1 = input.nextDouble();
		System.out.print("Enter y1 : ");
		y1 = input.nextDouble();
		System.out.print("Enter x2 : ");
		x2 = input.nextDouble();
		System.out.print("Enter y2 : ");
		y2 = input.nextDouble();
		Line l = new Line(x1,y1,x2,y2);
		System.out.printf("value of x1 on this line is %.3f\n",l.getX1());
		System.out.printf("value of x2 on this line is %.3f\n",l.getX2());
		System.out.printf("value of y1 on this line is %.3f\n",l.getY1());
		System.out.printf("value of y2 on this line is %.3f\n",l.getY2());
		System.out.println("==========");
		System.out.println("Check x and y are on this line ?");
		System.out.print("Enter x : ");
		x = input.nextDouble();
		System.out.print("Enter y : ");
		y = input.nextDouble();
		if(l.contains(x, y)){
			System.out.printf("x = %.3f and y = %.3f are on this line\n",x,y);
		}
		else{
			System.out.printf("x = %.3f and y = %.3f are not on this line\n",x,y);
		}
		System.out.printf("Distance between startPoint and endPoint is %.3f\n",l.getDistance());
		System.out.println("==========\nFind value of y that gives( x , y ) on this line");
		System.out.print("Enter x : ");
		xv = input.nextDouble();
		System.out.printf("value of y is %.3f\n",l.getY(xv));
		if(l.contains(xv, l.getY(xv)))
			System.out.printf("( x , y ) = ( %.3f , %.3f ) on this line",xv,l.getY(xv));
		else
			System.out.printf("( x , y ) = ( %.3f , %.3f ) is not on this line",xv,l.getY(xv));
	}
}
