package p383;

public interface ChildInterface2 extends ParentsInterface{
	
	@Override
	public default void method2() {
		System.out.println("childinterface2 method2...");		
	}
	
	public void method3();

}
