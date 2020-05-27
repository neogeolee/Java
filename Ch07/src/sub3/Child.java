package sub3;

public class Child extends Parents{
	
	/*
	 * 부모클래스의 method1에 final 선언으로 Override 할 수없다(주석태그 지워도 안된다)
	@Override
	public void method1() {
		System.out.println("Child - method1...");
	}
	*/
	@Override
	public void method2() {
		System.out.println("Child - method2...");
	}
	@Override
	public void method3(int a) {
		System.out.println("Child - method3...");
	}

}
