package at_1_1;

public class TestCircle extends Circle{
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		System.out.println("O circulo tem raio de "
		+ c1.getRadius() + " e área de " + c1.getArea());
		
		//System.out.println(c1.radius);
		// A ação não pode ocorrer porque o atributo está definido como private
		
		Circle c2 = new Circle(2.0);
		
		System.out.println("O circulo tem raio de "
		+ c2.getRadius() + " e área de " + c2.getArea());
		
		Circle c3 = new Circle(4, "yellow");
		
		System.out.println("O circulo tem raio de "+ c3.getRadius() + " e a cor é: " + c3.getColor());
		
		Circle c4 = new Circle();
		
		c4.setRadius(5.5);
		
		System.out.println("Radius é: " + c4.getRadius());
		
		c4.setColor("yellow");
		
		System.out.println("Color: " + c4.getColor());
		
		Circle c5 = new Circle(5.5);
		
		System.out.println(c5.toString());
		
		
		Circle c6 = new Circle(6.6);
		System.out.println(c6.toString()); // explicit call
		System.out.println(c6); // println() calls toString() implicitly, same as above
		System.out.println("Operator "+" invokes toString() too: " + c6); // '+' invokes toString() too

		
		
	}

}
