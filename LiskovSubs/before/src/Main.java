
public class Main {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		System.out.printf("\nArea of rectangular: %d", rec.calculateArea());
		
		Square sqr = new Square(10);
		System.out.printf("\nArea of square: %d", sqr.calculateArea());
		
		useRectangle(rec);

		// Violate LSP as objects of a superclass cannot be replaceable with objects of its subclasses
		useRectangle(sqr);
	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height not equal to 20";
		assert rectangle.getWidth() == 30 : "Width not equal to 30";

		/*
		 * When we pass a square object to the rectangle parameter
		 * the program will collapse. That's why the Liskov Substitution is violated
		 */
	}
}

/*
 * AFTERWARDS
Area of rectangular: 200
Area of square: 100
Exception in thread "main" java.lang.AssertionError: Height not equal to 20
	at Main.useRectangle(Main.java:19)
	at Main.main(Main.java:13)
 */
