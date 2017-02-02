package object_intro3;

public class Line {

	private double slope,yIntersept;
	private Point startPoint,endPoint;
	
	public Line(){
		
	}
	
	public Line(double x1,double y1,double x2,double y2){
		startPoint = new Point(x1,y1);
		endPoint = new Point(x2,y2);
		slope = (y2-y1)/(x2-x1);
		yIntersept = (y2-y1) - (slope*(x2-x1));
	}
	
	public boolean contains(double x,double y){
		if(y == (slope*x)+yIntersept){
			if(slope > 0){
				return (x>=startPoint.getX() && x<=endPoint.getX() && y>=startPoint.getY() && y<=endPoint.getY());
			}
			else
			{
				return (x<=startPoint.getX() && x>=endPoint.getX() && y<=startPoint.getY() && y>=endPoint.getY());
			}
		}
		else{
			return false;
		}
	}
	
	public double getDistance(){
		double distance = Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2)+Math.pow(endPoint.getY() - startPoint.getY(), 2));
		return distance;
	}
	
	public double getX1(){
		return startPoint.getX();
	}
	
	public double getY1(){
		return startPoint.getY();
	}
	
	public double getX2(){
		return endPoint.getX();
	}
	
	public double getY2(){
		return endPoint.getY();
	}
	
	public double getY(double x){
		double y = (slope * x) + yIntersept;
		if(slope>0){
			if(x>=startPoint.getX() && x<=endPoint.getX() && y>=startPoint.getY() && y<=endPoint.getY()){
				return y;
			}
			else{
				return -999.999;
			}
		}
		else{
			if(x<=startPoint.getX() && x>=endPoint.getX() && y<=startPoint.getY() && y>=endPoint.getY()){
				return y;
			}
			else{
				return -999.999;
			}
		}
	}
}
