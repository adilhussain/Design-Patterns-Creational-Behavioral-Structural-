package CreationalPattern.AbstractFactoryPattern;

public class FactoryProducer {
	public AbstractFactory getAbstractFactory(String factoryType){
		if(factoryType == null)
			return null;
		if("SHAPE".equalsIgnoreCase(factoryType)){
			return new ShapeFactory();
		}
		else if("Color".equalsIgnoreCase(factoryType)){
			return new ColorFactory();
		}else return null;
	}
}
