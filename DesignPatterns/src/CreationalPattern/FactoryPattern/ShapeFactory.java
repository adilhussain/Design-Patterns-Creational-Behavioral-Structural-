package CreationalPattern.FactoryPattern;

public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null)
			return null;
		else{
			if(shapeType.equalsIgnoreCase("Circle"))
				return new Circle();
			else if(shapeType.equalsIgnoreCase("Square"))
				return new Square();
			else if(shapeType.equalsIgnoreCase("Rectange"))
				return new Rectangle();
			else return null;
			
		}
	}
}
