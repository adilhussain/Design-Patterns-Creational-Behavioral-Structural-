package CreationalPattern.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape == null) return null;
		if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Square"))
			return new Square();
		else if(shape.equalsIgnoreCase("Rectange"))
			return new Rectangle();
		else return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
