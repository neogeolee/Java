package p411;

public class AnnoymousExample {
	public static void main(String[] args) {
		
		Annoymous annoy = new Annoymous();
		//익명객체필드 사용
		annoy.field.turnOn();
		//익명객체 로컬변수사용
		annoy.method1();
		//익명객체 매개값 사용
		annoy.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 급니다.");
					}
				}
				);
		
	}//main end

}
