package sub3;

public class Child extends Parents{
	
	/*
	 * �θ�Ŭ������ method1�� final �������� Override �� ������(�ּ��±� ������ �ȵȴ�)
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
