package p407;

public class AnnoymousExample {
	public static void main(String[] args) {
		
		Annoymous annoy = new Annoymous();
		//익명객체 필드 사용
		annoy.field.wake();
		//익명객체 로컬변수사용
		annoy.method1();
		//익명 객체 매개값 사용
		annoy.method2(
				new Person() {
				public void study() {
					System.out.println("공부합니다.");
				}
				@Override
				public void wake() {
					System.out.println("8시에 일어납니다.");
					study();
					}
				}
				);
		
	}//main end

}
