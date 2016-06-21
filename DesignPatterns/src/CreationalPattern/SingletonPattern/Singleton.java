package CreationalPattern.SingletonPattern;

public class Singleton {
	private Singleton(){};
	public static Singleton singObj = new Singleton();
	public static Singleton getInstance(){
		return singObj;
	}
	public static void method(){
		System.out.println("method of singleton class called");
	}
	
		
	
}
