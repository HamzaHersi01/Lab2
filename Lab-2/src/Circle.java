public class Circle {
	Vector centre;
	double radius;

	Circle(Vector centre, double radius){
		this.centre = centre;
		this.radius = radius;
	}

	double getDiametre(){
		return this.radius * 2;
	}

	double getArea(){
		return Math.PI * this.radius;
	}

	boolean contains(Vector other){
		Vector offset= other.subtract(this.centre);
		return offset.length() <= this.radius;
	}

	Rectangle boundingBox() {
		double cx = this.centre.getX();
		double cy = this.centre.getY();
		Vector p1= new Vector(cx-this.radius,cy-this.radius);
		Vector p2= new Vector(cx+this.radius,cy+this.radius);
		return new Rectangle(p1,p2);
	}

}
