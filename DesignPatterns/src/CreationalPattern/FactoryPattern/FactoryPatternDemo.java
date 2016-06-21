package CreationalPattern.FactoryPattern;
/*********
 * 
 * 
 * In Factory pattern, we create objects without exposing the 
 * creation logic to the client and refer 
 * to newly created object using a common interface.
 * 
 * 
 * 
 * @author adil.hussain
 *
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeKing = new ShapeFactory();
		Circle circle = (Circle) shapeKing.getShape("Circle");
		circle.draw();
		Square square = (Square)shapeKing.getShape("Square");
		square.draw();
		
	}
}
