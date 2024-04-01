
public class Main {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		System.out.printf("\nArea of rectangular: %d", rec.calculateArea());
		
		Square sqr = new Square(10);
		System.out.printf("\nArea of square: %d", sqr.calculateArea());
		
		useRectangle(rec);

		// Violate LSP as objects of a superclass cannot be replaceable with objects of its subclasses
		useSquare(sqr);
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
	
	private static void useSquare(Square square) {
		square.setSide(10);
		assert square.getSide() == 10: "Side not equal to 10";
	}
}
