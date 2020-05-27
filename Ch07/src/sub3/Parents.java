package sub3;

public class Parents extends GrandParents{
	
	@Override
	public final void method1() {
		System.out.println("Parents - method1...");
	}
	// Overloading
	public void method2(int a) {
		System.out.println("Parents - method2...");
	}
	
	public void method3() {
		System.out.println("Parents - method3...");
	}

}
