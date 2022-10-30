//import Vector;
public class Rectangle {

	private Vector v1; 
	private Vector v2;

	Rectangle(Vector v1, Vector v2){
		this.v1 = v1;
		this.v2 = v2;
	}

	double getwidth(){
		return this.v2.getX() - this.v1.getX();
	}

	double getheight(){
		return this.v2.getY()- this.v1.getY();
	}

	double getarea(){
		return this.getwidth() * this.getheight();
	}

	Vector getcentre(){
		return this.v1.add(this.v2).scale(0.5);
	}

	void print_rectangle(){
		System.out.println("Vector v1: ");
		this.v1.print_vector();
		System.out.println(" ");
		System.out.println("Vector v2: ");
		this.v2.print_vector();
	}
	boolean contains(Vector other) {
		return (((v1.getX() <= other.getX()) && (other.getX() <= v2.getX())) &&
				((v1.getY() <= other.getY()) && (other.getY() <= v2.getY())));
	}

}
