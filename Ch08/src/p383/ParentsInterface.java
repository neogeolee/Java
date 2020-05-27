package p383;

public interface ParentsInterface {
	
	public void method1();
	public default void method2() {
		System.out.println("parents method2...");
	}

}
