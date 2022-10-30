import static java.lang.Math.sqrt;
public class Vector {
	private double x;
	private double y;
	
	Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return this.x;
	}
	
	double getY() {
		return this.y;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	void setY(double y) {
		this.y = y;
	}
	
    public Vector scale(double factor) {
    	double newX = getX() * factor;
		double newY = getY() * factor;
		return new Vector(newX, newY);
	}
	
	public Vector subtract(Vector other) {
		double newX= getX() - other.getX();
		double newY = getY() -other.getY();
		return new Vector(newX,newY);
	}
	
   public double length() {
	   double rSqrd = getX()*getX() + getY()* getY();
	   return sqrt(rSqrd);
   }
   
   public Vector add(Vector other) {
	   double newX = getX() + other.getX();
	   double newY = getY() + other.getY();
	   return new Vector(newX,newY);
   }
   
   public void print_vector() {
	   System.out.println("vector x: "+ getX());
	   System.out.println("vector y: "+ getY());
	   System.out.println("vector x: "+ this.length());
   }
   
   
	
}
