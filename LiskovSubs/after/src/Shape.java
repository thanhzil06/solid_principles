
public interface Shape {
	// Only have common behavior of rectangle and square
	// which is calculateArea
	public int calculateArea();
	// Two classes above now don't have a direct relationship anymore
	// and they both implement same Interface called Shape
}
