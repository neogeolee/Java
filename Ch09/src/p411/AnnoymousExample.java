package p411;

public class AnnoymousExample {
	public static void main(String[] args) {
		
		Annoymous annoy = new Annoymous();
		//�͸�ü�ʵ� ���
		annoy.field.turnOn();
		//�͸�ü ���ú������
		annoy.method1();
		//�͸�ü �Ű��� ���
		annoy.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV�� �޴ϴ�.");
					}
				}
				);
		
	}//main end

}
