package p244;

public class Singleton {
	
	//정적필드
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적메소드
	public static Singleton getInstance() {
		return singleton;
	}
		
	

}
