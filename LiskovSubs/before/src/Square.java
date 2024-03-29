
public class Square extends Rectangle {
	
	public Square(int side) {
		// TODO Auto-generated constructor stub
		// Inherit from base class Rectangle to initialize side var
		super(side, side);
	}
	
	/* 
		Since square is a child class of rectangle --> height and width cannot have different values.
		Then if a developer uses setWidth or setHeight, the left side must be equal to that too.
		--> Those 2 methods must call the same method in its body - setSide
	*/
	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	@Override
	public void setHeight(int height) {
		setSide(height);
	}

	public void setSide(int side) {
		/*  
		This method takes a single value and  
		sets width & height equal to that passed value
		, i.e height = side; width = side
		*/
		super.setHeight(side);
		super.setWidth(side);		
	}
	
}
