public class Main {
	public static void main(String[] args) {
		Vector one = new Vector(4.00,4.00);
		one.print_vector();
		one.length();
		System.out.println(" ");
		
		
		//Rectangle test
		Vector v1 = new Vector(1.00, 3.00);
		Vector v2 = new Vector(4.00, 5.00);
		Vector point= new Vector(2.00, 4.00);
		Rectangle rect= new Rectangle(v1, v2);
		rect.print_rectangle();
		System.out.println(rect.contains(point));
		System.out.println(" ");
		
		//Cirlce test 
		Circle c1= new Circle(v1,1.55);
		System.out.println(c1.getDiametre());
		System.out.println(c1.getArea());
		System.out.println(c1.contains(v2));
		System.out.println(c1.boundingBox());
		
		
		
		
		
		

	}

}
