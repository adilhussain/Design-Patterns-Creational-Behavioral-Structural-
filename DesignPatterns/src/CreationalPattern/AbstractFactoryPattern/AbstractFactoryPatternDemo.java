package CreationalPattern.AbstractFactoryPattern;
/************
 * 
 * 
 * Abstract Factory patterns work around a super-factory which creates
 *  other factories. This factory is also called as factory of factories.
 *  This type of design pattern comes under creational pattern as
 *   this pattern provides one of the best ways to create an object.
 *   
 *   
In Abstract Factory pattern, an interface is responsible for creating a 
factory of related objects without explicitly specifying their classes.
 Each generated factory can give the objects as per the Factory pattern.
 * 

 * @author adil.hussain
 *
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Circle circle = (Circle) shapeFactory.getShape("Circle");
		ColorFactory colorFactory = new ColorFactory();
		Red red = (Red) colorFactory.getColor("Red");
		circle.draw();
		red.paint();
	}
}
